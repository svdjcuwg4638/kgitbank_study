package day01;

import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		// ��� (control statement)
		// ���α׷��� ���� �帧�� �����ϴ� ����(������ �Ϸ������� �ʴ�)
		
		Random ran = new Random();
		int n1 = ran.nextInt(10)+1;
		int n2 = ran.nextInt(10)+1;
		int n3 = ran.nextInt(10)+1;
		int min =n1;
		System.out.printf("%d, %d, %d\n",n1,n2,n3);
		// �Ʒ��� �ڵ带 �ۼ��Ͽ� 3���� ������ ���� ���� ���� ȭ�鿡 ����ϼ���
		
		if (min >n2) {
			min =n2;	
		}
		else if (min>n3) {
			min = n3;
		}
		System.out.println(min);
		}

}
