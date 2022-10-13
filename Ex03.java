package day02;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.io.File;

public class Ex03 {
	public static void main(String[] args) throws IOException{
		
		
		String path = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjA2MjRfMjYx%2FMDAxNjU2MDU1Mjc2Mzc1.0lPhoY5Hgvvcb1z2lgDyJkD_hlfNBSVAx0T6cgyA_jwg.v0Oud-Eghc_SLdd2R-gl9qr5XefapW9NjCYBQqR3sHcg.JPEG.kj2k2%2FResized%25A3%25DFResized%25A3%25DF20220408%25A3%25DF192035%25A3%25A81%25A3%25A9.jpeg&type=sc960_832";
		
		BufferedInputStream bis = null;
		FileOutputStream fos =null;
		
		try {
			bis = new BufferedInputStream(new URL(path).openStream());
			fos = new FileOutputStream(new File("my.jpg"));
			
			byte[] buffer = new byte[1024];	// ����, 1����Ʈ�� ó���ϸ鼭 �Լ�ȣ���� �ʹ� ����
			int count, total =0;			// ������ ũ�⸸ŭ �����͸� ��Ƽ� �ѹ��� ó���Ѵ�
			
			while((count = bis.read(buffer,0,1024))!=-1) {
				total += count;
				System.out.println(total);
				fos.write(buffer,0,count);
			}
		}finally {
			bis.close();
			fos.close();
		}
		System.out.println("��");
	}
}
