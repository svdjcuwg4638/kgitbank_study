package model;

public abstract class Student {
	//�ʵ�
	// protected ��Ӱ����̰ų� ���� ��Ű���̸� �����ϰڴ�.
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;
	protected int sum;
	protected double avg;
	
	// ������

	public Student(String name, int kor, int eng, int mat) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;	
	}
	
	// �߻� �޼���
	public abstract int getSum(); 
	public abstract double getAvg();
	public abstract void showInfo();	// �̸� �հ� ����� ���ٿ� ��� (���)
	public abstract void showDetail();	// ��� �Ӽ����� �� ���ٸ��� ��� (�˻�)

	
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	
}
