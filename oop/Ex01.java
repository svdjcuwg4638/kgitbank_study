package oop;

class Number {
	int num;
	
	Number(int num){
		this.num = num;
	}
	
	public String toString() {
		return num + " ";
		
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// Ŭ������ �ڷ����̰�, ��ü�� Ŭ������ ���� ������� �������̴�
		// �ϳ��� Ŭ������ �������� ���� �ٸ� ��ü�� ������ �� �ִ�
		
		Number n1 = new Number(3);
		Number n2 = new Number(5);
		Number n3 = n1; // n1,n2,n3 �� ��������
		
		System.out.println(n1);
		System.out.println(n2);
		
	}
}
