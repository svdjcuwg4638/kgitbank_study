package book;

import java.util.Scanner;

public class Main {
	static Handler handler;
	
	public static void main(String[] args) {
		// ���� ������ �غ�
		Book[] arr = {
			new Book("Ʈ���� �ڸ��� 2023", "�賭��", "�̷���â", 17100, 4, 4),	
			new Book("�ƹ����� �ع�����", "������", "â��", 13500, 4.1, 4.2),	
			new Book("�ּ�ȸ�� 20 ����Ư����", "����Ÿ�� �԰�", "����̵���ڹͽ�", 5400, 0, 0),	
		};
		
		handler = new Handler(arr);
		
		Scanner sc = new Scanner(System.in);
		int row = 0, menu;
		String result;
		
		do {
			System.out.println("1. ���� �߰�");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("0. ����");
			System.out.print("���� >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:	// ���� �߰�
				Book ob = input(sc);
				row = handler.insert(ob);
				System.out.println(row == 1 ? "�߰� ����" : "�߰� ����");
				break;
				
			case 2:	// ���� ���
				result = handler.getList();
				System.out.println(result);
				break;
				
			case 3:	// ���� ����
				System.out.print("� ������ �����մϱ� (1. ��ȣ | 2. ����) : ");
				menu = Integer.parseInt(sc.nextLine());
				row = delete(sc, menu);
				System.out.println(row == 1 ? "���� ����" : "���� ����");
			}
			
		} while(menu != 0);
		System.out.println("=== ���α׷� ���� ===");
		sc.close();
	}
	
	static int delete(Scanner sc, int menu) {
		int index, row = 0;
		String name;
		if(menu == 1) {	// ��ȣ�� �����ϱ�
			System.out.print("���� ��ȣ�� �Է��ϼ��� : ");
			index = Integer.parseInt(sc.nextLine());
			row = handler.delete(index);
		}
		else if(menu == 2) {	// �������� �����ϱ�
			System.out.print("���� ������ �Է��ϼ��� : ");
			name = sc.nextLine();
			row = handler.delete(name);
		}
		else {
			System.out.println("�޴� ������ �߸��Ǿ����ϴ�. �ٽ� �õ����ּ���");
		}
		return row;
	}
	
	static Book input(Scanner sc) {
		String brand, author, publisher;
		int price;
		double starPoint1, starPoint2;
		
		System.out.print("���� : ");		brand = sc.nextLine();
		System.out.print("���� : ");		author = sc.nextLine();
		System.out.print("���ǻ� : ");		publisher = sc.nextLine();
		System.out.print("���� : ");		price = Integer.parseInt(sc.nextLine());
		System.out.print("����1 : ");		starPoint1 = Double.parseDouble(sc.nextLine());
		System.out.print("����1 : ");		starPoint2 = Double.parseDouble(sc.nextLine());
		
		Book ob = new Book(brand, author, publisher, price, starPoint1, starPoint2);
		return ob;
	}
}
