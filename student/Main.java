package student;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Handler handler = new Handler(); // 생성자에서 파일을 읽어들인다
//
//		handler.showList();

		int select,kor,eng,mat;
		String name;
		Scanner sc = new Scanner(System.in);
		Student st;
		do {
			System.out.println("1.목록");
			System.out.println("2.추가");
			System.out.println("3.삭제");
			System.out.println("0.종료");
			System.out.print("입력 >>>");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1 : 
				handler.sortByName();
				handler.showList();
				
				break;
			case 2 :
				System.out.println("이름 : "); name = sc.nextLine();
				System.out.println("국어점수 : "); kor = Integer.parseInt(sc.nextLine());
				System.out.println("영어점수 : "); eng = Integer.parseInt(sc.nextLine());
				System.out.println("수학점수 : "); mat = Integer.parseInt(sc.nextLine());
				st = new Student(name, kor, eng, mat);
				handler.insert(st);
				break;
			case 3 :
				System.out.println("삭제할 이름 입력 : ");
				name = sc.nextLine();
				if(handler.delete(name)==1) {
					System.out.println("삭제 성공");
					handler.save();
				}
				else System.out.println("삭제 실패");
				break;
			}
		}while(select != 0);
		sc.close();
		handler.save();// 메인이 종료되기 직전 저장한다
	}

}
