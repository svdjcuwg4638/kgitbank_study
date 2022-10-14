package day04;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		String id = "itbank";
		String pw ="it";
		String idd,pww;
		
		String userid, userpw;
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 userid, userpw를 입력받고,
		// Id/pw 모두 일치하면 로그인 성공
		// ID는 일치하지만 PW가 일치하지 않으면 [비밀번호 오류]
		// ID가 일치하지 않으면 [계정을 찾을수 없습니다] 라고 출력하세요
		
		System.out.print("아이디를 입력하세요 : ");
		idd = sc.nextLine();
		
		
		
		if(id.equals(idd)) {
			System.out.print("비밀번호를 입력하세요 : ");
			pww = sc.nextLine();
			if(pw.equals(pww)) {
				System.out.println("로그인 성공");
			}
			else System.out.println("비밀번호 오류");
		} else System.out.println("계정을 찾을수 없습니다.");
		sc.close();
	}
}
