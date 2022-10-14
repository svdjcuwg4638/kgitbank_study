package day04;

public class Ex04 {
	public static void main(String[] args) {

		
		
		// .은 연속으로 2개 이상 배치될 수 없다라는 식을 만들고 싶을때
		String s7 = "1.........2";
//		if(s7.contains("...")) {
		while(s7.contains("..")) {
			s7 = s7.replace("..", ".");
		}
		System.out.println(s7);
		
		String s8 = "abcABC123!@#...xyz";
		// 위 문자열에서 영문자를 제외한 나머지는 모두 제거하기
		String s9 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ";
		String s10 = "";
		
		for(int i =0;i<s8.length();i++) {	
			char ch = s8.charAt(i);		// s8의 변수에 인덱스에맞는 글자를 ch에 char형태로 저장
			if(s9.contains(ch+"")) {	// contains는 문자열에 사용가능하니 ch+""로 문자열로 변환				
//				s10+=ch;		// s9에 포함된 문자가 ch에 있다면 s10빈 문자열에 ch넣어주기
				s10 = s10.concat(ch+"");
			}
		}
		System.out.println(s10);
		//결과 abcABCxyz

	}
}
