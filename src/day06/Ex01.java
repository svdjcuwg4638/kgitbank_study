package day06;

public class Ex01 {
	public static void main(String[] args) {
		// �迭 (array) : ���� �ڷ����� ���� �����͸� ��� �����ϴ� �ڷᱸ��
		// �迭�� ���� ���� �����ϱ� ���� index��� �ϴ� ���� ���� �̿��Ѵ�
		// �迭�� �� ��� ��Ҵ� ���� ������ �����ϴ�
		
		int[] arr = { 2, 6,8,5,6} ;
		
		//arr �迭�� 0��° ���(2)�� ���� 2�̴�
		//arr �迭�� 1��° ���(6)�� ���� 2�̴�
		//arr �迭�� 2��° ���(8)�� ���� 2�̴�
		//arr �迭�� 3��° ���(5)�� ���� 2�̴�
		//arr �迭�� 4��° ���(6)�� ���� 2�̴�
		
		// �迭�ȿ� 5���� ������ ���ԵǾ� �־, �迭�� ���̴� 5��
		
		// �迭�� ��ĭ�� 4byte
		// index ��ȣ�� 0���� �����ϴ°� arr�� ũ�Ⱑ 100�̶��ϸ�
		// 100 + (4*0)	= 100
		// 100 + (4*1)	= 104
		// ���� ���������� �ڸ��� �ű�
				
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("�迭�� ���� " +arr.length);
		
		// �迭�� ��Ҹ� �ݺ������� ����غ���
		for(int i =0; i< arr.length;i++) {	// �迭 �� ����Ʈ�� ������� , �׻� 0���� ũ������������
			System.out.println(arr[i]);	
		}
		System.out.println();
		
		// �迭�� ��� ��Ҵ� �Ϲ� ������ �����ϰ� ����Ѵ�
		
		// ����
		arr[0]=3;
		
		//����
		arr[1]+=1;
		
		//���
		System.out.println(arr[2]);
	
	}
	
}