package com.protobuf.example;

import com.protobuf.example.NotesProtocol.Envelope;
import com.protobuf.example.NotesProtocol.Envelope.Type;
import com.protobuf.example.NotesProtocol.Note;
import com.protobuf.example.NotesProtocol.NoteType;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * Created by dim3coder on 5/28/17.
 */
public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {
        SocketChannel channel = SocketChannel.open(new InetSocketAddress(InetAddress.getByName("127.0.0.1"),27015));
        Note note = Note.newBuilder()
                    .setName("Список покупок")
                    .setContent("Купить:\n"
                        + "- Пивко\n"
                        + "- Сосиски\n"
                        + "- Бекон\n"
                        + "- Ногу для C++ клиента")
                    .setId(((long) (Math.random() * 900000000)))
                    .setType(NoteType.BASIC).build();
        Envelope build = Envelope.newBuilder().addNote(note).setType(Type.SAVE_NOTE).build();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(build.toByteArray());
        byteBuffer.flip();
        channel.write(byteBuffer);

        ByteBuffer buf = ByteBuffer.allocate(1024);
        int numBytesRead = channel.read(buf);
        if(numBytesRead==-1) {
            channel.close();
        }
        buf.flip();
        Envelope envelope = Envelope.parseFrom(buf);
        System.out.println(envelope.getType());

    }

}
