package airplane;

public class Doctor extends Human {
	
	Doctor(String name){
		super(name);
	}
	
	@Override
	void show() {
		System.out.println(name + " �Դϴ�.");
		
	}
	
	void heal(Human other) {
		System.out.println(this.name + "�� " +other.name + "����ġ���߽��ϴ�.");
	}
}
