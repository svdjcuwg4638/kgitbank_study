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
		// C:\\20221110\\e.txt ������ �����ϰ�
		// Scanner�� �̿��Ͽ� Ű����� ���ڿ��� �Է¹޾Ƽ�
		// �Է¹��� ���ڿ��� ��� ���Ͽ� ����ϴ� �ڵ带 �ۼ��ϼ���
		// ��, ���Ͽ� ����� �̷���������� ���� �ð��� ����ϰ� �ϰ�
		// ������ ����Ǵ°��� �ƴ϶� �߰��ǰԲ� �����غ�����.
		
		// ǥ�� �Է� -> ���α׷� -> �������
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� >>>>>");
		String ment = sc.nextLine();
		File f1 = new File("C:\\20221110","e.txt");
		
		String now = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��").format(new Date());
		
		// false ������ �������� ������� ���
		FileOutputStream fos = new FileOutputStream(f1,true);
		
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		// BufferedWriter�� ������ ��밡��!
		BufferedWriter bw = new BufferedWriter(osw);
		
		osw.append(now+"\n");
		osw.append(ment+"\n\n");
		
		osw.flush();
		osw.close();
		sc.close();
			
			
		
		System.out.println("��");
	}

}
