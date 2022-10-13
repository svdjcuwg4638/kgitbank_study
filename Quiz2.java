package day01;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 버스 한 정거장 이동하는데 약 3분의 시간이 소요된다고 가정한다
		// 사용자에게 이동한 정거장 수를 입력받아서 걸린 시간을 출력하세요
		// 단, 시간이 60분을 초과하면 시간과 분을 나누어서 출력하세요
		int time,hour,buscount,min;
	
		Scanner sc = new Scanner(System.in);
		System.out.printf("이동한 정거장 수를 입력하세요 : ");
		buscount = sc.nextInt();
		time = buscount*3;
		if (time>60) {
			hour= time/60;
			min = time%60;
			System.out.printf("소요된 시간은 %d시 %d분 입니다.\n",hour,min);
		}
		else {
			System.out.printf("소요된 시간은 %d분입니다.\n",time);
		}
		
		sc.close();

		
	
		
		
		
	}
}
