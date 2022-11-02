package model;

public class EnglishLinguisticStudent extends Student{

	private int literature;	//����
	private int translation; // ����
	
	public EnglishLinguisticStudent(String name, int kor,
			int eng, int mat,int literature,int translation) {
		super(name, kor, eng, mat);
		this.literature = literature;
		this.translation = translation;
		//  ��� �޾Ƽ� ���� ������ �����ϱ�, this�� ���ٰ���
		this.sum = kor + eng + mat + literature + translation;
		// ����Ŭ�������� ������� �ʵ��̴ϱ� super�� ���� ����
		this.avg = this.sum/5.0;
		
	}
	@Override
	public void showInfo() {
		System.out.printf("[�������]�̸� : %s, �հ� : %d ��� : %.2f",name,sum,avg);
		
	}

	@Override
	public void showDetail() {
		System.out.println("������");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("���� : " + literature);
		System.out.println("���� : " + translation);
		System.out.println("�հ� : " + sum);
		System.out.printf("��� : %.2f\n",avg);
		System.out.println();
		
	}

	@Override
	public int getSum() {
		
		return sum;
	}

	@Override
	public double getAvg() {
		
		return avg;
	}

	public int getLiterature() {
		return literature;
	}

	public void setLiterature(int literature) {
		this.literature = literature;
	}

	public int getTranslation() {
		return translation;
	}

	public void setTranslation(int translation) {
		this.translation = translation;
	}

}
