package movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Movie test = new Movie("���ƴ�", "�ڿ� �ݷ� ����", 
				"����� ����,��� ��Ƽ�׿�,�Ǿ ��ν���,���׻� ������".split(","), 
				"�׼�", 125, sdf.parse("2022-10-19"), 7.63);
		Movie test2 = new Movie("�λ��� �Ƹ��ٿ�", "�ֱ���", 
				"������,�ڼ���,�˼���,�ɴޱ�".split(","), 
				"������", 122, sdf.parse("2022-09-08"), 8.36);
		Movie test3 = new Movie("����2:���ͳ��ų�", "�̼���", 
				"����,������,����,�ٴϿ� ���".split(","), 
				"�׼�", 129, sdf.parse("2022-09-07"), 7.63);
		int menu;
		Handler.arr[0]=test;	//static�̹Ƿ� ��ü ���� ���� �Ӽ��̳� ��ɿ� ������ �� �ִ�
		Handler.arr[1]=test2;
		Handler.arr[2]=test3;
	
		int row=0 ,select,idx;
		String name;
		do {
			System.out.println("���ϴ� ��� ����");
			System.out.println("1. ���");
			System.out.println("2. �߰�");
			System.out.println("3. ����");
			System.out.println("4. �˻�");
			System.out.println("0. ����");
			System.out.print("�Է� >>>>");
			menu = Integer.parseInt(sc.nextLine());
			
			
			switch(menu) {
			case 1 : System.out.println(Handler.getList());break;
			case 2 : 
				
				Movie ob =input(sc);
				row = Handler.insert(ob);
				System.out.println(row == 1 ? "�߰� ����": "�߰� ����");
				break;
			case 3 :
				System.out.println("��ȣ�� ���� 1 / �̸����� ���� 2");
				select=sc.nextInt();
				if(select==1) {
					System.out.println("----���----");
					System.out.println(Handler.getList());
					System.out.println("�������ϴ� ��ȣ �Է�");
					idx=sc.nextInt();
					Handler.delete(idx);
					break;
				}
				else {
					System.out.println("----���----");
					System.out.println(Handler.getList());
					System.out.println("�������ϴ� �����̸� �Է�");
					name = sc.nextLine();
					Handler.delete(name);
					break;
				}
			case 4:
				System.out.println("��ȭ ����");
				System.out.println("----���----");
				System.out.println(Handler.getList());
				System.out.println("��ȭ ����");
				name=sc.nextLine();
				Handler.search(name);
				break;
			}
		}while(menu !=0);
		sc.close();
		
	}
	static Movie input(Scanner sc)throws ParseException {
		String title;		// ����
		String director;	// ����
		String[] actors;		// ���
		String genre;		// �帣
		int runningTime;	// ����Ÿ��(��)
		Date openningDate;	// ��������
		double grade;		// ����
		Movie ob1;
		
		System.out.printf("��ȭ ���� �Է� : ");	title = sc.nextLine();
		
		System.out.printf("���� �Է� : ");		director = sc.nextLine();
		
		System.out.printf("��� �Է�(ex �۽���,�̺���");actors=sc.nextLine().split(",");
		
		System.out.printf("�帣 �Է�");genre= sc.nextLine();
		
		System.out.printf("��ȭ �ð� �Է� :");runningTime = Integer.parseInt(sc.nextLine());
		
		System.out.printf("���� ���� �Է� : ");openningDate = sdf.parse(sc.nextLine());
		
		System.out.printf("���� �Է� : ");grade = Double.parseDouble(sc.nextLine());
		
		ob1 =new Movie(title, director, actors, genre, runningTime, openningDate, grade);
		return ob1;
	}
	
}
