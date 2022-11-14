package model;

public class ComputerScieneceStudent extends Student{

	private int java;
	private int network;
	private int linux;

	
	public ComputerScieneceStudent(int linux,int network
			,int java,String name, int kor, int eng, int mat) {
		super(name, kor, eng, mat);
		this.java = java;
		this.network = network;
		this.linux = linux;
		// �����ڿ��� �հ� ����� ������ �ʰ�, getter�� ��û���� �� �հ�� ����� ����Ͽ� ��ȯ
	}
	@Override
	public void showInfo() {
		System.out.printf("[�İ�]�̸� : %s, �հ� : %d ��� : %.2f\n",name,getSum(),getAvg());
		
	}

	@Override
	public void showDetail() {
		System.out.println("�İ�");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("�ڹ� : " + java);
		System.out.println("������ : " + linux);
		System.out.println("��Ʈ��ũ : " + network);
		System.out.println("�հ� : " + getSum());
		System.out.printf("��� : %.2f",getAvg());
		System.out.println();
		
	}

	@Override
	public int getSum() {
		sum = kor+eng+mat+java + linux + network;
		return sum;
	}

	@Override
	public double getAvg() {
		avg=sum/6.0;
		return avg;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getNetwork() {
		return network;
	}

	public void setNetwork(int network) {
		this.network = network;
	}

	public int getLinux() {
		return linux;
	}

	public void setLinux(int linux) {
		this.linux = linux;
	}



}
