package day04;

public class Ex03 {
	public static void main(String[] args) {

													//  query=검색	where=탭(이미지탭)
		String s2 = "http://search.naver.com/search.naver?query=아이유&where=image";

		
		System.out.printf("%d~%d\n",beginIndex,endIndex);
		
		int beginIndex = s2.indexOf("search");
		int endIndex = s2.lastIndexOf("/search");
		
		String s4 = s2.substring(beginIndex,endIndex);
		System.out.println(s4);
		//출력 결과 = search.naver.com
		

		
	}
}
