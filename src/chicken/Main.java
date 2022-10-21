package chicken;

import java.util.Scanner;

// public�� �ϳ��� ��Ű���� �ϳ��� ���� �Ͽ��� �Ѵ�.

public class Main {
	
	// main �Լ� �ȿ� �ִ� �������� Main Ŭ������ ��� �ʵ�� ����
	static Handler handler = new Handler();
	
	public static void main(String[] args) {
		// ����ڿ� ��������� ��ȣ�ۿ��ϸ鼭 ���α׷��� �����ϴ� �ڵ�
		int menu;
		int result =0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("1. �޴� �߰�");
			System.out.print("2. �޴� ���");
			System.out.print("3. �޴��߰�");
			System.out.print("����>>>");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1 :
				Chicken ob = input(sc);
				
				result = handler.insert(ob);
				System.out.println(result == 1 ? "�߰� ����" : "�߰� ����");
			case 2 : 
				handler.show();
				break;
			}
			
		}while(menu == 0);
		System.out.println("���α׷� ����");
		sc.close();
	}
	static Chicken input(Scanner sc) {
		String brand, store, menu;
		int price;
		double starpoint;
		System.out.print("�귣�� : ");
		brand = sc.nextLine();
		
		System.out.print("������ : ");
		store = sc.nextLine();
		
		System.out.print("�޴��̸� : ");
		menu = sc.nextLine();
		
		System.out.print("���� : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� : ");
		starpoint = Double.parseDouble(sc.nextLine());
		
		Chicken ob = new Chicken(brand,store,menu,price,starpoint);
		return ob;
	}
}
