package day02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// scanner�� �̿��Ͽ� �̸��� ����, �ּҸ� ������� �Է¹��� �� ����ϼ���
		// ��, �ּҴ� ������⸦ �����Ͽ� �Է��Ҽ� �־�� �մϴ�
		
		// 1) ���� ����
		String name,add;
		int age;
		Scanner sc = new Scanner(System.in);
		// 2) �Է�
		System.out.print("�̸��Է� : ");
		name = sc.next();
		
		System.out.print("���� �Է�");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ּ� �Է� : ");
		add = sc.nextLine();
		
		// 3) ���
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("�ּ� : "+add);
		System.out.printf("�̸� : %s\n���� : %d\n�ּ� : %s\n",name,age,add);
		// 4) ������
		sc.close();
	}
}
