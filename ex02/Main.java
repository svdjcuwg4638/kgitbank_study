package ex02;

import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
	Handler hd = new Handler();

		
	int select;
	
	Student test1 = new Student("김대현", 50, 50, 50);
	Student test2 = new Student("김대진", 100, 100, 100);
	Scanner sc = new Scanner(System.in);
	
	hd.arr[0]=test1;
	hd.arr[1]=test2;
	
	
	
	
	do {
		System.out.println(" 학생 성적 관리 프로그램 ");
		System.out.println(" 1. 학생 성적 목록");
		System.out.println(" 2. 학생 추가 ");
		System.out.println(" 3. 학생 검색(단일");
		System.out.println(" 4. 학생 성적 수정");
		System.out.println(" 0. 종료 ");
		System.out.print(" 입력 >>>>>");
		select = Integer.parseInt(sc.nextLine());
		switch(select) {
		case 1 : 
			System.out.println(hd.showAll());;
			break;
		case 2 : 
			Student ob;
			ob = input(sc);
			if(hd.insert(ob)==1) System.out.println("추가 성공");
			else System.out.println("추가 실패");
			break;
		case 3 :
			System.out.println("검색할 학생의 이름 입력 :");
			System.out.println(hd.serch(sc.nextLine()));
			break;
		case 4 :

			
			if(hd.fix(fix_input(sc))==1) {
				System.out.println("수정 성공");
			}
			else System.out.println("수정 실패");
			
			
			break;
		}
	}while(select != 0);
	
	
	
	
	
	
	}
	static Student fix_input(Scanner sc) {
		String name;
		int kor,eng,mat;
		
		System.out.println("수정할 학생의 이름 입력 :");
		name = sc.nextLine();
		System.out.print("국어점수 입력 : ");
		kor=Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 입력 : ");
		eng=Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 입력 : ");
		mat=Integer.parseInt(sc.nextLine());
		Student ob = new Student(name, kor, eng, mat);
		return ob;
	}
	static Student input(Scanner sc) {
		String name;
		int kor,eng,mat;
		
		System.out.print("이름 입력 : ");name = sc.nextLine();
		
		System.out.print("국어 점수입력 :"); kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어 점수입력 :"); eng = Integer.parseInt(sc.nextLine());
		
		System.out.print("수학 점수입력 :"); mat = Integer.parseInt(sc.nextLine());
		
		Student ob = new Student(name, kor, eng, mat);
		
		return ob;
	}
}
