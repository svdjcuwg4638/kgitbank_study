package airplane;

public class Actor extends Human{
	
	Actor(String name){
		super(name);
	}
	
	@Override
	void show() {
		System.out.println(name + " �Դϴ�.");
		
	}
	
	void drama() {
		System.out.println(name + "�� ������ �մϴ�.");
	}
}
