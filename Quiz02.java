package day04;

public class Quiz02 {
	public static void main(String[] args) {
		
		
		
		String s1 = "1234";
		int n2 =Integer.parseInt(s1)+1;
		System.out.println(n2);
		
		int n3 = parseInt(s1)+1;
		System.out.println(n3);
	}

	private static int parseInt(String s1) {
		int num =0;
		for(int i =0; i<s1.length();i++) {
			char ch= s1.charAt(i);
			System.out.println(ch);
			if('0'<=ch && ch>='9') {
				num*=10;
				num += ch-48;
			}
			
		}
		System.out.println("num: "+num);
		
		
		return num;
	}
}
