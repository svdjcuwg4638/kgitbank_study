package exception;

import java.util.Scanner;

class MyException extends Exception {
	// ���� ���ϴ� ���ο� ���� ��ü�� �����Ϸ���, ���� Ŭ������ �ۼ��ϰ� Exception Ŭ������ ��ӹ޴´�
	
	private static final long serialVersionUID = 4784325408937262347L;

	@Override
	public String toString() {
		return "�̹� �Էµ� ���Դϴ�";
	}
}

public class Ex04 {
	// �ߺ�Ȯ���ϴ� �Լ�
	static boolean isDuplicate(String[] arr, String str) {
		for(int i = 0; i < arr.length; i++) {
			if(str.equals(arr[i])) {
				return true;
			}
		}
		return false;
	}
	
	// �迭�� ��� ĭ�� ���ڿ��� ����ִ��� Ȯ���ϴ� �Լ�
	static boolean isFull(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				return false;
			}
		}
		return true;
	}
	
	// �迭�� �� ĭ�� ��Ҹ� �߰��ϴ� �Լ�
	static void insert(String[] arr, String str) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = str;
				break;
			}
		}
	}
	
	// main
	public static void main(String[] args) {
		
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(isFull(arr) == false) {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			if(isDuplicate(arr, str)) {
				// ���� ������ ���ο� ���� ��ü�� �����Ѵ�
				try {
					// ���� ���� ���� Ŭ�����ε� ���ܸ� �����ϰ� ����� �� �ִ�
					MyException ex = new MyException();
					throw ex;	// throw�� ���� ��ü�� ������
					
				} catch(MyException e) {	// catch�� ���� �� �ִ�
					
//					System.out.println("�̹� �Էµ� �������Դϴ�");
//					System.out.println(e);
					e.printStackTrace();
					continue; 	// break�� �ݴ�. �ݺ������� ���� Ż���Ͽ� �ٽ� �ݺ����� �����Ѵ�
				}
			}
			insert(arr, str);
		}
		// �迭 ���
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sc.close();
		
	}
}
