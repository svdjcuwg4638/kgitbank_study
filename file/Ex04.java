package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		// ������ ����� ������ �ҷ��´�
		File f = new File("C:\\20221110", "d.txt");

		// ���Ͽ� ����ϱ� ���ؼ� ���� ��� ��Ʈ���� �����Ѵ� (��� ������ �����ϸ鼭 append ���ο� true�� ����)
		FileOutputStream fos = new FileOutputStream(f, true);

		// ��½�Ʈ���� ���� writer(���ڿ��� ���������� ����ϴ� Ŭ����)�� �����ϰ�, ���� ���ڵ��� UTF-8�� ����
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

		// ����Ʈ ������ �������� �ʰ�, ���ڿ� ��°�� �����ϸ� �˾Ƽ� ó���ϴ� BufferedWriter�� ����
		BufferedWriter bw = new BufferedWriter(osw);

		String now = new SimpleDateFormat("hh�� mm�� ss��").format(new Date());
		
		bw.append("�ȳ��ϼ���\n");
		bw.append("������ 11�� 10�� �Դϴ�.\n");
		bw.append(now + "\n\n");

		bw.flush();
		bw.close();
		System.out.println("��");
	}

}
