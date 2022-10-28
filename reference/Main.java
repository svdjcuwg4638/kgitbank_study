package reference;

public class Main {
	
	static void show(Unit ob) {
		System.out.printf("%s : %d\n",ob.getName(),ob.getHp());
	}
	
	public static void main(String[] args) {
		
		Unit ob1 = new Unit("마린", 5,0,40);
		Unit ob2 = new Unit("저글링", 6,0,35);
		
		
		while(ob1.getHp() > 0 && ob2.getHp() >0) {
//			ob2.setHp(ob2.getHp()-(ob1.getAtk()-ob2.getDef()));
			ob1.attack(ob2);
//			ob1.setHp(ob1.getHp()-(ob2.getAtk()-ob1.getDef()));
			ob2.attack(ob1);
			show(ob1);
			show(ob2);
			System.out.println();
			
		}
		
	}
}
