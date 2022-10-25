package teacher;

public class Handler_teach {
	
	static Movie_teach[] arr = new Movie_teach[10];
	
	static String getList() {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += (i + 1) + ") ";
				result += arr[i].getInfo();
				result += "\n";
			}
		}
		return result;
	}
	
	static String search(String keyword) {
		String result = "�˻� ����� ã�� �� �����ϴ�";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getDetail().contains(keyword)) {
				// i��° ĭ�� ��ĭ�� �ƴϰ�, i��° ����� ���뿡 keyword�� ���ԵǾ� ������
				result = arr[i].getDetail();
				break;	// ���ϴ� ��Ҹ� �ϳ� ã�Ҵٸ� ���̻� �ݺ����� �ʴ´�
			}
		}
		return result;
	}
	
	static String searchList(String keyword) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getDetail().contains(keyword)) {
				// i��° ĭ�� ��ĭ�� �ƴϰ�, i��° ����� ���뿡 keyword�� ���ԵǾ� ������
				result += arr[i].getInfo() + "\n";	
				// ���ϴ� ��Ҹ� ã���� �ٸ� ��ҵ� �߰��� �˻��Ͽ� ����� ������Ų��
			}
		}
		return result;
	}
	
	static int insert(Movie_teach ob) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}
	
	static int delete(String keyword) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].title.equals(keyword)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
}




