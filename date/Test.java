package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("hh�� mm��");
		SimpleDateFormat sdf2 = new SimpleDateFormat("����ð� mm��");
		
		String input;
		Date start,end;
		String count;
		long st,et;
		
		System.out.print("�ð��� �� �Է� (hh-mm) : ");
		input = sc.nextLine();
		System.out.print("����ð� (mm)�Է� : ");
		count =sc.nextLine();
		
		start = sdf.parse(input);
		st = start.getTime();
		end = sdf.parse(count);
		et = end.getTime();
		
		long result=et-st;
		Date m = new Date();
		Stirng s = sdf2.format(m);
		
		

		System.out.println("��");
	}
}
