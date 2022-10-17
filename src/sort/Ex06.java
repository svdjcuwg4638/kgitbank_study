package sort;

import java.util.Arrays;

public class Ex06 {
	static void showArray(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {2,7,8,4,6};
		showArray(arr);
		
		Arrays.sort(arr); 	// ������ ��ü�� �������� �ʰ�, ���� �Լ��� ȣ���� �� �ִ�(static)
		showArray(arr);
		
	}
}
