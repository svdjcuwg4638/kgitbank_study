package day06;

public class Ex02 {
	public static void main(String[] args) {
		
		// �迭 �����
		// 1) �迭�� Reference Type�̰�, ������ ����� �����ϴ� �����̴�(��ü�� �ƴϴ�)
		
		
		int[] arr1; //������ �迭�� ������ �� �ִ� ���������� ����(���� �迭�� ����)
		int arr2[]; // c������ �����̸� �ڿ� []�� �ۼ��ؾ߸� �Ѵ� (�ڹٴ� �Ѵ� ����)
		
		int[] arr3 = {2,3,4,5,6};
		// primitibe type�̰ų�, �ٸ� ������ ������� ������ �߰�ȣ������ ���� ����
		
		int[] arr4 = new int[] {10,20,30,40,50};
		// ��ü�� �迭�� �����ϱ� ���ؼ��� ���� ���� new �ڷ���[] �������� ���� ������
		
		int[] arr5 = new int[5];
		// �迭�� ��Ҹ� ������� �ʰ�, ��ĭ������ �迭�� ������ ���� ������, ���̰� �ʿ���
		// �̶�,�迭 ��� ����� �ʱⰪ�� �ڷ����� �´� 0������ ������
		
//		int[] arr6 = new int [5]= {1,2,3,4,5};
		// �迭�� ������ ���� ���� Ȥ�� ��Ҹ� ����ϸ�, �Ѵ� ����ϸ� ������ Ʋ��
		
		System.out.println(arr3);//  Ư�� ��ü�� �����ϱ� ������, ��ü�� hashcode�� ��µ�
		showArray(arr3);
		
		showArray(arr5);
		
		// 2) �迭�� ����Ű�� ������ ����Ÿ���̹Ƿ�, �ٸ� ����� ������ �� �ִ�
		int[] test  = {1,2,3};
		showArray(test);
		
		test =arr4;
		showArray(test);
	
	}
	static void showArray(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();
	}
}
