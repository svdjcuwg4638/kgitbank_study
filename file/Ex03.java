package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		// �׽�Ʈ ���Ͽ� ���ڿ� ����ϱ�
		
		File f = new File("C:\\20221110","c.txt");
		FileOutputStream fos = new FileOutputStream(f);
		
		String test = "Hello, world !!\n";
		test += "�ȳ��ϼ���";
				
		fos.write(test.getBytes()); // ���Ͽ� �����͸� ����� ���� ����Ʈ ������ �ɰ��� �����ؾ� �Ѵ�
		fos.flush(); 				// ��¹��ۿ� �����ִ� �����͸� ���Ϸ� �о�ִ´�
		fos.close();
		
		System.out.println("��");
	}

}
