package day01;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// updown game �����
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int cpu, user, cnt=0;
		// 0 ) �ڵ� ���࿡ �ʿ��� ������ ã�Ƽ� ������ �����Ѵ�
		// �ʿ��ϴٸ�, �ʱⰪ�� �����Ѵ�
		
		// 1) ��ǻ�Ͱ� �������� �ϳ� �̰� �ϰ�, ����ڿ��� �ݺ��Ͽ� ������ �Է¹޴´�
		cpu = ran.nextInt(100)+1;
		
		
		// 2) �Է¹��� ������ ��ǻ�Ͱ� ���� ���� ��ġ�ϴ��� �Ǻ��Ѵ�
		while(true) {
			// �ݺ��� ������ �� ����, �õ��� Ƚ���� 1 ������Ų��
			cnt++;
			System.out.println(" ������ ���������� 1~100 : ");
			user = sc.nextInt();
		// 2-1) ��ġ�ϸ� �ݺ����� �ߴ��Ѵ�
			if(user == cpu) {
				break;
			}
		// 2-2) ���亸�� ũ�� down�� ����Ѵ�
			else if (user>cpu) {
				System.out.println("down!!");
			}
			else {
				System.out.println("up!!");
			}
		// 2-3) ���亸�� ������ up�� ����Ѵ�
		}
		// 3) �ݺ��� �ߴܵǸ� ������ ����ϰ� ������ ���� �����Ѵ�
		System.out.printf("�����Դϴ�!! %dȸ���� ������ �������ϴ�.\n",cnt);
		
		sc.close();
	}
}
