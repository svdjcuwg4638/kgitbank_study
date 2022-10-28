package reference;

class Unit5 {
	String name;
	int atk;	
	int hp;		
}

public class Ex05 {
	// ���� ������ attack�̶�� �Լ��� �����Ѵٸ�...
	
	static void attack(Unit5 attacker, Unit5 target) {
		target.hp -= attacker.atk;
	}
	
	public static void main(String[] args) {
		Unit5 ob1 = new Unit5();
		ob1.name = "����";
		ob1.atk = 5;
		ob1.hp = 40;
		
		Unit5 ob2 = new Unit5();
		ob2.name = "���۸�";
		ob2.atk = 6;
		ob2.hp = 35;
		
		while(ob1.hp > 0 && ob2.hp > 0) {
			attack(ob1, ob2);	// 2���� ��ü�� ���޹޾Ƽ� �ϳ��� ������, �ϳ��� ������� ó��
			attack(ob2, ob1);	// ��ġ�� �ٲپ ���� �Լ��� ȣ��
			
			System.out.printf("ob1 : [%s, %d]\n", ob1.name, ob1.hp);
			System.out.printf("ob2 : [%s, %d]\n", ob2.name, ob2.hp);
			System.out.println();
		}
	}
}
