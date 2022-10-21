package chicken;

import java.util.Scanner;

// public는 하나의 패키지에 하나만 존재 하여야 한다.

public class Main {
	
	// main 함수 안에 있던 지역변수 Main 클래스의 멤버 필드로 변경
	static Handler handler = new Handler();
	
	public static void main(String[] args) {
		// 사용자와 입출력으로 상호작용하면서 프로그램으 진행하는 코드
		int menu;
		int result =0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("1. 메뉴 추가");
			System.out.print("2. 메뉴 목록");
			System.out.print("3. 메뉴추가");
			System.out.print("선택>>>");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1 :
				Chicken ob = input(sc);
				
				result = handler.insert(ob);
				System.out.println(result == 1 ? "추가 성공" : "추가 실패");
			case 2 : 
				handler.show();
				break;
			}
			
		}while(menu == 0);
		System.out.println("프로그램 종료");
		sc.close();
	}
	static Chicken input(Scanner sc) {
		String brand, store, menu;
		int price;
		double starpoint;
		System.out.print("브랜드 : ");
		brand = sc.nextLine();
		
		System.out.print("점포명 : ");
		store = sc.nextLine();
		
		System.out.print("메뉴이름 : ");
		menu = sc.nextLine();
		
		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.print("별점 : ");
		starpoint = Double.parseDouble(sc.nextLine());
		
		Chicken ob = new Chicken(brand,store,menu,price,starpoint);
		return ob;
	}
}
