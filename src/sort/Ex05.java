package sort;

public class Ex05 {
	static void showArray(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// �迭 �� ��Ҹ� ���Ͽ� �����ϱ� ���� ���� ����غ���
		
		int[] arr = {2,7,8,4,6};
		showArray(arr);
		for(int i=0;i<arr.length-1;i++) {			// 0,1,2,3
			for(int j = i+1;j<arr.length;j++) {	// (i + 1) ~ 4
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		// �� ���� ���ϱ� ���� �� ������ i�� ���ϰ�, �� ����� j�� ���Ͽ�
		// ���ذ�  ����� ũ�⿡ ���� �� ������ ���� ��ȯ�ϸ鼭
		// ������ �����ϴ� ����� ���� �����̶�� �Ѵ�
		// (n��° ĭ�� �´� ���� ���� ���� �����Ͽ� ��ġ��Ų��)
		System.out.println();
		showArray(arr);
	
	}

}
	
