package animalhospital;



public class Cat extends Animal{
// Implicit super constructor Animal() is undefined for default constructor
// Must define an explicit constructor
// ���� Ŭ������ � �����̵� ����Ŭ������ �����ڸ� ȣ���� �� �־�� �Ѵ�	
	
	Cat(String name,int age){
		super(name,age);
	}
//	The type Cat must [implement] the inherited abstract method Animal.bark()
//	Cat Ÿ���� �ݵ�� ��ӹ��� �޼��� bark() �� �����ؾ� �մϴ�
//  (Animal�� bark()�� �̱��� �����̴�)

	@Override	// ��ӹ��� �̱��� �޼��带 �������̵��Ͽ� ������ ������ְ�, ���̻� �߻�޼��尡 �ƴϰ� �Ѵ�.
	public void bark() {
		System.out.println(name +  " : �߿�");
	
	}
	
	public void grooming() {
		System.out.printf("%s�� �׷���� �մϴ�\n",name);
	}

}

