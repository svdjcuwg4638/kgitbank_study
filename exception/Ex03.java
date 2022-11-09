package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		int index;


		try {
			System.out.print("���° ������ ����ұ�� : ");
			index = sc.nextInt();
			System.out.printf("arr[%d] : %d\n", index, arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("������ ���� index�Դϴ�.");
		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("������ �Է��ؾ� �մϴ�");
		} finally { // ���� �߻� ���ο� ������� ������ �����ϴ� �ڵ�
			// �Լ����� return�� ���Ḧ �ǹ�������
			// return ���Ŀ��� finally�� �ݵ�� �����ϰ� �Լ��� ����ȴ�
			sc.close();
			System.out.println("���α׷� ����~");
		}
		sc.close();
		test();
	}

	static void test() {
		try {
			System.out.println("try");
			return;
		} finally {
			System.out.println("finally !!");
		}
	}

}
