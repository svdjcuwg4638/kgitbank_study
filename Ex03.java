package day01;
import java.util.Random;
public class Ex03 {

	public static void main(String[] args) {

		double d1 = 100 /3 ;			// 정수로 계산하여 몫을 구한다
		double d2 = (double)100 / 3;	// 실수로 계산하여 정확한 값을 구한다
		double d3 = 100 / (double) 3;
		double d4 = 100 / 3.0;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		// 어떤 수를 0으로 나누면 안된다
//		int test =3/0;
		
		// 나머지 연산의 활용
		// 1) 홀수,짝수 (약수,배수)를 구분할 때 사용할 수 있다
		
		// 2) 어떤 수를 10의 제곱수로 나누면 0의 개수만큼 뒷자리를 분리할 수 있다
		int idNum = 930516;
		int date = idNum % 100; 	//0의 개수만큼 (2개) 뒷자리를 분리한다
		idNum /= 100;			// 뒤의 2자리를 버리고, 앞의 4자리만 남긴다
		int month = idNum %100;
		int year = idNum / 100 ;
		
		System.out.printf("%d년 %d월 %d일\n",year,month,date);
		
		// 3) 난수의 범위를 제한한다
		Random ran = new Random();
		int r = ran.nextInt();
		System.out.println("r:"+r);
		r = r % 10 +1;					//범위 제한
		System.out.println("r:"+r);
		r = r > 0 ? r : -r ;		// 부호 보정
		System.out.println("r:"+r);
	
		int r2 = ran.nextInt(45)+1;
		System.out.println("r2 = "+r2);
	}
}
