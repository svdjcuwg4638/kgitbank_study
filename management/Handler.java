package management;

import model.Student;

public class Handler {
	
	private Student[] arr = new Student[10];
	
	// 추가
	public int arrAdd(Student ob) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] ==null) {
				arr[i]=ob;
				return 1;
			}
		}
		return 0;
	}
	// 목록
	public void showArr() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null) {
				System.out.print("[" + (i+1)+"]");
				arr[i].showInfo();
				System.out.println();
			}
		}
	}
	// 삭제
	public int arr_delete(Student ob) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ob) {
				arr[i]=null;				// == 연산자는 NullpointerException  을 발생시키지 않는다
				return 1;						// . 왼쪽이 null이면 NullpointerException이 발생한다
			}
		}									// . 이 있을땐 arr[i] !=null을 넣어주자.
		return 0;
	}
	// 검색
	public Student find(String name) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] !=null &&arr[i].getName().equals(name)) {
				return arr[i];
			}
		}
		return null; 
	}

	}
	
	
	

