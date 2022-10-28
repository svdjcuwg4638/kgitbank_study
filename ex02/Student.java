package ex02;

public class Student {
	String name;
	int kor,eng,mat;
	int sum ;
	double avg;
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}
	
	String toStr() {
		
		String form = "%4s 국어 : %3d점 영어 : %3d점 수학 : %3d 합계 : %3d 평균 : %.2f";
		sum =kor+eng+mat;
		avg=(sum*1.0)/3;
		form = String.format(form, name,kor,eng,mat,sum,avg);
		
		
		return form;
	}

}
