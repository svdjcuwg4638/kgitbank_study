package abstractClass;

//interface �� �߻�Ŭ������ �����̴�.
// interface�� ��� �ʵ�� public static final�̴�
// interface�� ��� �޼���� public abstract�̴�
// interface �� extends ��  �ƴ϶�, implements Ű����� ���ó���Ѵ� (�������̽��� �����Ѵ� ��� ǥ����)
// interface �� �ڹٿ��� �����ϰ� ���� ����� ����ϴ� �����̴�

interface Test3{
	int n1 = 10;
	public static final int n2=20;
	
	// static�̹Ƿ� ��� ��ü���� �����ص� ������ ���̴�
	// final�̹Ƿ� �Ϲ� ������ ���� ������ �� ������, �ݵ�� �ʱⰪ�� �����ؾ߸� �Ѵ�
	
	void method1(); //public abstract�̹Ƿ� body�� �ۼ���  ��  ����.
	static void method2() {
		System.out.println("static�� ��ü ���� ���ο� ������� ȣ���� �� ������ �������");
	}
	
}

class Test4 implements Test3{

	@Override
	public void method1() {
		System.out.println("�������̽� Test3�� �߻�޼��带 ������ �޼���1");
		
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
//		Test3 ob = new Test3(); // �������̽��� �߻� Ŭ�����̹Ƿ�, �����ڸ� ���� ��ü ���� ������ �Ұ����ϴ�.
		Test4 ob1 = new Test4();
		ob1.method1();
		
		// �������̽��� �߻�Ŭ���̹Ƿ�, �͸� ���� Ŭ������ Ȱ���Ͽ� ��ü�� ������ �� �ִ�
		Test3 ob2 = new Test3() {
			
			@Override
			public void method1() {
				System.out.println("�͸� ���� Ŭ����!!");
				
			}
		};
		ob2.method1();
	}
}
