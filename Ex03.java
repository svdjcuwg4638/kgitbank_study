package day03;

public class Ex03 {
	public static void main(String[] args) {
		// String Ŭ������ �޼���
		// 1) ���ڿ� ��ü���� ȣ���� �� �ִ� �Լ�
		String s1 = "Hello";
		char ch = s1.charAt(0); // i��° ���ڸ� char������ ��ȯ�ϴ� �Լ�
		String s2 = s1.concat(", world !! "); // ���ڿ� ����(+)
		
		boolean b1 = s1.contains("lo"); // s1�� "lo"�� �����ϴ°�? true/false
		
		boolean b2 = s1.endsWith("llo"); // s1d�� " llo"�� �����°�?
		
		boolean b3 = s1.equals("hello");// s1�� gello�� ���� �����ΰ�?
		
		int index1 = s1.indexOf("el"); // s1���� el�̶�� ���ڴ� ���°�� �ִ°�?
		
		int length = s1.length(); // s1�� ������ �� ������ΰ�?
		
		// 2) String �ڷ������� ȣ���� �� �ִ� �Լ�
	}
}
