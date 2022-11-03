package object;

class MyNumber extends Object{
	
	int num;
	
	public MyNumber(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public boolean equals(Object obj) {
		// this�� obj�� ���Ͽ� ��ġ�ϸ� true�� ��ȯ�ϰ�, �ƴϸ� false�� ��ȯ�Ѵ�\
		if(obj instanceof MyNumber) {	// �񱳴���� ������ ��
			return this.num == ((MyNumber)obj).num;
		}
			

		return false;	//Ŭ������ �ٸ��� ���� �ʿ���� false ��ȯ
		
	}
}

public class Ex03 {

	public static void main(String[] args) {
		MyNumber n1 = new MyNumber(10);	// new �����ڸ� ����ߴٸ� ���ο� ������ ��ü�� �����Ѵ�
		MyNumber n2 = new MyNumber(10);
		
		System.out.println("n1 == n2 : " + (n1 == n2));	// �� ������ ���� ����� �ٶ󺸴°�?
		System.out.println("n1.equals(n2) : " + n1.equals(n2));	
		System.out.println(n1.getClass());
		System.out.println(n2.getClass());
	}

}
