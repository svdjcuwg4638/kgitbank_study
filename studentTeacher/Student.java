package studentTeacher;

import java.io.Serializable;

public class Student implements Serializable {
	// Serialize : �ڹ� ��ü�� ������ ���ڿ� ���·� ��ȯ���� �ʰ�, ���̳ʸ� ���� �״�� �����ϱ� ���� ��Ģ
	// ��ü�� byte������ �����Ͽ� �����ϰ�, �ٽ� �ҷ��ö� �������Ͽ� ��ü�� ������ �� �ִ� ��Ģ

	private static final long serialVersionUID = -3828725009399551792L;
	String name;
	int kor, eng, mat, sum;
	double avg;
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;
		avg = sum / 3.0;
	}
	
	public void show() {	// ȭ�鿡 ����ϴ� ����
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("�հ� : " + sum);
		System.out.printf("��� : %.2f\n", avg);
		System.out.println();
	}
	
	public String getFileData() {	// �ؽ�Ʈ ���Ͽ� ������ ����
		String format = "%s,%d,%d,%d,%d,%.2f\n";
		return String.format(format, name, kor, eng, mat, sum, avg);
	}
}
