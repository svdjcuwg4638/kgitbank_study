package day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		System.out.println(System.in);
		System.out.println(System.out);
		System.out.println(System.err);
		
		InputStream stdin = System.in;		// 0�� ���
		PrintStream stdout = System.out;	// 1�� ���
		PrintStream stderr = System.err;	// 2�� ���
		
		
		System.out.printf("�ƹ�Ű�� �Է��ϼ��� : ");
		int data = System.in.read();	// keyCode�� ������ �Է¹޴´�
		System.out.println("data : "+data);
		System.out.println((char)44032);
		
		// System.in.read()�� 1����Ʈ�� ǥ�� �Է��� ó���ϴ� �Լ��̴�
		
		System.in.read();
		System.in.read();
		
		// �ѱ��� ó���Ҽ� �����Ƿ�, 2����Ʈ �Է��� ó���� �� �ִ� ���ο� �Լ��� ����ϰ� �ȴ�
		// 1����Ʈ �Է��� ó���ϴ� ��ü�� ���� ����Ͽ� 2����Ʈ�� ó���ϴ� ���ο� ��ü�� �����Ѵ�
		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.printf("�ѱ� �ϳ� �Է� : ");
		int num2 = isr.read();
		System.out.println(num2);
		
		// �ѱ��ھ� �Է¹����� ������� �Է��� �ſ� ��ٷӱ� ������ ����ũ��� �Է¹޴� �������� �ٲ۴�
		// 2����Ʈ �Է±⸦ �̿��Ͽ� ������� �Է��� ó���ϴ� ��ü�� �����Ѵ�
		
		BufferedReader br = new BufferedReader(isr);
		br.readLine();	//������ �����ִ� �����͸� �����ͼ� ����
		
		System.out.println("������ �Է��ϼ���");
		String str = br.readLine();
		System.out.println("��� : "+str);
		
		//�ڹ� 1.4 ������ �̷��� �����
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		// �ڹ� 1.5 ���� �Է��� ó���ϴ� ���ο� ��ü�� ����
		Scanner sc = new Scanner(System.in);
		
		// Scanner�� ������ �Ű������� �ִ� ����� �о�� ��ü�̴�
		String path = "C:\\window\\system32\\drivers\\etc\\hosts";
		File f = new File(path);
		Scanner sc2 = new Scanner(f);
		
		while(sc2.hasNextLine()) {				//���Ͽ� �о�� ���� �������� ������
			String line = sc2.nextLine();		// ������ �о�� (\n��������)
			System.out.println(line);			// �� ���� ȭ�鿡 ����Ѵ�
		}
		System.out.println("end");
		
		sc.close();
		sc2.close();
		
		URL url = new URL("https://mgr.kgitbank.com");
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		Scanner sc3 = new Scanner(in);
		
		while(sc3.hasNextLine()) {
			String line2 = sc.nextLine();
			System.out.println(line2);
		}
		System.out.println("close");
		sc3.close();
		
		
		
		
		
	}
}
