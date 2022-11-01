package airplane;

public class Doctor extends Human {
	
	Doctor(String name){
		super(name);
	}
	
	@Override
	void show() {
		System.out.println(name + " 입니다.");
		
	}
	
	void heal(Human other) {
		System.out.println(this.name + "이 " +other.name + "님을치료했습니다.");
	}
}
