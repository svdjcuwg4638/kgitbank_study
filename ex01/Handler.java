package ex01;

// 여러 DTO를 제어하는 클래스 -> 메서드
// 여러 DTO를 보관하는 클래스 -> 배열

// 추가 삭제등 기능들을 관리하고 저장소역할도함

public class Handler {
	
	Human[] arr = new Human[5]; // 데이터 보관 창고
	

	String selectAll() {	// 전체 목록 요청이 들어오면 결과를 문자열 형태로 return 한다
		String result="";
		for(int i =0; i< arr.length;i++) {
			if(arr[i]!=null) {
				result += "(" + (i+1) + ")";
				result += arr[i].toStr();
				result += "\n";
			}
		}
		return result;
	}

	int insert(Human ob) {	// 추가 요청이 들어오면 ob를 배열의 빈칸에 추가하고 결과를 정수 형태로 return 한다
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==null) {
				arr[i]=ob;
				return 1;
			}
		}
		return 0;
	}

	String search(String find) {	// 검색 요청이 들어오면 find와 일치하는 Human의 정보를 문자열 형태로 return 한다
		String result="검색된 내용이 없습니다\n.";
		for(int i=0; i<arr.length;i++) {
			String name =arr[i].name; 
			
			if(name.equals(find)) {
				result =arr[i].toStr();
				result += "\n";
			}
			return result;
		}
		return result;
	}

	int delete(String find) {	// 삭제 요청이 들어오면 find와 일치하는 Human의 정보를 제거하고, 결과를 정수로 return한다	
		for(int i =0;i < arr.length;i++) {
			String name = arr[i].name;
			if(name.equals(find)) {
				arr[i] =null;
				
				
				return 1;
			}
		}
		return 0;
	}

	public int update(String find, int age) {
		String name;
		for(int i =0; i< arr.length;i++) {
			name = arr[i].name;
			if(name.equals(find)) {
				arr[i].age = age;
				return 1;
			}
		}
		return 0;
	}
	
	
}
