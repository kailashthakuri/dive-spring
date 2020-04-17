package io.ace.springframework.core.resources.java.socket.readwrite;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(6666)) {
            Socket socket = serverSocket.accept();
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


            String outData = "", inData = "";
            while (!inData.equals("stop")) {
                inData = inputStream.readUTF();
                System.out.println("Client Says : " + inData);

                outData = bufferedReader.readLine();
                outputStream.writeUTF(outData);
                outputStream.flush();
            }
            inputStream.close();
            bufferedReader.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {

        }

    }
}
