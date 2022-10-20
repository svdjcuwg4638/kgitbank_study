package array;

import java.util.Scanner;

public class Ex01 {
	static void show(int[] arr) {
		System.out.printf("arr[%d] : { ",arr.length);
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.printf(i == arr.length-1 ? " }\n " : " , ");
		}
	}
	public static void main(String[] args) {
		// ���̰� �ڵ����� �����ϴ� �迭 ������
		// Reference Type �� ����
		
		// �ڹٿ��� primitive�� ������ ��� ������ �����ʹ� ���� ������ Ȱ���Ѵ�
		// ���� ������ �� ��ü�� ��ü�� �ƴϰ�, �����ϴ� ������ �ٲܼ� �ִ�
		
		Scanner sc =new Scanner(System.in);
		int length = 3;
		int[] arr = new int[length];
		int[] tmp ; 	// ���ο� �迭�� ���� ���� ���� (�ʱⰪ�� ����)
		int input ;	// ����ڰ� �Է��ϴ� ������ �޴� ����
	
		// c�� �迭�� ���̿� ������ ���� �� ����. �ڹٴ� �����ϴ�
		
		show(arr);
		
		// ���� 1 ) ����ڰ� 0�� �Է��� �� ����, ������ �Է¹޴´�
		// ���� 2 ) �Է¹��� ������ ��� �迭�� ����Ǿ�� �Ѵ�
		// ���� 3 ) ������ �����ϱ� ����, ������ �������� �ʴ´�
		// ���� 4 ) ����, �迭�� ��� ���� �Է¹޾Ҵٸ�, �������̸�ŭ ������Ų ���ο� �迭�� ����
		// ���� 5 ) ���ο� �迭�� ���� �迭�� ���ڸ� ��� �����Ͽ� ������ �־�� �Ѵ�
		
		while(true) {
			System.out.print("���� �Է� : ");
			input = sc.nextInt();
			if(input == 0 ) {
				break ;
			}
			for(int i =0; i < arr.length ; i++) {
				if(arr[i]==0) {		//��ĭ�� ã�Ƽ�
					arr[i]=input;	// �Է°��� �����ϰ�
					break ; 		// for Ż��
				}
			}
			
			show(arr);
			
			if(arr[arr.length-1] !=0) {					//�迭�� �� ã����
				tmp = new int [arr.length + length];	// ���ο� �迭�� �����ϰ�
				for(int i =0; i<arr.length;i++) {		// ���� �迭����
					tmp[i]=arr[i];						// �ű� �迭�� �����Ѵ�
				}
				arr = tmp;
			}
		}
		System.out.println("��");
		sc.close();
	}
}
