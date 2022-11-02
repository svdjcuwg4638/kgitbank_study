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
		
		System.out.println("학생 관리 프로그램");
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("입력 >>>>>>");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1 :
				handler.showArr();
				break;
			case 2 :
				
				System.out.print("학생 유형을 선택하세요  ( 1. 영문과 | 2. 컴공과) : ");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1) st = makeEnglishLinguisticStudent(sc);
				if(select == 2) st = makeComputerScienceStudent(sc);
				row = handler.arrAdd(st);
				break;
			case 3 :
				System.out.print("검색할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);	// 이름을 전달해서 일치하는 학생을 찾기
				if(st != null) st.showDetail();
				else			System.out.println(name + "학생을 찾을 수 없습니다");
				break;
			case 4 :
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);
				row = handler.arr_delete(st);
				break;
			}
			
			
		}while(select!=0);
		sc.close();
		System.out.println("종료");
		
		
		
	}

	private static Student makeComputerScienceStudent(Scanner sc) {
		String name;
		int mat,eng,kor,java,linux,network;
		System.out.print("학생의 이름 입력 : ");
		name = sc.nextLine();
		System.out.print("국어점수 입력 : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 입력 : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 입력 : ");
		mat = Integer.parseInt(sc.nextLine());
		System.out.print("자바점수 입력 :");
		java = Integer.parseInt(sc.nextLine());
		System.out.print("리눅스점수 입력 :");
		linux = Integer.parseInt(sc.nextLine());
		System.out.print("네트워크점수 입력 :");
		network=Integer.parseInt(sc.nextLine());
		
		ComputerScieneceStudent ob = new ComputerScieneceStudent(linux, network, java, name, kor, eng, mat);

		return ob;
	}

	private static Student makeEnglishLinguisticStudent(Scanner sc) {
		String name;
		int mat,eng,kor,literature,translation;
		System.out.print("학생의 이름 입력 : ");
		name = sc.nextLine();
		System.out.print("국어점수 입력 : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 입력 : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 입력 : ");
		mat = Integer.parseInt(sc.nextLine());
		System.out.print("리눅스점수 입력 :");
		literature = Integer.parseInt(sc.nextLine());
		System.out.print("네트워크점수 입력 :");
		translation=Integer.parseInt(sc.nextLine());
		

		EnglishLinguisticStudent ob = new EnglishLinguisticStudent(name, kor, eng, mat, literature, translation);
		return ob;
	}
}
