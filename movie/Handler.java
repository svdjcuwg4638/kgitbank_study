package movie;

public class Handler {
	
	static Movie[] arr = new Movie[10];
	
	
	// ���
	static String getList() {
		String result = "";
		for(int i =0; i<arr.length;i++) {
			if(arr[i]!=null) {
				result += "(" + i + ")";
				result += arr[i].getInfo();
				result +="\n";
			}
			
		}
		return result;
	}
	
	// �˻�
	static String search(String keyword) {
		String result ="";
		for(int i =0; i<arr.length;i++) {
			String find =arr[i].title;
			if(find.equals(keyword)) {
				result +=arr[i].getDetail();
				return result;
			}
		}
		return result;
	}
	
	//�߰�
	static int insert(Movie ob) {
		for(int i =0; i < arr.length;i++) {
			if(arr[i]==null) {
				arr[i]=ob;
				return 1;
			}
		}
		return 0;
	}
	
	//���� ��ȣ
	static int delete(int idx) {
		if(arr[idx]!=null) {
			arr[idx]=null;
			return 1;
		}
		return 0;
	}
	
	// ���� �̸� 
	static int delete(String Keyword) {
		for(int i =0; i < arr.length;i++) {
			String st = arr[i].title;
			if(st.contains(Keyword)) {
				arr[i]=null;
				return 1;
			}
		}
		return 0;
	}

}
	

