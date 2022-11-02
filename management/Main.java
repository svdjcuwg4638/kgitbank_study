package management;

import java.util.Scanner;

import model.ComputerScieneceStudent;
import model.EnglishLinguisticStudent;
import model.Student;

public class Main {
	
	private static Handler handler = new Handler();
	
	public static void main(String[] args) {
		
		int row;
		Scanner sc = new Scanner(System.in);
		int select;
		String name;
		Student st = null;
		
		System.out.println("�л� ���� ���α׷�");
		
		do {
			System.out.println("1. ���");
			System.out.println("2. �߰�");
			System.out.println("3. �˻�");
			System.out.println("4. ����");
			System.out.println("0. ����");
			System.out.print("�Է� >>>>>>");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1 :
				handler.showArr();
				break;
			case 2 :
				
				System.out.print("�л� ������ �����ϼ���  ( 1. ������ | 2. �İ���) : ");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1) st = makeEnglishLinguisticStudent(sc);
				if(select == 2) st = makeComputerScienceStudent(sc);
				row = handler.arrAdd(st);
				break;
			case 3 :
				System.out.print("�˻��� �л��� �̸��� �Է��ϼ��� : ");
				name = sc.nextLine();
				st = handler.find(name);	// �̸��� �����ؼ� ��ġ�ϴ� �л��� ã��
				if(st != null) st.showDetail();
				else			System.out.println(name + "�л��� ã�� �� �����ϴ�");
				break;
			case 4 :
				System.out.print("������ �л��� �̸��� �Է��ϼ��� : ");
				name = sc.nextLine();
				st = handler.find(name);
				row = handler.arr_delete(st);
				break;
			}
			
			
		}while(select!=0);
		sc.close();
		System.out.println("����");
		
		
		
	}

	private static Student makeComputerScienceStudent(Scanner sc) {
		String name;
		int mat,eng,kor,java,linux,network;
		System.out.print("�л��� �̸� �Է� : ");
		name = sc.nextLine();
		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(sc.nextLine());
		System.out.print("�ڹ����� �Է� :");
		java = Integer.parseInt(sc.nextLine());
		System.out.print("���������� �Է� :");
		linux = Integer.parseInt(sc.nextLine());
		System.out.print("��Ʈ��ũ���� �Է� :");
		network=Integer.parseInt(sc.nextLine());
		
		ComputerScieneceStudent ob = new ComputerScieneceStudent(linux, network, java, name, kor, eng, mat);

		return ob;
	}

	private static Student makeEnglishLinguisticStudent(Scanner sc) {
		String name;
		int mat,eng,kor,literature,translation;
		System.out.print("�л��� �̸� �Է� : ");
		name = sc.nextLine();
		System.out.print("�������� �Է� : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.print("�������� �Է� : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("�������� �Է� : ");
		mat = Integer.parseInt(sc.nextLine());
		System.out.print("���������� �Է� :");
		literature = Integer.parseInt(sc.nextLine());
		System.out.print("��Ʈ��ũ���� �Է� :");
		translation=Integer.parseInt(sc.nextLine());
		

		EnglishLinguisticStudent ob = new EnglishLinguisticStudent(name, kor, eng, mat, literature, translation);
		return ob;
	}
}
