package sort;

public class Ex08 {
	// ���ڿ� �迭�� ����
	public static void main(String[] args) {
		String[] arr = {"������","ȫ��ȣ","��ȣ��","�̺���","��ȣ��"};
		
		showArray(arr);
		// 1) ���ڿ��� ������ �迭�� ����
		// 2) ����(char)�� �������̴� (������ �ڵ带 ������ �����Ѵ�)
		// 3) ���ڿ��� �����ϴ� ù��° ���ڸ� ���Ͽ� �����Ѵ�
		// 4) ����, ù��° ���ڰ� ������, �� ���� ���ڳ��� ���Ѵ�
		
		System.out.println("������".compareTo("ȫ��ȣ"));
		System.out.println("������".compareTo("��ȣ��"));
		
		// 5) ���� �ΰ��� ���� ���Ѵ� 				n1 > n2
		// 6) �� ������ ���� 0���� ũ�� �۳ĸ� �Ǻ��Ѵ� 	n1 -n1 > 0
		// 7) s1.compareTo(s2) �� �ι��ڿ��� ���̸� ������ ��ȯ�Ѵ�
		
		for(int i =0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				
			}
		}
		showArray(arr);
	}

	private static void showArray(String[] arr) {
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}
