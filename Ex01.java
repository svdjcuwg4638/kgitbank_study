package day01;

import java.util.Scanner;

*/
public class Ex01 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("itbank라고 입력하세요 : ");
		String str1 = sc.nextLine();
		
		String str2 = "itbank"; 
		String str3 = new String("itbank");
		String str4 = "itbank";
		
		System.out.println(str1 == str2);	//false
		System.out.println(str1 == str3);	//false
		System.out.println(str2 == str3);	//false
		System.out.println(str2 == str4);	//true
		sc.close();
				
		// str2번과 4번은 같은 곳을 바라보게 된다
		// 하지만 1,3번 str은 새로운 공간에 itbank을 저장한다
		
	}
	
}
