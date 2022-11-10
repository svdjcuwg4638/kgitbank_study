package studentTeacher;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Handler handler = new Handler();	// �����ڿ��� ������ �о���δ�
//		handler.showList();
		
		int select, kor, eng, mat;
		String name;
		Scanner sc = new Scanner(System.in);
		Student st;
		do {
			System.out.println("1. ���");
			System.out.println("2. �߰�");
			System.out.println("3. ����");
			System.out.println("4. �̸����� ����");
			System.out.println("0. ����");
			System.out.print("���� >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				handler.showList();
				break;
				
			case 2:
				System.out.print("�̸� : "); 		name = sc.nextLine();
				System.out.print("�������� : ");	kor = Integer.parseInt(sc.nextLine());
				System.out.print("�������� : ");	eng = Integer.parseInt(sc.nextLine());
				System.out.print("�������� : ");	mat = Integer.parseInt(sc.nextLine());
				st = new Student(name, kor, eng, mat);
				handler.insert(st);
				break;
				
			case 3:
				System.out.print("������ �л��� �̸��� �Է��ϼ��� : ");
				name = sc.nextLine();
				
				handler.delete(name);
				break;
				
			case 4:
				handler.sortByName();
				break;
				
			case 0:
				handler.save();	// ������ ����Ǳ� ���� �����Ѵ�
				sc.close();
			}
			
		} while(select != 0);
		
		
		
		
	}
}
