package ex02;



public class Handler {
	
	 Student[] arr =new Student[5];
	
	// 목록,추가 ,단일 검색(이름),수정,삭제
	//목록
	String showAll() {
		String result ="";
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=null) {
				result +="(" + (i+1)+")";
				result += arr[i].toStr();
				result += "\n";
			}
		}
		return result;
	}
	
	int insert(Student ob) {
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==null) {
				arr[i]=ob;
				return 1;
			}
		}
		return 0;
	}
	
	String serch(String name) {
		String result="검색된 내용이 없습니다.";
		for(int i =0; i<arr.length;i++) {
			if(arr[i].name.equals(name)) {
				result = arr[i].toStr();
				return result;
			}
		}
		return result;
	}
	
	int fix(Student ob) {
		for(int i =0; i<arr.length;i++) {
			if(arr[i].name.equals(ob.name)) {
				arr[i].mat=ob.mat;
				arr[i].eng =ob.eng;
				arr[i].kor = ob.kor;
				return 1;
			}
		}
		return 0;
	}
}
