package socket;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws Exception {
		// Ŭ���̾�Ʈ�� ������ �� �ֵ��� ����ϴ� ����
		
		Scanner sc = new Scanner(System.in);	// Ű���� �Է¹ޱ�
		ServerSocket ss = new ServerSocket(1234);
		String msg;
		
		System.out.println("���� �����...");
		Socket so = ss.accept();
		
		System.out.println("����� ����Ǿ����ϴ�");
		System.out.print("Ŭ���̾�Ʈ���� ���� �޽����� �Է� : ");
		msg = sc.nextLine();
		
		PrintWriter pw = new PrintWriter(so.getOutputStream());
		pw.append(msg);
		pw.flush();
		pw.close();
		sc.close();
		ss.close();
		
		System.out.println("== ���� ���� ==");
	}
}
