package com.protobuf.example;

import com.protobuf.example.NotesProtocol.Envelope;
import com.protobuf.example.NotesProtocol.Envelope.Type;
import com.protobuf.example.NotesProtocol.Note;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dim3coder on 5/28/17.
 */
public class Server {

    static List<Note> notes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(InetAddress.getByName("127.0.0.1"), 27015));
        while (true) {
            try {
                System.out.println("Waiting for client :P");
                SocketChannel client = serverSocketChannel.accept();
                ByteBuffer buf = ByteBuffer.allocate(1024);
                int numBytesRead = client.read(buf);
                if (numBytesRead == -1) {
                    client.close();
                    continue;
                }
                buf.flip();

                Envelope envelope = Envelope.parseFrom(buf);
                System.out.println(envelope.getNote(0).getContent());
                Envelope responseEnvelope;
                switch (envelope.getType()) {
                    case GET_ALL_NOTES:
                        System.out.println("notes size: " + notes.size());
                    default:
                        responseEnvelope = Envelope.newBuilder().addAllNote(notes)
                            .setType(Type.GET_ALL_NOTES).build();
                        break;
                    case SAVE_NOTE:
                        notes.add(envelope.getNote(0));
                        responseEnvelope = envelope;
                        break;
                    case DELETE_NOTE:
                        notes.removeIf(note -> note.getId() == envelope.getNote(0).getId());
                    case UNRECOGNIZED:
                        responseEnvelope = envelope;
                        break;
                }

                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                byteBuffer.put(responseEnvelope.toByteArray());
                byteBuffer.flip();
                client.write(byteBuffer);

                client.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
