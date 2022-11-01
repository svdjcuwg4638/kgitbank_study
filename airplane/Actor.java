package airplane;

public class Actor extends Human{
	
	Actor(String name){
		super(name);
	}
	
	@Override
	void show() {
		System.out.println(name + " 입니다.");
		
	}
	
	void drama() {
		System.out.println(name + "가 연극을 합니다.");
	}
}
