package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("서버에 연결되었습니다.");

            // 메시지를 전송하는 스레드
            SendThread sendThread = new SendThread(socket);
            sendThread.start();

            // 메시지를 수신하는 스레드
            ReceiveThread receiveThread = new ReceiveThread(socket);
            receiveThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
