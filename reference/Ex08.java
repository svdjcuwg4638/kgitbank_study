package reference;
// �� ���̰� �ϳ��� ���� ������ �޴� ��Ȳ�� �ڵ�� ǥ���ϱ�
class Kid{
	String name;
	Ball ball;	// ���� ������ �� �ִ� �������� ( �ʱ���¿����� ����� ���� ����)
	
	Kid(String name){
		this.name= name;
	}
	
	
	void takeBall(Ball ball) {
		this.ball = ball;
	}
	void throwBall(Kid other) {	// �ٸ� ���̸� �����Ͽ� ��󿡰� ���� �Ѱ��ְ�, �ڽ��� ���� ������� �Լ�
		
		other.ball = this.ball;	// ���� ������ �����̱� ������
		this.ball=null;			// �ڽ��� ball�� null�� �ٲ۴�
		System.out.printf("%s�� %s���� ���� ������\n",this.name,other.name);
	}
}
class Ball{	//�ƹ� ���뵵 ������ �⺻�����ڰ� ���������
	
}

public class Ex08 {

	public static void main(String[] args) {
		Kid ob1 = new Kid("������");
		Kid ob2 = new Kid("������");
		Ball b = new Ball();
		
		ob1.takeBall(b);		// �����̰� ���� �ֿ���
		
		ob1.throwBall(ob2);		// �����̰� �����̿��� ���� ������
		ob2.throwBall(ob1);		// �����̰� �����̿��� ���� ������
		
		// ��ü�� ���� ����� ��� �ִ� ���� �����̿��� ������ (?)
		// null.throwBall(ob2) -> NullpointerException
		
		Kid ob3 = null;
		ob3.throwBall(ob2);
	}
}
