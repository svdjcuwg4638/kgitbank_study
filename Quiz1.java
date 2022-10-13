package day01;

public class Quiz1 {
	public static void main(String[] args) {
		
		//첫날에 은행에 돈을 10원 준비하여 입금한다
		//둘째날에는 이전날의 두배인 20원을 준비하여 입금한다
		// 셋째날에는 이전날의 두배인 40원을 준비하여 입금한다
		// 이런식으로 30일 동안 은행에 돈을 입금하면
		// 30일 이후 은행계자에 입금된 금액의 총액은 얼마인가?
		// (단, 은행계좌에는 처음에 돈이 없었던 것으로 가정한다)
		int day = 1;
		long money =10;
		long bk = 0;
		while(day<31) {
			bk += money;
			System.out.println(money);
			money *= 2;
			day++;
			
		}
		System.out.printf("총 금액은 : %,d 입니다.\n",bk);
		
	}
}
