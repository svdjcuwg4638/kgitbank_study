package day04;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex05 {
	
	
	public static void main(String[] args) throws IOException {
		// 메서드 오버로딩
		// overload : 과부하
		File f = new File("C:\\window\\system32\\drivers\\etc\\hosts");
		String str = "sgesefsefsegsesgsefse";
		InputStream in = System.in;
		
		
		
		Scanner sc1 = new Scanner(f);	//파일의 내용을 읽어들이는 스캐너
		Scanner sc2= new Scanner(str);	//문자열의 내죵을 읽어들이는 스캐너
		Scanner sc3 = new Scanner(in);	// 표준입력의 내용을 읽어들이는 스캐너
		
		// Scanner()라는 하뭇의 이름은 하나인데
		// 매개변수의 자료형에 따라서, 실제로는 3개의 함수가 각각 따로 존재한다
		// 매개변수에 넣어주는 인자값의 자료형에 따라 서로 다른 함수를 실행하는 것이다
		// 하나의 이름에 여러 함수의 정의가 중복되어 연결된 형식을 함수 오버로딩이라고 한다
		int n1 =sum(0,10);
		int n2 =sum(20,10,30);
		int n3 =sum(1,2,3,4,5,6,7,8,4);
		double n4 = sum(1.2,3.4);
		
	}	//end of main
	// 두 정수를 전달받아서 합계를 반환하는 함수 sum
	static int sum(int n1,int n2) {
		return n1 + n2;
	}
	// 세 정수를 전달받아서 합계를 반환하는 함수 sum
	static int sum(int n1,int n2, int n3) {
		return n1+n2+n3;
	}
	static int sum(int...args) {

		int total =0;
		for(int i =0; i<args.length;i++) {
			total+=1;
		}
		return total;
	}
		
//		 두 실수를 전달받아서 합계를 변환하는 함수 sum
	static double sum(double n1,double n2) {
		return n1+n2;
	}
		
	
	
}
