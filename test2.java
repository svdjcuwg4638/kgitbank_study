package day02;

public class test2 {
	public static void main(String[] args) {
		int n2=0;
		int n1 =1234;
		
		n2 += (n1%10);
		n1 %=10;
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		
	}
}
