package teacher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main_teach {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	static void prepareDummy() throws ParseException {
		
		Movie_teach t1 = new Movie_teach("���ƴ�", "�ڿ� �ݷ� ����", 
				"����� ����,��� ��Ƽ�׿�,�Ǿ ��ν���,���׻� ������".split(","), 
				"�׼�", 125, sdf.parse("2022-10-19"), 7.63);
		
		Movie_teach t2 = new Movie_teach("A", "B", "C,D,E".split(","), "F", 100, sdf.parse("2000-01-01"), 10.0);
		Movie_teach t3 = new Movie_teach("G", "H", "I,J".split(","), "K", 100, sdf.parse("2000-05-05"), 3.14);
		Movie_teach t4 = new Movie_teach("�г��� ����", "??", "�� ����,����� ����".split(","), "K", 100, sdf.parse("2000-05-05"), 3.14);
		
		Handler_teach.arr[0] = t1;	// static�̹Ƿ� ��ü ���� ���� �Ӽ��̳� ��ɿ� ������ �� �ִ�
		Handler_teach.arr[1] = t2;
		Handler_teach.arr[2] = t3;
		Handler_teach.arr[3] = t4;
		
	}
	
	public static void main(String[] args) throws ParseException {
		prepareDummy();
		
		int select, row;
		String keyword;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. ���");
			System.out.println("2. ���ϰ˻�");
			System.out.println("3. ���߰˻�");
			System.out.println("4. �߰�");
			System.out.println("5. ����");
			System.out.println("0. ����");
			System.out.print("�޴� ���� >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:	System.out.println(Handler_teach.getList()); break;
			case 2: 
				System.out.print("�˻�� �Է� : ");
				keyword = sc.nextLine();
				System.out.println(Handler_teach.search(keyword)); 
				break;
			case 3: 
				System.out.print("�˻�� �Է� : ");
				keyword = sc.nextLine();
				System.out.println(Handler_teach.searchList(keyword)); 
				break;
			case 4:
				Movie_teach ob = input(sc);
				row = Handler_teach.insert(ob);
				System.out.println(row == 1 ? "�߰� ����" : "�߰� ����");
				break;
			case 5:
				System.out.println(Handler_teach.getList());
				System.out.print("������ ��ȭ�� ������ �Է��ϼ��� : ");
				keyword = sc.nextLine();
				row = Handler_teach.delete(keyword);
				System.out.println(row == 1 ? "���� ����" : "���� ����");
				break;
			}
		} while(select != 0);
		sc.close();
		
	} // end of main
	
	static Movie_teach input(Scanner sc) throws ParseException {
		
		String title;		// ����
		String director;	// ����
		String[] actors;	// ���
		String genre;		// �帣
		int runningTime;	// ����Ÿ��(��)
		Date openningDate;	// ��������
		double grade;		// ����
		
		System.out.print("���� : "); 			title = sc.nextLine();
		System.out.print("���� : "); 			director = sc.nextLine();
		System.out.print("��� : "); 			actors = sc.nextLine().split(",");
		System.out.print("�帣 : "); 			genre = sc.nextLine();
		System.out.print("����Ÿ��(��) : "); 	runningTime = Integer.parseInt(sc.nextLine());
		System.out.print("�������� : "); 		openningDate = sdf.parse(sc.nextLine());
		System.out.print("���� : "); 			grade = Double.parseDouble(sc.nextLine());
		
		Movie_teach ob = new Movie_teach(title, director, actors, genre, runningTime, openningDate, grade);
		return ob;
	}
}

















