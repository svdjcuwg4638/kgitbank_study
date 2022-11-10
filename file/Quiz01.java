package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws IOException {
		// C:\\20221110\\e.txt 파일을 생성하고
		// Scanner를 이용하여 키보드로 문자열을 입력받아서
		// 입력받은 문자열을 대상 파일에 기록하는 코드를 작성하세요
		// 단, 파일에 기록이 이루어질때마다 현재 시간을 기록하게 하고
		// 내용이 변경되는것이 아니라 추가되게끔 설정해보세요.
		
		// 표준 입력 -> 프로그램 -> 파일출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >>>>>");
		String ment = sc.nextLine();
		File f1 = new File("C:\\20221110","e.txt");
		
		String now = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초").format(new Date());
		
		// false 설정시 기존내용 사라지고 덮어씀
		FileOutputStream fos = new FileOutputStream(f1,true);
		
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		// BufferedWriter이 없더라도 사용가능!
		BufferedWriter bw = new BufferedWriter(osw);
		
		osw.append(now+"\n");
		osw.append(ment+"\n\n");
		
		osw.flush();
		osw.close();
		sc.close();
			
			
		
		System.out.println("끝");
	}

}
