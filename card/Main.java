package card;

public class Main {
	public static void main(String[] args) {
		
		// ��� ��ü�� ���� ���� �����ϰ� �Ϸ��� static
		Card.setSize(9, 9);
		
		// ��ü���� ���� �ٸ� ���� ������ �Ϸ��� non - static
		Card ob1 = new Card("��","10");
		Card ob2 = new Card("��","A");
		
		ob1.show();
		ob2.show();
	}
}
