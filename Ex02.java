package day01;

public class Ex02 {
	public static void main(String[] args) {
		// �ڷ��� ��ȯ
		
		
		double pi = 3.14;
		int num = (int)pi;
		//Type mismatch: cannot convert from double to int
		// ���� ���� ��, �º��� �캯�� �ڷ����� ���ƾ� �Ѵ�
		// �Ͻ������� �캯�� ���� ���ϴ� �ڷ������� ��ȯ�� ���� ��������(casting)
		
		int num2 = 1234;
		double db = num2;
		
		//num2�� ����������, ������ �Űܴ����鼭 �Ϲ������� ����ȯ�� �߻��Ѵ�
		// �Ϲ��� ����ȯ, promotion
		
		System.out.println("pi = "+pi);
		System.out.println("num = " + num);
		
		System.out.println("num2 = "+num2);
		System.out.println("num2 = "+db);
	}
}
