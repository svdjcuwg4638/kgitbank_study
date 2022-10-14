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
			char ch= s1.charAt(i);		//ch함수에 s1변수의 i번재의 글자를 가져와 저장
			System.out.println(ch);
			if('0'<=ch && ch>='9') {	//ch가 0~9면은
				num*=10;		
				num += ch-48;		//num에 숫자저장
							// - 48인 이유는 char은 아스키코드로 저장되어있기때
			}
			
		}
		System.out.println("num: "+num);
		
		
		return num;
	}
}
