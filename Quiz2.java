package day01;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// ���� �� ������ �̵��ϴµ� �� 3���� �ð��� �ҿ�ȴٰ� �����Ѵ�
		// ����ڿ��� �̵��� ������ ���� �Է¹޾Ƽ� �ɸ� �ð��� ����ϼ���
		// ��, �ð��� 60���� �ʰ��ϸ� �ð��� ���� ����� ����ϼ���
		int time,hour,buscount,min;
	
		Scanner sc = new Scanner(System.in);
		System.out.printf("�̵��� ������ ���� �Է��ϼ��� : ");
		buscount = sc.nextInt();
		time = buscount*3;
		if (time>60) {
			hour= time/60;
			min = time%60;
			System.out.printf("�ҿ�� �ð��� %d�� %d�� �Դϴ�.\n",hour,min);
		}
		else {
			System.out.printf("�ҿ�� �ð��� %d���Դϴ�.\n",time);
		}
		
		sc.close();

		
	
		
		
		
	}
}
