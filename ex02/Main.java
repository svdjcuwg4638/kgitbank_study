package ex02;

import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
	Handler hd = new Handler();

		
	int select;
	
	Student test1 = new Student("�����", 50, 50, 50);
	Student test2 = new Student("�����", 100, 100, 100);
	Scanner sc = new Scanner(System.in);
	
	hd.arr[0]=test1;
	hd.arr[1]=test2;
	
	
	
	
	do {
		System.out.println(" �л� ���� ���� ���α׷� ");
		System.out.println(" 1. �л� ���� ���");
		System.out.println(" 2. �л� �߰� ");
		System.out.println(" 3. �л� �˻�(����");
		System.out.println(" 4. �л� ���� ����");
		System.out.println(" 0. ���� ");
		System.out.print(" �Է� >>>>>");
		select = Integer.parseInt(sc.nextLine());
		switch(select) {
		case 1 : 
			System.out.println(hd.showAll());;
			break;
		case 2 : 
			Student ob;
			ob = input(sc);
			if(hd.insert(ob)==1) System.out.println("�߰� ����");
			else System.out.println("�߰� ����");
			break;
		case 3 :
			System.out.println("�˻��� �л��� �̸� �Է� :");
			System.out.println(hd.serch(sc.nextLine()));
			break;
		case 4 :

			
			if(hd.fix(fix_input(sc))==1) {
				System.out.println("���� ����");
			}
			else System.out.println("���� ����");
			
			
			break;
		}
	}while(select != 0);
	
	
	
	
	
	
	}
	static Student fix_input(Scanner sc) {
		String name;
		int kor,eng,mat;
		
		System.out.println("������ �л��� �̸� �Է� :");
		name = sc.nextLine();
		System.out.print("�������� �Է� : ");
		kor=Integer.parseInt(sc.nextLine());
		System.out.print("�������� �Է� : ");
		eng=Integer.parseInt(sc.nextLine());
		System.out.print("�������� �Է� : ");
		mat=Integer.parseInt(sc.nextLine());
		Student ob = new Student(name, kor, eng, mat);
		return ob;
	}
	static Student input(Scanner sc) {
		String name;
		int kor,eng,mat;
		
		System.out.print("�̸� �Է� : ");name = sc.nextLine();
		
		System.out.print("���� �����Է� :"); kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� �����Է� :"); eng = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� �����Է� :"); mat = Integer.parseInt(sc.nextLine());
		
		Student ob = new Student(name, kor, eng, mat);
		
		return ob;
	}
}
