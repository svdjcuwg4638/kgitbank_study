package chicken;

public class Handler {	// �����͸� �����ϰ�, ����� �����ϴ� Ŭ����
	
	
	// ���� �����͸� �����ϱ� ���� �迭
	Chicken[] arr = new Chicken[10];
	
	// Chicken Ÿ���� ��ü�� ���޹޾Ƽ� �迭�� ��ĭ�� �����ϴ� ���(�޼���)
	int insert(Chicken ob) {
		// data �迭���� ��ĭ��(null)��  ã�Ƽ�, �߰��ϰ� �ݺ� ����
		for(int i =0; i< arr.length;i++) {
			if(arr[i]==null) {
				arr[i]=ob;
				return 1;		//1���� �߰��Ǿ����ϴ�
			}
		}
		return 0; // 0���� �߰��Ǿ����ϴ�(��ĭ�� ������ �߰��� �� ����)
	}
	
	// data �迭�� ������ �� ��ĭ�� �ƴѰ͸� ȭ�鿡 ����ϱ�
	void show() {
		for(int i =0; i<arr.length;i++) {
			if(arr[i] != null) {
				arr[i].show();
			}
		}
	}
}
