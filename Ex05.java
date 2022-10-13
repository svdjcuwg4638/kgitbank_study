package day01;

import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		// 제어문 (control statement)
		// 프로그램의 진행 흐름을 제어하는 구문(진행이 일률적이지 않다)
		
		Random ran = new Random();
		int n1 = ran.nextInt(10)+1;
		int n2 = ran.nextInt(10)+1;
		int n3 = ran.nextInt(10)+1;
		int min =n1;
		System.out.printf("%d, %d, %d\n",n1,n2,n3);
		// 아래의 코드를 작성하여 3개의 정수중 가장 작은 수를 화면에 출력하세요
		
		if (min >n2) {
			min =n2;	
		}
		else if (min>n3) {
			min = n3;
		}
		System.out.println(min);
		}

}
