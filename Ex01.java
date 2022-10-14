package day04;

public class Ex01 {

	public static void main(String[] args) {


		System.out.printf("[%s]\n","java");		
		System.out.printf("[%10s]\n","java");		//[      java]
		System.out.printf("[%-10s]\n","java");		//[java      ]
		
		System.out.printf("[%d]\n",1236000);
		System.out.printf("[%9d]\n",1236000);		//[  1236000]
		System.out.printf("[%09d]\n",1236000);		//[001236000]공백에 0이 있어야하는 프로그램이면 좋아보인다
		System.out.printf("[%,09d]\n",1236000);		//[1,236,000]
		
		System.out.printf("[%02d : %02d]\n",123/60,127%60);	[02 : 07]
		
		System.out.printf("[%f]\n",3.14);	//자릿수를 지정하지 않으면 소수점 이하 6자리까지
		System.out.printf("[%f]\n",3.1415923446);	//printf서식으로 출력시 6자리표기
		System.out.println(3.1415464534534);		//println 으로 출력시 모두 표기;
		System.out.printf("[%.2f]\n",3.1415923446);	
//		System.out.printf("[%.2f]\n",100);	//100입력시 정수를 넣어서 오류발생	
		System.out.printf("[%.2f]\n",100.0);//.0을 붙여서 자료형 맞춰줌!
		
		System.out.printf("[%c]\n",65);
		System.out.printf("[%c]\n",66);
		System.out.printf("[%c]\n",44032);	//가
		System.out.printf("[%c]\n",44033);	//각
		System.out.printf("[%c]\n",'나');	// 나
		System.out.printf("[%c]\n",'나'+1);	// 낙
		
//		object형식 : 자바의 모든 자료형을 처리할 수 있다
			
		
	
		
	}

}
