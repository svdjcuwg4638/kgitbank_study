package day03;

import java.util.Scanner;

public class Ex01 {
	
	static int pow(int num,int count) {
		int result = 1;
		for(int i =0 ; i<count;i++) {
			result *= num;
		}
		return result;
	}
	public static void main(String[] args) {
		// �Լ� : Ư�� ���� ������ ����(�ڵ��� ����)
		// x���� ����, ���� �ٸ� y���� ����Ͽ� ��ȯ�ϴ� �ڵ��� ����
		// y = f(x)
		
		// �Լ� = function = ���
		int n1 = pow(2,10);
		System.out.println("n1 "+n1);
		
		// �Լ��� ���� : 	�Լ������¸� �����Ѵ�. ��ȯ�ڷ���, �Լ��̸�, �Ű������� �ۼ��ϰ�
		//				�Լ��� ����Ǹ� ������ �ڵ带{} ���ʿ� �ۼ��Ѵ�
		// 				�Լ��� �������� ��ȯ �ڷ����� �´� ���� �ݵ�� return�ؾ� �Ѵ�
		
		// �Լ��� ȣ�� : 	�̹� ���ǵǾ� �ִ� �Լ��� �̸��� �θ��鼭(call) ���ڰ��� �����Ѵ�
		// 				�Լ��� ȣ���ϸ� ���ǵ� ������ �����ϰ�, ������� ȣ���ڸ��� ��ȯ�Ѵ�
					
		// �ڹ��� �Լ��� �ݵ�� ��ȯ�ڷ����� ��õ� ���� ��ȯ�ؾ� �Ѵ�
		// ����� ���� �бⰡ ������������ �ݵ�� ��ȯ���� ó�O�־�� �Ѵ�
			
		
		// �������� ) ������ ���밪�� ��ȯ�ϴ� �Լ� abs�� �ۼ��Ͽ� �׽�Ʈ�ϼ���
		// ���⼭ �Լ� ȣ���ڵ带 �ۼ��մϴ�
		
		// ����� ����մϴ�
		int n2;
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� �Է� : ");
		n2 = sc.nextInt();
		
		System.out.printf("%d�� ���밪�� %d�Դϴ�.",n2,test1(n2));
		sc.close();
		
		
		
	 }

	// ���밪�� ��ȯ�ϴ� �Լ��� ���� �Ʒ��� �ۼ��մϴ�
	
	static int test1(int n1) {
		int n2;
		n2 = (n1 <0)? -n1 : n1;
		
		
		return n2;
	}
	

}

