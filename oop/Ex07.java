package oop;

class Test3{
	int n1 = 1;			// ��ü�� ���ؼ� ������ �� �ִ�
	static int n2 =20;	// Ŭ������ ���ؼ� ������ �� �ִ�
	
	void showN1() {					// non - static
		System.out.println(n1);
	}
	static void showN2() {	
		System.out.println(n2);		// static �ʵ带 �����ϴ� �޼����
									// �����ϰ� static�� �����ؾ� �� ����� ������ �� �ִ�
		
//		System.out.println(n1);
//		Cannot make a static reference to the non-static field n1
//		static �޼��忡���� non -static ��Ҹ� ������ �� �����ϴ�
//		static�� ������ ���������� non - static ����� �������θ� ������ �� ���� ����
	}
		
}

public class Ex07 {
	public static void main(String[] args) {
//		System.out.println(Test3.n1);	// ��ü�� ������ ���� �Ұ�
		System.out.println(Test3.n2);	// ��ü�� �������� �ʾƵ� ���� ����
		
		Test3 ob = new Test3();
		
		System.out.println(ob.n1);	// Ŭ������ ���� �ε�ǰ�, ���� ��ü�� �ε�ȴ�
		System.out.println(ob.n2);	// ��ü�� ������ ���������� �翬�� Ŭ������ �ε�Ǿ� �ִ�
		
		System.out.println("==============================");
		
		ob.showN1();
		ob.showN2();
		
//		Test3.showN1();		//static�� �ƴϴ�(non - static)
		Test3.showN2();
	}
}
