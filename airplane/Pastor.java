package airplane;

public class Pastor extends Human{
	
	Pastor(String name){
		super(name);
	}
	
	@Override
	void show() {
		System.out.println(name + " �Դϴ�.");
		
	}
	
	void prayer() {
		System.out.println( name + "�� �⵵�մϴ�.");
	}
}
