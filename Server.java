package _class;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(1234);	// 1234�� ��Ʈ�� ����д�
		System.out.println("���� �����...");			
		Socket so = ss.accept();					// ����� �����ϸ� ������ �޴´�
		
		System.out.println("���� !!");
		Scanner sc = new Scanner(so.getInputStream());	// ���Ͽ��� ������ �����͸� �д� ��ĳ��
		while(sc.hasNextLine()) {		// ������ ������
			System.out.println(sc.nextLine());	// ���
		}
		System.out.println("����");
		sc.close();
		so.close();
		ss.close();
	}

}
