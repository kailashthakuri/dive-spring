package io.ace.springframework.core.resources.java.socket.readwrite;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 6666)) {
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String outData = "", inData = "";
            while (!outData.equals("stop")) {
                outData = bufferedReader.readLine();
                outputStream.writeUTF(outData);
                outputStream.flush();

                inData = inputStream.readUTF();
                System.out.println("Server says : " + inData);

            }
            inputStream.close();
            outputStream.close();
            bufferedReader.close();

        } catch (Exception e) {

        }
    }
}
