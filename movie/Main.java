package movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Movie test = new Movie("블랙아담", "자움 콜렛 세라", 
				"드웨인 존슨,노아 센티네오,피어스 브로스넌,퀸테사 스윈들".split(","), 
				"액션", 125, sdf.parse("2022-10-19"), 7.63);
		Movie test2 = new Movie("인생은 아름다워", "최국희", 
				"염정아,박세완,옹성우,심달기".split(","), 
				"뮤지컬", 122, sdf.parse("2022-09-08"), 8.36);
		Movie test3 = new Movie("공조2:인터내셔날", "이석훈", 
				"현빈,유해진,윤아,다니엘 헤니".split(","), 
				"액션", 129, sdf.parse("2022-09-07"), 7.63);
		int menu;
		Handler.arr[0]=test;	//static이므로 객체 생성 없이 속성이나 기능에 접근할 수 있다
		Handler.arr[1]=test2;
		Handler.arr[2]=test3;
	
		int row=0 ,select,idx;
		String name;
		do {
			System.out.println("원하는 기능 선택");
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 검색");
			System.out.println("0. 종료");
			System.out.print("입력 >>>>");
			menu = Integer.parseInt(sc.nextLine());
			
			
			switch(menu) {
			case 1 : System.out.println(Handler.getList());break;
			case 2 : 
				
				Movie ob =input(sc);
				row = Handler.insert(ob);
				System.out.println(row == 1 ? "추가 성공": "추가 실패");
				break;
			case 3 :
				System.out.println("번호로 삭제 1 / 이름으로 삭제 2");
				select=sc.nextInt();
				if(select==1) {
					System.out.println("----목록----");
					System.out.println(Handler.getList());
					System.out.println("삭제원하는 번호 입력");
					idx=sc.nextInt();
					Handler.delete(idx);
					break;
				}
				else {
					System.out.println("----목록----");
					System.out.println(Handler.getList());
					System.out.println("삭제원하는 제목이름 입력");
					name = sc.nextLine();
					Handler.delete(name);
					break;
				}
			case 4:
				System.out.println("영화 정보");
				System.out.println("----목록----");
				System.out.println(Handler.getList());
				System.out.println("영화 선택");
				name=sc.nextLine();
				Handler.search(name);
				break;
			}
		}while(menu !=0);
		sc.close();
		
	}
	static Movie input(Scanner sc)throws ParseException {
		String title;		// 제목
		String director;	// 감독
		String[] actors;		// 배우
		String genre;		// 장르
		int runningTime;	// 러닝타임(분)
		Date openningDate;	// 개봉일자
		double grade;		// 평점
		Movie ob1;
		
		System.out.printf("영화 제목 입력 : ");	title = sc.nextLine();
		
		System.out.printf("감독 입력 : ");		director = sc.nextLine();
		
		System.out.printf("배우 입력(ex 송승헌,이병헌");actors=sc.nextLine().split(",");
		
		System.out.printf("장르 입력");genre= sc.nextLine();
		
		System.out.printf("영화 시간 입력 :");runningTime = Integer.parseInt(sc.nextLine());
		
		System.out.printf("개봉 일자 입력 : ");openningDate = sdf.parse(sc.nextLine());
		
		System.out.printf("평점 입력 : ");grade = Double.parseDouble(sc.nextLine());
		
		ob1 =new Movie(title, director, actors, genre, runningTime, openningDate, grade);
		return ob1;
	}
	
}
