package airplane;

public class Pastor extends Human{
	
	Pastor(String name){
		super(name);
	}
	
	@Override
	void show() {
		System.out.println(name + " 입니다.");
		
	}
	
	void prayer() {
		System.out.println( name + "가 기도합니다.");
	}
}
