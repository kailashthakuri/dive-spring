package io.ace.springframework.core.resources.java.socket.write;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClientSocket {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            outputStream.writeUTF("Hello Dude!");
            outputStream.flush();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
