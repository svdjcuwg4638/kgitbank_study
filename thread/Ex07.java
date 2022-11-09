package thread;

class N extends Thread{
	void show() {
		for(int i = 0; i < 25; i++) {
			System.out.print(i + " ");
		}
	}
	@Override
	public void run() {	// Thread Ŭ������ run()�� �������̵��Ͽ� ���� �۾��ϰ� ���� ������ �ۼ��Ѵ�
		show();
	}
}

class A {
	void show() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
	}
}

public class Ex07 {	// thread : �ϳ��� ���α׷����� ���� �Լ��� ���ôٹ������� ����ǵ��� ó���ϴ� Ŭ����
	public static void main(String[] args) {
		N ob1 = new N();
		A ob2 = new A();
//		ob1.show();
//		ob1.run();	// ���೻���� �ۼ��� �Լ�������, ���߽����� ���� �ʴ´�
		ob1.start();	// run() �޼����� ������ ������ �����忡�� �����ϵ��� �Ѵ�
		ob2.show();
		System.out.println();
		
//		1) Thread Ŭ������ ����� ���ο� Ŭ������ �ۼ��Ѵ�
//		2) Thread Ŭ������ public void run() �޼��带 �������̵��Ͽ� ���ϴ� ������ �ۼ��Ѵ�
//		3) ���ο� Ŭ������ ��ü�� �����Ͽ� start() �޼��带 ȣ���Ѵ�
		
	}
}

