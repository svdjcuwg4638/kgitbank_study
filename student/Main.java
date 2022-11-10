package student;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Handler handler = new Handler(); // �����ڿ��� ������ �о���δ�
//
//		handler.showList();

		int select,kor,eng,mat;
		String name;
		Scanner sc = new Scanner(System.in);
		Student st;
		do {
			System.out.println("1.���");
			System.out.println("2.�߰�");
			System.out.println("3.����");
			System.out.println("0.����");
			System.out.print("�Է� >>>");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1 : 
				handler.sortByName();
				handler.showList();
				
				break;
			case 2 :
				System.out.println("�̸� : "); name = sc.nextLine();
				System.out.println("�������� : "); kor = Integer.parseInt(sc.nextLine());
				System.out.println("�������� : "); eng = Integer.parseInt(sc.nextLine());
				System.out.println("�������� : "); mat = Integer.parseInt(sc.nextLine());
				st = new Student(name, kor, eng, mat);
				handler.insert(st);
				break;
			case 3 :
				System.out.println("������ �̸� �Է� : ");
				name = sc.nextLine();
				if(handler.delete(name)==1) {
					System.out.println("���� ����");
					handler.save();
				}
				else System.out.println("���� ����");
				break;
			}
		}while(select != 0);
		sc.close();
		handler.save();// ������ ����Ǳ� ���� �����Ѵ�
	}

}
