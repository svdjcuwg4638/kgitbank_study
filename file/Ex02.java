package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		// �ؽ�Ʈ ���� ���� �ҷ�����
		// Scanner�� ǥ������¿� ���� ���ܴ� ó���Ǿ� ������, ���� ������� ���ܸ� ���� ó���ؾ� �Ѵ�
		
		File f = new File("C:\\20221110", "b.txt");
		Scanner sc = new Scanner(f);
		
		String content = "";
		
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			content += data;
			content += "\n";
		}
		sc.close();
		System.out.println(content);
	}
}
