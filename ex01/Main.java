package ex01;

import java.util.Scanner;

// ����ڿ��� ��ȣ�ۿ�
// ������� ó���ϴ� Ŭ����

// ����� �Է��ϰ� ��¹޴°�

public class Main {
	public static void main(String[] args) {
		
		int select,age,row;
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();	//������ ���� �� ����� �����ϴ� ��ü
		String find,result,name;
		Human ob ;	// �Է¹��� ������ ������ ��ü�� ������ ����
		
		Human[] arr = {
				new Human("�����",25),
				new Human("����ȯ",27)
		};
		
	
		
		do {
			// 1) �޴� ��� �� ����� �Է�
			System.out.print("\tģ����� �������α׷�\n\n");
			System.out.println("1. ���");
			System.out.println("2. �߰�");
			System.out.println("3. �˻�");
			System.out.println("4. ����");
			System.out.println("5. ����");
			System.out.println("0. ����");
			System.out.print("�޴� ����>>>");
			select = Integer.parseInt(sc.nextLine());
			// 2) ����� �Է¿� ���� Handler ��� ȣ��
			switch(select){
			case 1: // ��ü ��� ( hd���� ����� ��û�ϰ�, ����� result�� �����Ͽ� ���)
				result = hd.selectAll();
				System.out.println(result);
				break;
			case 2:	// �߰� ( user���� �����͸� �Է¹޾� ��ü�� �����ϰ�, ��ü�� hd���� ����, ����� ������ �ޱ�)
				System.out.print("�̸� �Է� : ");
				name = sc.nextLine();
				System.out.print("���� �Է� : ");
				age = Integer.parseInt(sc.nextLine());
				ob = new Human(name,age);
				row = hd.insert(ob);
				if(row == 1 ) System.out.println("�߰� ����");
				if(row == 0 ) System.out.println("�߰� ����");
				break;
			case 3:	// �˻�
				System.out.print("�˻��� ����� �̸� �Է� : ");
				find = sc.nextLine();
				result = hd.search(find);
				if(result != null) System.out.println(result);
				if(result == null) System.out.println("����� �����ϴ�.");
				
				break;
			case 4:	// ����
				System.out.print("������ ����� �̸� �Է� : ");
				find = sc.nextLine();
				System.out.print("������ ���̸� �Է� :");
				age = Integer.parseInt(sc.nextLine());
				row = hd.update(find,age);
				if(row == 1 ) System.out.println("���� ����");
				if(row == 0 ) System.out.println("���� ����");
				break;
			case 5:	// ����
				System.out.print("������ ����� �̸� �Է� : ");
				find = sc.nextLine();
				row = hd.delete(find);
				if(row == 1) System.out.println("�����Ǿ����ϴ�");
				if(row == 0) System.out.println("����� �����ϴ�.");
				break;
			}
		}while(select !=0);
		System.out.println("���α׷� ����");
		sc.close();
	}
}
