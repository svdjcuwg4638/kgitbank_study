package day04;

public class Quiz04 {
	
	
	
	
	public static void main(String[] args) {
	
		//주민등록번호를 전달받아서 나이와 성별을 출력하는 함수를 작성하세요
		// 인자는 정수 혹은 문자열로 전달할 수 있습니다
		// 결과는 String.format을 이용하여 나이, 성별을 문자열형식으로 반환합니다
		
		String s1 = profile(9305162345678L);		//long
		String s2 = profile("930516-2345678");		//string
		
		System.out.println(s1);	// 30세, 여성입니다
		System.out.println(s2);	// 30세, 여성입니다
	}

	private static String profile(long date) {
		String result = "";
		return null;
	}

	private static String profile(String date) {
		String result ="";
		return null;
	}
}
