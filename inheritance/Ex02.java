package inheritance;


class Pos{	// 2������ ��ǥ�� ǥ���� �� �ִ� ��ü�� ����� ���� Ŭ���� Pos
	int x;
	int y;
	
	
	Pos(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	void showPos() {
		System.out.printf("x : %d, y : %d\n",x,y);
	}
}

//class Pos3D{	// ����� ������� �ʰ�, 3������ ��ǥ�� ǥ���ϱ� ���� Ŭ������ �ۼ�
//	int x;
//	int y;
//	int z;
//	Pos3D(int x, int y, int z) {
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//	
//	void showPos() {
//		System.out.printf("x : %d, y : %d , z : %d\n",x,y,z);
//	}
//	
//}


class Pos3D extends Pos{
	// 1) Ư���� �����ִ� Ŭ������ �θ� Ŭ����, ���� Ŭ����, ���� Ŭ������� �Ѵ�
	// 2) Ư���� �����޴� Ŭ������ �ڽ� Ŭ����, ���� Ŭ����, ���� Ŭ������� �Ѵ�
	// 3) extends �� Ȯ���ϴ� ��� ���̴�. ���� Ŭ������ ������ ���� Ȯ���� ���ο� Ŭ������ ���Ѵ�
	// 4) ����Ŭ������ ����Ŭ������ �����ڸ� ȣ���ؾ� ��ü�� ������ �� �ִ�
	// 5) �̋�, ��õ��� ������ ����Ŭ������ �⺻�����ڸ� ȣ���ϰ� �ȴ�.
	// 6) ����Ŭ������ �����ڿ��� ����Ŭ���� �����ڸ� ȣ���Ϸ��� this��� super�� ����Ѵ�
	// 7) ��ӹ��� �޼����� ������ �״�� �����ϸ鼭 ���븸 ���� �ۼ��� �� �ִ� (�������̵�)
	
//	int x;	// Pos Ŭ�������� �����޾Ƽ� �Ⱥ������� ������ ����
//	int y;  // Pos Ŭ�������� �����޾Ƽ� �Ⱥ������� ������ ����
	int z;
	
	Pos3D(int x, int y,int z){
		super(x,y);		// Pos(x, y)
		this.z = z;
	}
//	void showPos() {	// Pos Ŭ�������� �����޾Ƽ� �Ⱥ������� ������ ����
//		System.out.printf("x : %d, y : %d\n",x,y);
//	}
	@Override			// �� �Լ��� �������̵� �Ǿ����ϴ�
	void showPos() {	// ��ӹ��� �޼���� ������ ��ġ�ϰ�, ������ ���� �ۼ��Ǿ����ϴ�.
		System.out.printf("x : %d, y : %d z : %d \n",x,y,z);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Pos ob1 = new Pos(2,3);
		ob1.showPos();
		
		Pos3D ob2 = new Pos3D(5, 8, 7);
		ob2.showPos();
	}
}
