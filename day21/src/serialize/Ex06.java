package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class Ex06 {
	public static void main(String[] args) throws IOException {
		
//		FileInputStream fis = new FileInputStream("ex03.dat");
		
		// �� ���� �̹��� �ּҸ� �ۼ�
//		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2F20160605_128%2Fbumnyun_1465131629486Pgg7k_JPEG%2F%25C0%25CC%25B9%25CC%25C1%25F6_4.jpg&type=sc960_832";
		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2FMjAxODA4MDRfMTkg%2FMDAxNTMzMzgzODYwMTA0.fOGLkfVDmnJYcSjuCjujAmkcB9lY7L9q5ZCCxGyJ-ecg.B9L7ZgXOIUCYgeioUFvpFknETDCtPlzWOJ9hv88JVRQg.JPEG.ohra1111%2F20180804_114834.jpg&type=a340";
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String contentType = conn.getContentType();	// ����� �ڿ��� ����Ʈ ������ ���ڿ� ���·� Ȯ���� �� �ִ�
		Scanner sc = new Scanner(System.in);
		String fileName;
		
		System.out.println("����Ʈ ������ " + contentType + "�Դϴ�");
		System.out.print("���ϴ� ���� �̸��� �Է��ϼ��� : ");
		fileName = sc.nextLine()+"."+contentType.split("/")[1];
		
		InputStream fis = url.openStream();
		FileOutputStream fos = new FileOutputStream(fileName);
		
		byte[] buffer = new byte[1024];
		int readBytes;
		int allCount = 0;
		
		while((readBytes = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, readBytes);
			allCount += readBytes;
			System.out.printf("=== %d byte ===\n", allCount);
		}
		
		fis.close();
		fos.close();
		sc.close();
	}
}
