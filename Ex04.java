package day04;

public class Ex04 {
	public static void main(String[] args) {
		
		String s1 = "abc@!#$..hjk";
		
		System.out.println(s1.contains("abc"));
		System.out.println(s1.contains(".."));
		
		if(s1.contains("hjk")) {
			s1 = s1.replace("hjk","xyz");
		}
		if(s1.contains(".")) {
			s1 = s1.replace(".", "*");
				
		}
			
		System.out.println(s1);
		
		String s2 ="   Hello,world !!   ";
		String s3 = s2.replace(" ", "");
		System.out.println(s3);
		
		String s4 = s2.trim();
		System.out.println(s4);
		
		String s5 ="    <div>\n        Hello\n    </div>    ";
		System.out.println(s5);
		
		String s6 = s5.trim();	// ���۰� ������ ������ ����
		System.out.println(s6);
		
		
		
		// .�� �������� 2�� �̻� ��ġ�� �� ����
		String s7 = "1.........2";
//		if(s7.contains("...")) {
		while(s7.contains("..")) {
			s7 = s7.replace("..", ".");
		}
		System.out.println(s7);
		
		String s8 = "abcABC123!@#...xyz";
		// �� ���ڿ����� �����ڸ� ������ �������� ��� �����ϱ�
		String s9 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ";
		String s10 = "";
		
		for(int i =0;i<s8.length();i++) {
			char ch = s8.charAt(i);
			if(s9.contains(ch+"")) {
//				s10+=ch;
				s10 = s10.concat(ch+"");
			}
		}
		System.out.println(s10);
		
		int num = Integer.parseInt("1234");	//���ڿ� ���ڸ� int�������� ����
		System.out.println(num+1);
		
	}
}
