package socket;

import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String ip, msg;
		int port;
		
		System.out.print("������ IP�� �Է� : ");
		ip = sc.nextLine();
		port = 1234;
		
		Socket so = new Socket(ip, port);
		System.out.println("������ ���ӵǾ����ϴ�");
		
		Scanner input = new Scanner(so.getInputStream());
		msg = input.nextLine();
		
		System.out.print("�����κ����� �޽��� : ");
		System.out.println(msg);
		
		input.close();
		so.close();
		sc.close();
		
		System.out.println("== Ŭ���̾�Ʈ ���� ==");
	}
}
