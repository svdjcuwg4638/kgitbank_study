package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) throws ParseException {
		// java.util.Date
		// �پ��� �����͸� ������ �� primitive�� String�� �ƴ� �� �߿��� ���� ���� ����ϴ� �ڷ���
		
		// ��ǻ�ʹ� 1970�� 1�� 1���� 0�� 0�� 0�ʸ� �������� ���� �ð��� �ʴ����� ����Ѵ�
		// �ڹٿ��� 1�� ��� 1/1000�� (millisecond)�� ����Ѵ�
		
		
		Date today = new Date();	// �����ڿ� ���� �������� ������, ��ü ���� ������ ��¥�� ����
		System.out.println(today);
		
		
		
		long ln1 = today.getTime();
		System.out.printf(" ln1 : %,d\n" ,ln1);
		
		// ��¥�� ���ڿ� �������� �����ϰ� �ٲ��ִ� �ڷ��� : SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s1 = sdf.format(today);	// today�� �� ���Ŀ� ���� ���ڿ��� ��ȯ
		System.out.println(s1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String s2 = sdf2.format(today);
		System.out.println("������"+s2+"�Դϴ�");
		
		Date d2 = sdf.parse("2022-12-25");
		System.out.println(d2);
				//@Deprecated �����ϴ� ������������� ��
		
	}
}
