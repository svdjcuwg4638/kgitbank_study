package ex01;

// ���� DTO�� �����ϴ� Ŭ���� -> �޼���
// ���� DTO�� �����ϴ� Ŭ���� -> �迭

// �߰� ������ ��ɵ��� �����ϰ� ����ҿ��ҵ���

public class Handler {
	
	Human[] arr = new Human[5]; // ������ ���� â��
	

	String selectAll() {	// ��ü ��� ��û�� ������ ����� ���ڿ� ���·� return �Ѵ�
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

	int insert(Human ob) {	// �߰� ��û�� ������ ob�� �迭�� ��ĭ�� �߰��ϰ� ����� ���� ���·� return �Ѵ�
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==null) {
				arr[i]=ob;
				return 1;
			}
		}
		return 0;
	}

	String search(String find) {	// �˻� ��û�� ������ find�� ��ġ�ϴ� Human�� ������ ���ڿ� ���·� return �Ѵ�
		String result="�˻��� ������ �����ϴ�\n.";
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

	int delete(String find) {	// ���� ��û�� ������ find�� ��ġ�ϴ� Human�� ������ �����ϰ�, ����� ������ return�Ѵ�	
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
