package day02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// if����
		
		
		/*
		 *  �̿� �ð��� ���� ����� å���ϴ� ���̱ⱸ�� �ִ�
		 *  �⺻��� 3õ������ �����Ͽ� 10�д� �߰���� 500���� �߻��Ѵ�
		 *  ���ǥ�� �Ʒ��� ���� ��Ģ���� �����Ѵ�
		 *  
		 *   0~30	 3000��
		 *   31~40		3500��
		 *   41~50		4000��
		 *   ~~~
		 *   
		 *   �̿�ð��� ������ �Է¹޾Ƽ�, �ݾ��� ����Ͽ� ����ϴ� �ڵ带 �ۼ��ϼ���
		 */
		
		int time;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̿��� �ð��� �Է����ּ��� : ");
		time = sc.nextInt();
		
		if (time >30) {

			
			System.out.printf("�̿�ð��� %d���̸� ����� :%,d�� �Դϴ�.\n",time,3000+(500*(((time-31)/10)+1)));
			
		}
		else {
			System.out.printf("�̿�ð��� %d���̸� ����� :3,000�� �Դϴ�.\n",time);
		}
		
		
		
		
		sc.close();
		
		
		
		
		
	}
	static int getFee(int time) {
		int time;
		if (time >30) {

			
			System.out.printf("�̿�ð��� %d���̸� ����� :%,d�� �Դϴ�.\n",time,3000+(500*(((time-31)/10)+1)));
			
		}
		else {
			System.out.printf("�̿�ð��� %d���̸� ����� :3,000�� �Դϴ�.\n",time);
			return time;
		}
		return time;
	}
}
