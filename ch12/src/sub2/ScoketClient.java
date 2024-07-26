package sub2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * 날짜 : 24/07/24 이름 : 박준우 내용 : 소켓 통신 실습하기
 */

public class ScoketClient {
	public static void main(String[] args) {

		System.out.println("[Client]");

		Socket socket = null;

		try {
			socket = new Socket();

			System.out.println("연결 요청...");
			socket.connect(new InetSocketAddress("127.0.0.1", 50001));

			System.out.println("연결 성공...");
			
			
			System.out.println("데이터 송신 완료...");
			
			
			OutputStream os = socket.getOutputStream();
			String message = "Hello Server!";
			
			byte[] messageByte = message.getBytes();
			os.write(messageByte);
			os.flush();
			System.out.println("데이터 수ㅠ신 완료...");
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		System.out.println("연결 종료...");
	}
}
