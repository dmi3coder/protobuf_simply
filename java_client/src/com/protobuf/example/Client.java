package com.protobuf.example;

import com.protobuf.example.NotesProtocol.Envelope;
import com.protobuf.example.NotesProtocol.Envelope.Type;
import com.protobuf.example.NotesProtocol.Note;
import com.protobuf.example.NotesProtocol.NoteType;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by dim3coder on 5/28/17.
 */
public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {
        SocketChannel channel = SocketChannel
            .open(new InetSocketAddress(InetAddress.getByName("127.0.0.1"), 27015));
        Note note = Note.newBuilder()
            .setName("But list")
            .setContent("Buy:\n"
                + "- Beer\n"
                + "- Beef\n"
                + "- Bacon\n"
                + "- Leg for C++ client part")
            .setId(((long) (Math.random() * 900000000)))
            .setType(NoteType.BASIC).build();
        //Change type to make different requests
        Envelope requestEnvelope = Envelope.newBuilder().addNote(note).setType(Type.SAVE_NOTE)
            .build();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(requestEnvelope.toByteArray());
        byteBuffer.flip();
        channel.write(byteBuffer);

        ByteBuffer buf = ByteBuffer.allocate(1024);
        int numBytesRead = channel.read(buf);
        if (numBytesRead == -1) {
            channel.close();
        }
        buf.flip();
        Envelope envelope = Envelope.parseFrom(buf);
        for (Note note1 : envelope.getNoteList()) {
            System.out.println(note1.toByteString().toStringUtf8());
        }
        System.out.println(envelope.getType());

    }

}
