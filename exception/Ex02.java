package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.print("���� �Է� : ");
		try { // ���� �ڵ带 �õ��Ͽ�
			n1 = sc.nextInt();
			System.out.println("n1 : "+n1);
		}catch (InputMismatchException e) { // ������ Ÿ���� ���ܰ� �߻��ϸ� ��ü e�� �޴´�
//			e.printStackTrace();// ���� �߻� ������ ������� ����Ѵ�
			System.err.println("������ �Է��ؾ� �մϴ� !!");
		}
		System.out.println("��");
		sc.close();
		
		
		
	}

}
