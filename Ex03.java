package array;

import java.util.Scanner;

public class Ex03 {
	static void show(String[] arr) {
		System.out.printf(" arr[%d] : { ",arr.length);
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length-1 ? " }\n " : " , ");
		}
	}
	public static void main(String[] args) {
		String[] tmp;
		int length=3;
		String[] arr = new String[length];
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("�迭�� ���ڿ� ���� ����\n���� �Է½� ����");
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			input = sc.nextLine();	// next() �� ����Ű�� �Է��� ��� �Է����� ó������ �ʴ´�
			if("".equals(input)) break;
			for(int i =0; i<arr.length;i++) {
				if(arr[i] == null) {
					arr[i]=input;
					break;
				}
			}
			show(arr);
			if(arr[arr.length-1] != null) {
				tmp = new String[arr.length+length];
				for(int i =0; i<arr.length;i++) {
					tmp[i]=arr[i];
				}
				arr=tmp;
			}
			
		}
		System.out.println("��");
		sc.close();
	}
}
