package airplane;

public class Singer extends Human{
	
	Singer(String name){
		super(name);
	}
	@Override
	void show() {
		System.out.println(name + " 입니다.");
		
	}
	
	void sing() {
		System.out.println(name + "가 노래를 합니다.");
	}
}
