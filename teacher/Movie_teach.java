package teacher;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie_teach {
	String title;		// ����
	String director;	// ����
	String[] actors;	// ���
	String genre;		// �帣
	int runningTime;	// ����Ÿ��(��)
	Date openningDate;	// ��������
	double grade;		// ����
	
	// Ŭ������ ��� ����ʵ带 �Ű������� ���޹޾Ƽ�, ��ü�� �����ϴ� ������ �ڵ����� �����
	// source - generate constructor using fields
	
	Movie(String title, String director, String[] actors, String genre, 
			int runningTime, Date openningDate, double grade) {
		
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.genre = genre;
		this.runningTime = runningTime;
		this.openningDate = openningDate;
		this.grade = grade;
	}
	
	String getInfo() {	// ��Ͽ��� ����� ������ ������ ���ڿ��� ��ȯ
		String form = "[%s] %s, %s (%.2f)";
		String result = String.format(form, title, actors[0], actors[1], grade);
		return result;
	}
	
	String getDetail() {	// �˻����� ����� ���� ������ ��� ���ڿ��� ��ȯ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String form  = "-----------------------\n";
		form += "���� : %s\n";
		form += "���� : %s\n";
		form += "�⿬ : %s\n";	// �迭�� ���ڿ��� ��ȯ�ϴ� �߰� �Լ��� Ȱ���ؾ���
		form += "�帣 : %s\n";
		form += "�󿵽ð� : %d��\n";
		form += "�������� : %s\n";		// yyyy�� MM�� dd�� �������� ��ȯ�ؾ� ��
		form += "���� : %.2f\n";
		form += "-----------------------\n";
		
		String result = String.format(form, title, director, 
				arrToString(actors), genre, runningTime,
				sdf.format(openningDate), grade);
		
		return result;
	}
	
	String arrToString(String[] arr) {	// ��� ����� �迭�̹Ƿ�, ���ڿ��� ��ȯ�ؾ� ����� �� �ִ�
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			if(i != arr.length - 1) {
				result += ", ";
			}
		}
		return result;
	}
	
	
}
