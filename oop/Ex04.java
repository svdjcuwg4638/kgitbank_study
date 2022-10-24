package oop;

class Circle{
	double radius;		// ������
	double pi = 3.14;	// Ŭ������ ��� �ʵ�� �ʱⰪ�� �̸� ������ �� �ִ�
	double area ;		// ���� ����	(������ x ������ x 3.14)	 cm��
	double length ;		// ���� �ѷ�	(������ x 2 x 3.14)	cm
	
	// ������ : ��ü�� �����ϴ� �޼���(method : ��� )
	// ������ �����ε� : ��ü�� �����ϴ� ���� ����� �����ϰڴ�
	
	// ������ ���ο��� �� �ٸ� �����ڸ� ȣ���Ϸ���, �׻� ù��° �ٿ����� �����ϴ�
	
	// 1) �������� ���޹��� ������, �⺻�� 3�� �����Ѵ�
	Circle(){
//		Circle(3.0);	// ������ ���ο��� �Ǵٸ� �����ڸ� ȣ���� ���� thisŰ���带 ����Ѵ�
		this(3.0);		// �׻� ������ �ڵ��� ù�ٿ����� ����!!
//		radius = 3;
	}
	// 2) �������� ������ ���޹�����, �����ڿ��� �ѷ��� ������ ����Ͽ� �����Ѵ�
	Circle(int radius){
		this((double)radius);
//		this.radius=radius ;		
	}
	
	// 3) �������� �Ǽ��� ���޹�����, �����ڿ��� �ѷ��� ������ ����Ͽ� �����Ѵ�
	Circle(double radius){
		this.radius =radius;
	}
	
	void show() {
		System.out.printf("������ : %.2fcm\n",radius);
		System.out.printf("���� ���� : %.2fcm��\n",area=radius *radius *pi);
		System.out.printf("���� �ѷ� : %.2fcm\n",length = radius * 2 * pi);
		System.out.println();
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Circle ob1 = new Circle();
		Circle ob2 = new Circle(4);
		Circle ob3 = new Circle(2.4);
		
		ob1.show();
		ob2.show();
		ob3.show();
		
	}
}
