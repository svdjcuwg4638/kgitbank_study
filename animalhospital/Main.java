package animalhospital;

public class Main {
	public static void main(String[] args) {
//		The type new Animal(){} must implement the inherited abstract method Animal.bark()
//		Animal Ÿ���� ��üȭ �Ҽ� �����ϴ�(�߻� Ŭ������ �����ڸ� ���� ���� ��ü�� ������ �� ����)
//		Animal a1 = new Animal() {
			
		Cat c1 = new Cat("������",2);
		c1.bark();
		c1.grooming();
		
//		����̴� �����̴�(������)
		Animal a1 = new Cat("�Ŀ���",5);
		a1.bark();    // �������̵� �޼���� ȣ���� �� �ְ�, ���뵵 Cat�� ������ ����ȴ�
//		a1.grooming(); // grooming() Animal�� ���ǵǾ� ���� �ʾƼ� ȣ���� �� ����.
		
		
		if(a1 instanceof Cat) {	// ����, a1�� CatŸ���� ��ü�̸�
			Cat c2 = (Cat) a1;	// �ٿ�ĳ���� �ؼ� �ٸ� ������ �����صΰ�
			c2.grooming();		// ��������� ȣ���Ѵ�
		}
		Dog d2 = new Dog("����",4);
		d2.bark();
		d2.tailling();
		
		Animal a2 = new Dog("�۸���",4);
		a2.bark();
		
		if(a2 instanceof Dog) {
			Dog d1 = (Dog) a2;
			d1.tailling();
			System.out.println(d1);
			System.out.println(a2);
		}
		// ������ ��ü�� �����ϴ���, �����Ǵ� �ڷ���(Ŭ����)�� ���� ȣ���� �� �ִ� �޼��尡 �޶�����
		// ��, �������̵� �޼���� ����Ŭ������ ���ǵǾ� �ֱ� ������ ȣ���� �� �ְ�
		// ������ ������� ������ ȣ�� �� ����Ǵ� ������ ����Ŭ������ �ۼ��� ������ ������
		
	
	}
}
