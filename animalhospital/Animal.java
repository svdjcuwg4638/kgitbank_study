package animalhospital;

// �����̶�� ������ ��üȭ �Ҽ� ����
// ������ Ư���� �������� ���� ���� Ŭ������ �����ϴ� ��
// �߻�Ŭ���� : �Ϲ� �޼��嵵 ������ �� �ְ�, �߻� �޼��嵵 ������ �� �ִ�.
// �߻� Ŭ������ �̿ϼ��� ������ ���ԵǾ� �־, �����ڸ� ���� ��ü�� ���� ������ �� ����
// �߻� �޼���� �Լ��� ���ĸ� ���ǵǾ� �ְ�, �Լ��� ����(body)�� ���� �Լ�


public abstract class Animal {

	String name;
	int age;
	
	Animal(String name,int age){
		this.name=name;
		this.age = age;
	}
	
	// �߻� �޼���. �Լ� ������ ����
	public abstract void bark(); // �����Ҹ�
}
