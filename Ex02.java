package day04;

public class Ex02 {
	
	static int sum(int... args) {
		// �ڹٿ��� Ư�� ��ü�� �ڷ����� �˰� �ʹٸ�, getClass()
		
//		System.out.println(args);
//		System.out.println(args.getClass();		// ��Ű��.Ŭ����(.util)
//		System.out.println(args.getClass().getSimpleName());	//Ŭ����
		int total = 0;
		for(int i =0;i<args.length;i++) {
			total+=args[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		// ���� ���� : �Լ� ȣ�� �� �����ϴ� ������ ������ ���� �� �ִ�
		
		ss(1);
		
		int n1 =sum(1);
		int n2 =sum(1,2);
		int n3 =sum(1,2,3);
		int n4 =sum(1,2,3,4);
		System.out.printf("%d, %d, %d, %d\n",n1,n2,n3,n4);
		
	}


		

}
