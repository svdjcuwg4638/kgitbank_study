package student;

import java.io.Serializable;

public class Student implements Serializable {
	// Serialize : �ڹ� ��ü�� ������ ���ڿ� ���·� ��ȯ���� �ʰ�, ���� ���� �״�� �����ϱ� ���� ��Ģ
	// ��ü�� byte������ �����Ͽ� �����ϰ�, �ٽ� �ҷ��ö� �������Ͽ� ��ü�� ������ �� �ִ� ��Ģ

	String name;
	int kor,eng,mat,sum;
	double avg;
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor+eng+mat;
		avg = sum / 3.0;
	}
	public void show() {
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ kor);
		System.out.println("���� : "+ eng);
		System.out.println("���� : "+ mat);
		System.out.println("�հ� : "+ sum);
		System.out.printf("��� : %.2f\n\n", avg);
	}
	public String getFileData() {
		String format = "%s,%d,%d,%d,%d,%.2f\n";
		return String.format(format, name,kor,eng,mat,sum,avg);
	}
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

}
