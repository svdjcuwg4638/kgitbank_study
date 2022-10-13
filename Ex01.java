package day03;

import java.util.Scanner;

public class Ex01 {
	
	static int pow(int num,int count) {
		int result = 1;
		for(int i =0 ; i<count;i++) {
			result *= num;
		}
		return result;
	}
	public static void main(String[] args) {
		
		int n1 = pow(2,10);
		System.out.println("n1 "+n1);
		

		int n2;
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자 입력 : ");
		n2 = sc.nextInt();
		
		System.out.printf("%d의 절대값은 %d입니다.",n2,test1(n2));
		sc.close();
		
		
		
	 }

	static int test1(int n1) {
		int n2;
		n2 = (n1 <0)? -n1 : n1;
		
		
		return n2;
	}
	

}

