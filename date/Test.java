package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("hh시 mm분");
		SimpleDateFormat sdf2 = new SimpleDateFormat("경과시간 mm분");
		
		String input;
		Date start,end;
		String count;
		long st,et;
		
		System.out.print("시간과 분 입력 (hh-mm) : ");
		input = sc.nextLine();
		System.out.print("경과시간 (mm)입력 : ");
		count =sc.nextLine();
		
		start = sdf.parse(input);
		st = start.getTime();
		end = sdf.parse(count);
		et = end.getTime();
		
		long result=et-st;
		Date m = new Date();
		Stirng s = sdf2.format(m);
		
		

		System.out.println("끝");
	}
}
