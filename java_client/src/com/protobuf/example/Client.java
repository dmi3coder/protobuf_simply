package com.protobuf.example;

import com.google.protobuf.CodedOutputStream;
import com.protobuf.example.NotesProtocol.Note;
import com.protobuf.example.NotesProtocol.NoteType;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by dim3coder on 5/28/17.
 */
public class Client {


    public static void main(String[] args) throws IOException {
        System.out.print("Let's create new note! \n Name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Content:");
        String content = scanner.nextLine();
        Socket socket = new Socket("127.0.0.1", 27015);
        Note note = Note.newBuilder()
            .setName(name)
            .setContent(content)
            .setId(1)
            .setTime(2050L)
            .setType(NoteType.BASIC).build();
        note.writeTo(socket.getOutputStream());
        socket.close();
    }

}
