package day02;

public class Quiz03 {
	public static void main(String[] args) {
		// 1) while�� �̿��Ͽ� ������ �Ųٷ� �����̼� �ٸ� ������ ������ �� ����ϼ���
		int n1 =1234;
		int n2 = 0;
		int x =1000;
		System.out.println("n2 : "+n2);  // 4321
		
		while(true) {
			n2 *=10;
			n2 += n1%10;
			n1 /= 10;
			if (n1 == 0) {
				break;
			}
		}
		System.out.println(n2);
		
		// 2) for�� �̿��Ͽ� 1���� 1000������ Ȧ���� �հ� ¦���� ���� ���� ���Ͽ� ����ϼ���
		int oddSum = 0 , evenSum = 0;
		for (int i =1;i<=1000;i++) {
			if(i%2==0) {
				evenSum += i;
			}
			else {
				oddSum +=i;
			}
			
		}
		System.out.printf("oddSum : %d, evenSum : %d\n",oddSum, evenSum);
	}
}
