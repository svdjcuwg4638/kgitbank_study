package day02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// buffer : �����͸� ����/�̵��� �� ����ϴ� ���� �޸� ����
		
		Scanner sc = new Scanner(System.in);
		int num ;
		String str;
		
		System.out.print("���� �Է� : ");
		num=sc.nextInt();	// �Էµ� ������ �߿��� ������ �ش��ϴ� ���� �����Ѵ�
							// 48 ~ 57 ������ ���� �����Ѵ�
							// ������ Ű �ڵ�� 13 (\r), 10(\n)
		sc.nextLine(); 		// ���ۿ� �����ִ� ����Ű �������� �����ͼ� �������� �ʴ´�
							// ����Ű ���� ���ۿ��� �������
		
		System.out.print("���ڿ� �Է� :");
//		str = sc.next(); 	// ���� Ȥ�� ���� ���������� ������ ���ڿ��� �����Ѵ�
		str = sc.nextLine();  // ���� ���������� ������ ���ڿ��� �����Ѵ�
		
		System.out.println(num);
		System.out.println(str);
		
		System.out.println("���� �Է� : ");
		num = Integer.parseInt(sc.nextLine());	// ���ڿ� ���·� �����ͼ� ������ �ٲ۴�
		System.out.println("���ڿ� �Է� : ");
		str = sc.nextLine();
		
		sc.close();
	}
}
