package exception;

import javax.net.ssl.ExtendedSSLSession;

class Test6{
	
	//���� ���ο��� �߻��ϴ� NullpointerException�� caller���� ������Ų��
	void method1() throws NullPointerException{
		String str = null;
//		try {
			System.out.println(str.charAt(0));
//		}catch(NullPointerException e) {
//			System.out.println("null���� ���� �޼��带 ȣ���� �� �����ϴ�.");
//		}
	}
	
	void method2() throws NullPointerException{
		int[] arr = {2,7,8,4,6};
//		try {
			System.out.println(arr[5]);
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭�� �ε����� ���̺��� �۾ƾ� �մϴ�.");
//		}
	}
}

public class Ex06 {	
	public static void main(String[] args) {
		// throws : ���� �Լ����� �߻��� ������ ó���� caller���� ������Ų��
		
		Test6 ob = new Test6();
		try {
			ob.method1();	// throws NullpointerException(��Ÿ�� ���ܶ� ó�����ص� ���� ������)
			
		}catch (NullPointerException e) {
			System.out.println("NullpointerException");
		}
		
		try {
			Thread.sleep(1000);	// throws InterruptedException (��Ÿ�� ���ܰ� �ƴ϶� �ǹ������� ó��)
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try{
			ob.method2();
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		
	}

}
