package com.protobuf.example;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.protobuf.example.NotesProtocol.Note;
import com.sun.xml.internal.ws.encoding.MtomCodec.ByteArrayBuffer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * Created by dim3coder on 5/28/17.
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(InetAddress.getByName("127.0.0.1"),27015));
        while (true){
            try {
                System.out.println("Waiting for client :P");
                Socket client = serverSocket.accept();
                Note note = Note.parseFrom(client.getInputStream());
                System.out.println(note.toString());
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

}
