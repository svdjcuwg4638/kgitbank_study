package day02;

public class Ex04 {
	public static void main(String[] args) {


		String t1 ="1234";
		int num = 0;
		
		// 문자열을 정수로 직접 바꾸는 코드
		for(int i=0; i< t1.length();i++) {	//length( ) 로 글자수 파악
			char ch = t1.charAt(i);		//charAt( )로 몇번째 글자를 뽑아옴
			num *= 10;
			num += (int)(ch -48);
		}
		System.out.println("num : "+num);
		
		// wrapper class의 만들어진 함수를 이용하여 변환하는 코드
		int num2 = Integer.parseInt(t1);
		System.out.println("num2 : "+ num2);
	}
}
