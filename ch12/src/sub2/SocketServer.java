package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 날짜 : 24/07/24 이름 : 박준우 내용 : 소켓 통신 실습하기
 */

public class SocketServer {
    public static void main(String[] args) {
        System.out.println("[Server]");

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost",50001));
            System.out.println("연결 대기...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("연결 성공...");

                //데이터 수신
                InputStream is = socket.getInputStream();
                byte[] buffer = new byte[1024];
                int readByteCount = is.read(buffer);

                if (readByteCount == -1) {
                    throw new IOException("클라이언트 연결이 끊어졌습니다.");
                }

                String message = new String(buffer, 0, readByteCount, "UTF-8");
                System.out.println("데이터 수신 완료...: " + message);

                //데이터 송신
                
                OutputStream os = socket.getOutputStream(); 
                String message1 = "Hello Server!";
                byte[] messageByte = message1.getBytes();
    			os.write(messageByte);
    			os.flush();
                
                socket.close();
                System.out.println("연결 종료...");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null && !serverSocket.isClosed()) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}