package day04;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		String id = "itbank";
		String pw ="it";
		String idd,pww;
		
		String userid, userpw;
		Scanner sc = new Scanner(System.in);
		
		// ����ڿ��� userid, userpw�� �Է¹ް�,
		// Id/pw ��� ��ġ�ϸ� �α��� ����
		// ID�� ��ġ������ PW�� ��ġ���� ������ [��й�ȣ ����]
		// ID�� ��ġ���� ������ [������ ã���� �����ϴ�] ��� ����ϼ���
		
		System.out.print("���̵� �Է��ϼ��� : ");
		idd = sc.nextLine();
		
		
		
		if(id.equals(idd)) {
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			pww = sc.nextLine();
			if(pw.equals(pww)) {
				System.out.println("�α��� ����");
			}
			else System.out.println("��й�ȣ ����");
		} else System.out.println("������ ã���� �����ϴ�.");
		sc.close();
	}
}
