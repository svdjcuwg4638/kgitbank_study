package day03;

public class Ex02 {
	// y = f(x)
	public static void main(String[] args) {
		// 1) 세 정수를 전달받아서, 가장 큰 수를 반환하는 함수를 정의하고 호출하여 확인하세요
		int n1 = getMaxNum(2,4,5);
		System.out.println(n1);
		
		// 2)  정수를 전달받아서, 정수를 거꾸로 뒤집은 값을 반환하는 함수를 작성하세요
		int n2 = getReverseNumber(1234);
		System.out.println("n2 : "+n2);
		
		// 3) 놀이기구 이용시간에 따른 요금을 계산하여 반환하는 함수를 작성하세요 (if)
		int n3 = getFee(51);
		System.out.println("n3 : "+n3);
		
		// 4) 두 정수 a,b를 전달받아서 a와 b사이의 모든 합계를 반환하는 함수를 작성하세요 (for)
		int n4 = getSummary(1,100);
		System.out.println("n4 : "+n4);
		
	}

	private static int getSummary(int n1, int n2) {
		int result=0;
		
		for(int i =n1;i<n2;i++) {
			result += i;
		}
		//return (a + b ) * (b -a +1)/2
		
		return result;
	}

	private static int getFee(int i) {
		int fee;
		
		if(30<i) {
			fee =((((i-31)/10)+1)*500+3000); 
		}
		else fee=3000;
		
		return fee;
	}

	private static int getReverseNumber(int n1) {
		int result=0;
		
		for(int i =0;i<4;i++) {
			
			result *=10;
			result += n1%10;
			n1/=10;
			
		}
		
		return result;
	}

	private static int getMaxNum(int i, int j, int k) {
		int max =i;
		if (j >max) max=j;
		if (k>max) max=k;
		return max;
	}
}
