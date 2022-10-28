package accessModifier;

class Test1{
	private int n1 = 10;
	int n2 = 20;		// package�� �⺻���̹Ƿ�, ���������ڸ� �ۼ����� �ʴ´�
	protected int n3 = 30;
	public int n4 = 40;
	
	public void showN1() {
		System.out.println(this.n1);   //private�̶� ���ο����� ���� ����
	}
}

public class Ex01 {
	
	public static void main(String[] args) {
		
		Test1 ob = new Test1();
//		System.out.println(ob.n1);	// The field Test1.n1 is not visible
		ob.showN1();		// �ʵ忡 ���������� ������ ���� ������, �޼��带 ���Ͽ� ����� �� ���� �ִ�
							// ����� ����������, ���� ������ ���� ����
							// Ŭ�������� �޼��带 ���Ͽ� ����� �۾��� ������ �� �ִ�
		
		System.out.println(ob.n2);
		System.out.println(ob.n3);
		System.out.println(ob.n4);
		
//		ob.n1 +=5 ;		//The field Test1.n1 is not visible
		ob.n2 +=5 ;		// ���� �ٸ� Ŭ����������, ���� ��Ű�� ���� �����ִ�
		ob.n3 +=5 ;		// ����� �ƴ����� ���� ��Ű��
		ob.n4 +=5 ;		// ���� Ŭ���� ���ο� ������� �������Գ� ������ ����Ѵ�
		
		/*
		 * 	Ŭ������ �������
		 * 
		 * 	1) �ʵ� : ��ü�� �Ӽ��� �����Ѵ�
		 * 	2) �޼��� : ��ü�� ����� �����Ѵ�
		 *  3) ������ : ��ü ���� �� �ʱⰪ �Ҵ� �� �ʱ��۵��� �����Ѵ�
		 *  4) ���� ������ : ��ü �ܺο��� ���η� �����ϴ� ������ ����ϰų� �ź��Ѵ�
		 *  
		 *  private		: �ܺο����� ��� ������ ������� �ʴ´�(���ο����� �����Ӱ� ���� ����)
		 *  package		: ���� ��Ű�� ���� �������� ������ ����Ѵ� ( �������� �ʾ��� ��� �⺻��)
		 *  protected	: ���� ��Ű�� + ��� ���迡���� ������ ����Ѵ�
		 *  public		: ��� ������ ����Ѵ�
		 */
	}
}
