package exception;

import java.util.Scanner;

public class Ex01 {
	
	// ���ڿ��� ���ڷθ� �����Ǿ� �ִ°� �Ǻ��ϴ� �Լ�
	static boolean isNumeric(String data) {		// ���ڿ��� ���޹޾Ƽ�
		for(int i =0; i< data.length();i++){	// ���ڸ��� �ݺ��Ͽ�
			char ch = data.charAt(i);	// i���� ���ڰ�
			if(ch < '0' || '9' < ch) {	// 0 ~9 ���̸� ����ٸ�
				return false;			// false
			}
		}
		return true;	// ����� ���ڰ� ���ٸ� true
	}
	
	public static void main(String[] args) {
		// Exception : ���α׷����� �߻��� �� �ִ� ���� ��Ȳ�� ��ü�� ��޴� Ŭ����
		// java.lang.Exception
		
		// ���� : ���� �� �� �ִ� ���� ��Ȳ, ������ ó���� ���� ó���� �� ����
		// ���� : �ڵ� ���� �������� �߻��ϴ� ���α׷� ���ο��� ó���� �� ���� ���� ��Ȳ
		
		Scanner sc = new Scanner(System.in);
		int n1;
		String input;
		
		System.out.println("���� �Է� :");
//		n1 = sc.nextInt();
		input = sc.next();
		if(isNumeric(input)) {	// if�� ���� ������ �ٸ��� ���ȴ�
			n1 = Integer.parseInt(input);
			System.out.println("n1 : "+n1);
		}
		else {
			System.err.println("������ �Է����� �ʾҽ��ϴ� !!");
		}
		
		sc.close();
		
//		int[] arr = new int[5];
//		arr[5] = 30;
//		System.out.println(arr[5]);
		
//		Exception : ��� ������ �ֻ��� Ŭ����
	}
}
