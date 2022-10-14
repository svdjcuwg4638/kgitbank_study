package day04;

public class Quiz03 {
	public static void main(String[] args) {
		// 1) 정수를 여러개 전달받아서, 최소값을 반환하는 함수를 작성하세요
		int n1= min(10,5,11);
		System.out.println("n1 : "+n1);
		
		// 2) 문자열에서 특정 글자가 몇개 포함되어있는지 반환하는 함수를 작성하세요
		int n2=count("Life is too short, you need python",'e');
		System.out.println("n2 : "+n2);
		
		// 3) 문자열 형태로 카드번호를 입력받아서, 길이가 맞는지 확인하는 함수를 작성하세요
		// 전체길이, -의 개수, 분리했을때 각 덩어리의 길이
		boolean b1 = check("2134-1234-1234-2134");	//true
		boolean b2 = check("867-2356123-1234567");	//false
		boolean b3 = check("930516-2345678");		//false
		System.out.printf("%d, %d, %d,\n",b1,b2,b3);
		
	}

	static boolean check(String string) {
		boolean flag = true;
		
		if(string.length() != 19) flag=false;
		
		if(count(string,'-')!=3) flag =false;
		
		String[] arr = string.split("-");
		if(arr.length !=4)
			flag =false;
		
		for(int i = 0; i < arr.length;i++) {
			String s = arr[i];
			
			if(s.length() !=4) flag = false;
		}
		
		return flag;
	}

	static int count(String string, char c) {
		int cnt = 0;
		for(int i =0; i<string.length();i++) {
			char current = string.charAt(i);
			if(current==c) {
				cnt++;
			}
		}
		return cnt;
	}

	static int min(int... args) {
		int ret = 100000000;
		
		for(int i = 0; i < args.length;i++) {
			int num = args[i];
			if(ret>num) {
				ret=num;
			}
		}
		
		return ret;
	}
}



