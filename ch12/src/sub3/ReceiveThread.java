package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread {

    private Socket socket;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {
                String msg = reader.readLine();

                if (msg == null) {
                    break; // 서버가 연결을 종료하면 null을 반환합니다.
                }

                System.out.println("Received: " + msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
