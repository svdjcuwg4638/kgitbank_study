package oop;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		
		// oop.Number Ŭ���� (Ex01)�� ����Ͽ� ��ü�� �迭 ����
		
		Number[] arr = new Number[12];
		
		// �迭(Number�� ������ �� �ִ� �������� 12��)�� �������� ��,
		// NumberŸ���� ��ü(��ü)�� ���� ����
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}	// ��� ĭ�� ����ִ�
		
		for(int i =0 ;i<arr.length;i++) {
			arr[i] = new Number(i+1);
		}// �� ĭ�� i +1 ������ ��ü�� �����Ѵ�
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}	// ��� ĭ�� ������� �ʴ�
		
		
		Random ran = new Random();
		int n = ran.nextInt(12);  // ������ �������� �����Ͽ�
		Number cpu = arr[n];		// ��ǻ�Ͱ� n��° ī�带 �̰� �Ѵ�
		
		int m = ran.nextInt(12);
		Number you = arr[m];
		
		System.out.printf("cpu : %s, you : %s\n",cpu,you);
		System.out.println(cpu.num > you.num ? "�й�" : "�¸�");
		
		
	}
}
