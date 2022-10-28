package accessModifier;


class Food{
	
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// private �ʵ��� getter/setter�� �ڵ����� �ۼ��ϱ�
	// source - generate getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class Ex03 {
	public static void main(String[] args) {
		// Ŭ���� Food�� �̿��Ͽ� ���� �ٸ� ������ ��ü�� 2�� �����ϰ�
		// �� ��ü�� �̸��� ������  printf() �� �̿��Ͽ� ���� �������� ����ϼ���
		
		Food f1 = new Food("�ܹ���", 5000);
		Food f2 = new Food("���", 3500);
		
		System.out.printf("%s : %d��\n",f1.getName(),f1.getPrice());
		System.out.printf("%s : %d��\n",f2.getName(),f2.getPrice());
	}
}
