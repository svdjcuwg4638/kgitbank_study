package oop;


class Test2{
	
	int num;
	
	// �⺻ ������
	Test2(){
		this(0);
		System.out.println("�⺻ ������ ȣ��!!");
//		Constructor call must be the first statement in a constructor
		// 1) ��ü�� ���� ( ������ �Ϸ���� ������, �߰��۾��� ������ �� ����)
		// 2) ��ü�� ���� ���� �ʱⰪ �Ҵ� �� �߰� �۾� ����
	}
	
	Test2(int num){
		this.num=num;
		System.out.println("int �� ���޹޴� ������ ȣ��!!");
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Test2 ob1 = new Test2();
		Test2 ob2 = new Test2(12);
	}
}
