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
			System.out.println("1.입력");
			System.out.println("2.삭제");
			System.out.println("3.저장");
			System.out.println("4.출력");
			System.out.print("기능 입력 :");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1 :
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.print("날짜 입력 ex> yyyy.MM.dd");
				dt = sdf.parse(sc.nextLine());
				ob = new Todo(name, dt);
				if(hd.insert(ob)==1) System.out.println(" 추가 성공 ");
				else System.out.println("추가 실패");
				break;
			case 2 :
				System.out.print("삭제할 이름 입력 :");
				name = sc.nextLine();
				System.out.print("삭제할 날짜 입력 ex> yyyy.MM.dd");
				dt = sdf.parse(sc.nextLine());
				ob = new Todo(name, dt);
				if(hd.delete(ob)==1) System.out.println("삭제 성공");
				else System.out.println("삭제 실패");
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
