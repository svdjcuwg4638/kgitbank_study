package serialize;

import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
		Handler hd = new Handler();
		int select;
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String name;
		Date dt = new Date();
		Todo ob;
		do{
			System.out.println("1.�Է�");
			System.out.println("2.����");
			System.out.println("3.����");
			System.out.println("4.���");
			System.out.print("��� �Է� :");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1 :
				System.out.print("�̸� �Է� : ");
				name = sc.nextLine();
				System.out.print("��¥ �Է� ex> yyyy.MM.dd");
				dt = sdf.parse(sc.nextLine());
				ob = new Todo(name, dt);
				if(hd.insert(ob)==1) System.out.println(" �߰� ���� ");
				else System.out.println("�߰� ����");
				break;
			case 2 :
				System.out.print("������ �̸� �Է� :");
				name = sc.nextLine();
				System.out.print("������ ��¥ �Է� ex> yyyy.MM.dd");
				dt = sdf.parse(sc.nextLine());
				ob = new Todo(name, dt);
				if(hd.delete(ob)==1) System.out.println("���� ����");
				else System.out.println("���� ����");
				break;
			case 3:
				hd.save();
				break;
			case 4:
				hd.show();
				break;
			}
		}while(select !=0);
		sc.close();
		
	}

}
