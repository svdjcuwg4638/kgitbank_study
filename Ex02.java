package day01;

public class Ex02 {
	public static void main(String[] args) {
		
		double pi = 3.14;
		int num = (int)pi;
		// (int)가 없다면 오류
		// 좌변 우변이 자료형이 같아야함
		
		int num2 = 1234;
		double db = num2;
	
		System.out.println("pi = "+pi);		//3.14
		System.out.println("num = " + num);	//3
		/
		
		System.out.println("num2 = "+num2);	//1234
		System.out.println("num2 = "+db);	//1234.0
		//int형식num2에 double형식의 num2를 대입하면 암묵적으로 형변환된 모습
	}
}
