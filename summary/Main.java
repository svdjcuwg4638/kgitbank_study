package summary;

public class Main {
	
	public static void main(String[] args) {
		
	// 5) give�� �Ű������� ������ ��ü�� Ÿ�Կ� ���� �ִ� '���' �� �����Ͽ� ����ϼ���
		
		Human h1 = new Human("Ȳ����");
		
		// Cat�� Dog�� ����Ŭ���� Animal�� ��ӹ޵��� ó���ϼ���
		Cat c1 = new Cat("������");
		Dog d1 = new Dog("����");
		Friend f1 = new Friend("������");
		
		h1.give(c1);	// Ȳ������ �����̿��� ���̸� �ش�
		h1.give(d1);	// Ȳ������ ���ڿ��� ���̸� �ش�
		h1.give(f1);	// Ȳ������ �����쿡�� �ָԹ��� �ش�
		
		
	}
}
