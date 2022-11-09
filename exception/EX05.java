package exception;

import java.util.Scanner;

class MyOperatorException extends Exception {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {	// override from Object
		return super.toString();
	}

	@Override
	public String getMessage() {	// override from Throwable
		return "�����ڿ��� +, -, *, / �� �Է��� �� �ֽ��ϴ�";
	}
}

public class EX05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, result;
		char oper;
		
		// �� ������ �����ڸ� �Է¹޾Ƽ� ����� ȭ�鿡 ����ϴ� �ڵ带 �ۼ��ϼ���
		// �ش� �������� �߻��� �� �ִ� ���ܸ� �ִ��� ���� Ȯ���Ͽ� try ~ catch �������� �ۼ��ϼ���
		// �ϳ��� try���� ���� catch�� ����� �� ������, �������� ����˴ϴ�
		// ���� ���ܺ��� ���� �ۼ��ϰ�, �������� ���ܴ� �Ʒ��ʿ� �ۼ��մϴ�
		
		try {
			System.out.print("n1 : "); 	n1 = Integer.parseInt(sc.nextLine());
			System.out.print("���� : "); 	oper = sc.nextLine().charAt(0);
			System.out.print("n2 : "); 	n2 = Integer.parseInt(sc.nextLine());
			
			switch(oper) {
				case '+':	result = n1 + n2; break;
				case '-':	result = n1 - n2; break;
				case '*':	result = n1 * n2; break;
				case '/':	result = n1 / n2; break;
				default:  	
					MyOperatorException ex = new MyOperatorException();
					throw ex;
			}
			System.out.println("��� : " + result);
			
		} catch(NumberFormatException e) {	// ���ڿ��� ���ڷ� ��ȯ�� �� �߻��� �� �ִ� ����
			System.out.println("������ �Է��ؾ� �մϴ�");
			
		} catch(ArithmeticException e) {	// ������ 0���� ������ �߻��� �� �ִ� ����
			System.out.println("������ 0���� ���� �� �����ϴ�");
			
		} catch(MyOperatorException e) {	// �����ڿ� ������ ���� �̿� ���� �Է��� ��� �߻���Ű�� ����
			e.printStackTrace();
			
		} catch(Exception e) {		// ��� ���ܸ� �޾Ƽ�
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();	// ���� �߻� ��Ȳ�� �����ϸ鼭 ����Ѵ� (�⺻��)
			
		} finally {
			sc.close();
		}
		System.out.println("����");
	}
}
