package abstractClass;

// �Ϲ����� Ŭ������ ��ü�� �����ϱ� ���� �������� �ۼ��Ѵ�
// �߻����� ������ ���ԵǸ� ��üȭ�� �� ����.
// �߻� Ŭ������ �����ڸ� ���Ͽ� ���� ��ü�� ������ �� ����

abstract class Test1 {
	Test1(){
		System.out.println("Test1������ ȣ��!!");
	}
	public void function1() {
		System.out.println("������ �����ϴ� ��ü���� �޼���");
	}
	public abstract void function2();
}

class Test2 extends Test1{

	@Override	// ������ �״�� �����ϸ鼭, ������ �״�� �ۼ��Ͽ� �����
	public void function2() {
		System.out.println("�̱��� �޼��带 ������ ����");
		
	}
	
}

public class Ex01 {
	
	// �߻�ȭ : ���� ��ü�� ��� Ư���� �����Ͽ� ���α׷� ���� �ݿ��Ѵ�
	// �ʵ�� �Ӽ��� �ۼ��ϰ�, �޼���� ����� ǥ���ϴµ�, �޼����� ��ü���� ������ ����� ���� ���� �ִ�
	
	// �߻�޼��� : ������ ���ǵǾ� ������, ������ ���ǵ��� ���� �޼���
	// �߻� Ŭ���� : �߻� �޼��带 ������ �� �մ� Ŭ����(�Ϲ� �ż��嵵 ���� �����ϴ�)
	
	public static void main(String[] args) {
//		Test1 ob = new Test1();	// �߻� Ŭ������ �����ڴ� ���� ȣ���� �� ����(��üȭ�� �Ұ����ϴ�)
		Test2 ob2 = new Test2();
		ob2.function1();
		ob2.function2();
	}
}
