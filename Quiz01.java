package day02;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// scanner를 이용하여 이름과 나이, 주소를 순서대로 입력받은 후 출력하세요
		// 단, 주소는 띄워쓰기를 포함하여 입력할수 있어야 합니다
		
		// 1) 변수 선언
		String name,add;
		int age;
		Scanner sc = new Scanner(System.in);
		// 2) 입력
		System.out.print("이름입력 : ");
		name = sc.next();
		
		System.out.print("나이 입력");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("주소 입력 : ");
		add = sc.nextLine();
		
		// 3) 출력
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+add);
		System.out.printf("이름 : %s\n나이 : %d\n주소 : %s\n",name,age,add);
		// 4) 마무리
		sc.close();
	}
}
