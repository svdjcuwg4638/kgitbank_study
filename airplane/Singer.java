package airplane;

public class Singer extends Human{
	
	Singer(String name){
		super(name);
	}
	@Override
	void show() {
		System.out.println(name + " �Դϴ�.");
		
	}
	
	void sing() {
		System.out.println(name + "�� �뷡�� �մϴ�.");
	}
}
