package sort;

public class Ex04 {
	static void showArray(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		// �迭�� �� ��Ҹ� ��ȯ�ϱ�
		// �迭�� �� ��Ҵ� �Ϲ� ������ �����ϰ� ����Ѵ�
		
		int[] arr = {10,20};
		
		showArray(arr);
		
		int tmp = arr[0];
		arr[0]=arr[1];
		arr[1]=tmp;
		
		showArray(arr);
				
		
	}
}
