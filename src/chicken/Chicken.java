package chicken;
/*
 *  ��� �ۿ��� �ֹ� ������ ġŲ �޴��� ����� �ϳ��� ��ü�� �����ϰ� �ʹ�
 *  ���� �Ӽ��� �ʿ��ұ�?
 *  
 *  �귣��, ����(������), �޴��̸�, ����, ����
 *  �Ӽ��� �����Ǹ�, Ŭ������ ��� �ʵ�� �����ϸ� �ȴ�
 *  
 *  �Ӽ� �߽��� ��ü�� ǥ���� Ŭ������ �ۼ��� ��
 *  ���� ��ü�� �����ϸ鼭 �������� �ʰ�, 
 *  ���� ��ü�� ������� �����ϸ鼭 �����Ѵ�
 */
public class Chicken {
	// Ŭ������ ��� �ʵ�� �ʱⰪ�� �������� �ʾƵ�, 0�� �´� ������ �ʱ�ȭ�ȴ�
	String brand;
	String store;
	String menu;
	int price;
	double starpoint;
	
	// ��ü�� ������ ��, �ʿ��� �ʱ� �۾�(�ʵ� �ʱ�ȭ)�� ������ �����ڸ� �ۼ��Ѵ�
	// ���ǵ� �����ڸ� ������ �ʰ���, ��ü�� ������ �� ����!!
	Chicken(String brand, String store, String menu, int price, double starpoint){
		this.brand= brand;
		this.menu= menu;
		this.price=price;
		this.starpoint=starpoint;
		this.store=store;
	}
	
	// �Ӽ��� �����Ǹ� ���õ� �Լ��� �޼���� �ۼ��Ѵ�
	void show() {
		String form = "%s %s)%s\t%,d�� (��%.1f)"; //���ĸ� ����
		form = String.format(form, brand,store,menu,price,starpoint);// �� �ֱ�
		System.out.println(form);	// ���
	}
}
