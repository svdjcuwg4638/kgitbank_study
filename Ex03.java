package array;

import java.util.Scanner;

public class Ex03 {
	static void show(String[] arr) {
		System.out.printf(" arr[%d] : { ",arr.length);
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length-1 ? " }\n " : " , ");
		}
	}
	public static void main(String[] args) {
		String[] tmp;
		int length=3;
		String[] arr = new String[length];
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("배열에 문자열 저장 시작\n엔터 입력시 종료");
		while(true) {
			System.out.print("문자열 입력 : ");
			input = sc.nextLine();	// next() 는 엔터키만 입력한 경우 입력으로 처리하지 않는다
			if("".equals(input)) break;
			for(int i =0; i<arr.length;i++) {
				if(arr[i] == null) {
					arr[i]=input;
					break;
				}
			}
			show(arr);
			if(arr[arr.length-1] != null) {
				tmp = new String[arr.length+length];
				for(int i =0; i<arr.length;i++) {
					tmp[i]=arr[i];
				}
				arr=tmp;
			}
			
		}
		System.out.println("끝");
		sc.close();
	}
}
