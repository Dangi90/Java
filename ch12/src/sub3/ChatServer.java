package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(12345)) {
			System.out.println("서버가 시작되었습니다. 클라이언트를 기다리는 중...");

			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트가 연결되었습니다: " + socket.getInetAddress());

				// 클라이언트와의 통신을 위한 스레드 생성
				new ClientHandler(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class ClientHandler extends Thread {
		private Socket socket;

		public ClientHandler(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try {
				PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				String msg;
				while ((msg = reader.readLine()) != null) {
					System.out.println("클라이언트로부터 수신: " + msg);
					writer.println("서버 응답: " + msg); // 클라이언트에게 응답
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
}
