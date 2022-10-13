package day02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// if문제
		
		
		/*
		 *  이용 시간에 따라 요금을 책정하는 놀이기구가 있다
		 *  기본요금 3천원으로 시작하여 10분당 추가요금 500원이 발생한다
		 *  요금표는 아래와 같은 규칙으로 적용한다
		 *  
		 *   0~30	 3000원
		 *   31~40		3500원
		 *   41~50		4000원
		 *   ~~~
		 *   
		 *   이용시간을 분으로 입력받아서, 금액을 계산하여 출력하는 코드를 작성하세요
		 */
		
		int time;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이용한 시간을 입력해주세요 : ");
		time = sc.nextInt();
		
		if (time >30) {

			
			System.out.printf("이용시간은 %d분이며 요금은 :%,d원 입니다.\n",time,3000+(500*(((time-31)/10)+1)));
			
		}
		else {
			System.out.printf("이용시간은 %d분이며 요금은 :3,000원 입니다.\n",time);
		}
		
		
		
		
		sc.close();
		
		
		
		
		
	}
	static int getFee(int time) {
		int time;
		if (time >30) {

			
			System.out.printf("이용시간은 %d분이며 요금은 :%,d원 입니다.\n",time,3000+(500*(((time-31)/10)+1)));
			
		}
		else {
			System.out.printf("이용시간은 %d분이며 요금은 :3,000원 입니다.\n",time);
			return time;
		}
		return time;
	}
}
