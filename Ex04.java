package day02;

public class Ex04 {
	public static void main(String[] args) {
		boolean a1;		//primitive type, ���� �ڷ���
		byte a2;		// �����͸� �����ϴ� �������� ���
		char a3;		// ��ü�� �ƴϴ�
		short a4;		// �Լ��� �������� �ʰ�, ������ ����������θ� ����Ѵ�
		int a5;
		long a6;
		float a7;
		double a8;
		
		Boolean b1;		// Wrapper Class, �����ڷ����� ������ ��ü �������� �����ϴ� Ŭ����
		Byte b2;		// �����͸� �����ϸ鼭, ���õ� �Լ��� �����ϴ� �ڷ���
		Character b3;	// Ŭ������ ���ؼ� ������� ��ü �����̴�
		Short b4;		// �Լ��� �����Ѵ�. ��ü�� �Լ� Ȥ�� Ŭ������ �Լ��� �ִ�
		Integer b5;		// integer.parseInt(String s)�� ���������� ���ڿ��� ����ȯ�ϴ� �Լ��� �ִ�
		Long b6;
		Float b7;
		Double b8;
		
		a2 = 10;
		b2 =20;
	 	
// 		a2. 		// a2�� ������ �����̹Ƿ�, �޼��带 �������� �ʴ´�
//		b2.			// ������ ��ü�� �����ϰ�, ��ü�� �޼��尡 ���ԵǾ� �ִ�
//		Byte. 		// ��ü�� �������� �ʴ���, Ŭ�������� �޼��尡 ���ԵǾ� �ִ�
		
		String t1 ="1234";
		int num = 0;
		
		// ���ڿ��� ������ ���� �ٲٴ� �ڵ�
		for(int i=0; i< t1.length();i++) {
			char ch = t1.charAt(i);
			num *= 10;
			num += (int)(ch -48);
		}
		System.out.println("num : "+num);
		
		// wrapper class�� ������� �Լ��� �̿��Ͽ� ��ȯ�ϴ� �ڵ�
		int num2 = Integer.parseInt(t1);
		System.out.println("num2 : "+ num2);
	}
}
