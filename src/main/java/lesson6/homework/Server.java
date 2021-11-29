package lesson6.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {

    public static void main(String[] args) {
        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            new Thread(() -> {
                try {
                    while (true) {
                        String strFromClient = in.readUTF();
                        if (strFromClient.equals("/end")) {
                            break;
                        }
                       out.writeUTF(strFromClient);
                       System.out.println(strFromClient);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(() -> {
                try {
                    int i = 1;
                    while (true) {
                        System.out.println("Введи сообщение для клиента");
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        String strForClient = br.readLine();
                        out.writeUTF("Сервер: " + "сообщение" + i + " :" + strForClient);
                        i++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
