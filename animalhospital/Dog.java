package animalhospital;

public class Dog extends Animal {
	
	
	Dog(String name,int age) {
		super(name,age);
	}
	
	public void tailling() {
		System.out.println(name + "�� ������ ���ϴ�.");
	}
	@Override
	public void bark() {
		System.out.println(name + "���۸��ϰ� ¢���ϴ�.");
		
	}
	
}
