package _class;

class Coffee {
	// ���ڿ� ������ Ŀ�� �޴� �̸�
	// ���� ������ Ŀ�� ����
	String name;
	int price;
	
	// ������ : ��ü ������ ȣ��Ǵ� �Լ�. Ŭ������ �̸��� �Ȱ���, ��ȯ�� ��ü�� ���� (void�� ���� �ʴ´�)
	// �����ڴ� �ۼ����� ������, JVM�� ������ �Ҷ� �⺻ ������ �ڵ带 �ۼ����ش�
	// �����ڰ� �����ڸ� �ۼ��ϸ�, JVM�� �ڵ����� �����ڸ� ��������� �ʴ´�
	// �����ڵ� �Լ��̹Ƿ�, �ڹ��� �Լ� �����ε��� ����ȴ�
	Coffee(String name, int price) {
		this.name = name;	// �Ű����� name�� ���� �� ��ü�� ��� �ʵ� name�� �����Ѵ�
		this.price = price;
	}
	
	// void ��ȯ������ �̸��� ������ ����ϴ� show()
	void show() {
		System.out.printf("%s : %,d��\n", name, price);
	}
}

public class Ex03 {
	public static void main(String[] args) {
		// Coffee Ŭ������ �̿��Ͽ� 3���� ���� �ٸ� ��ü�� �����մϴ�
		Coffee ob1 = new Coffee("�Ƹ޸�ī��", 2000);
		Coffee ob2 = new Coffee("ī���", 2500);
		Coffee ob3 = new Coffee("���ǳӶ�", 3500);
		
		// �� ��ü����, �̸��� ������ ������ �־��־�� �Ѵ� (�����ڷ� ��ü ����)
//		ob1.name = "�Ƹ޸�ī��";
//		ob1.price = 2000;
//		ob2.name = "ī���";
//		ob2.price = 2500;
//		ob3.name = "���ǳӶ�";
//		ob3.price = 3500;
		
		// ���� �ٸ� ��ü 3���� Coffee �迭�� �����մϴ�
		Coffee[] arr = { ob1, ob2, ob3 };
		
		// �ݺ����� �̿��Ͽ� �� ��ü�� show() �Լ��� ȣ���մϴ�
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
	}
}







