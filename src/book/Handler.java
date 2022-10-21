package book;


public class Handler {
	
	Book[] arr = new Book[20];
	
	// �����ڿ� ����, �迭�� ���� �����͸� �̸� ���� �� �ֵ��� �����غ���
	Handler() {
		System.out.println("�⺻ �����ڷ� ��ü ���� (���� ������ ����)");
	}
	
	Handler(Book[] arr) {
		for(int i = 0; i < arr.length; i++) {
			this.arr[i] = arr[i];
		}
		System.out.println("�迭�� ���޹޾Ƽ� ��ü ���� (���� ������ ����)");
	}
	
	// �߰� �Լ�
	int insert(Book ob) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}
	
	// ��� �Լ�
	String getList() {
		String data = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				data += i + 1 + "] ";
				data += arr[i].toStr();
				data += "\n";
			}
		}
		data += "\n";
		return data;
	}
	
	// ���� �Լ�(index�� ����)
	int delete(int index) {
		if(arr[index - 1] != null) {
			arr[index - 1] = null;
			return 1;
		}
		return 0;
	}
	
	// ���� �Լ�(name���� ����)
	int delete(String name) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
	
	
	
	
	
	
}







