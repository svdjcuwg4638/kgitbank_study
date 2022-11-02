package model;

public abstract class Student {
	//필드
	// protected 상속관계이거나 같은 패키지이면 공유하겠다.
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;
	protected int sum;
	protected double avg;
	
	// 생성자

	public Student(String name, int kor, int eng, int mat) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;	
	}
	
	// 추상 메서드
	public abstract int getSum(); 
	public abstract double getAvg();
	public abstract void showInfo();	// 이름 합계 평균을 한줄에 출력 (목록)
	public abstract void showDetail();	// 모든 속성값을 각 한줄마다 출력 (검색)

	
	
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
