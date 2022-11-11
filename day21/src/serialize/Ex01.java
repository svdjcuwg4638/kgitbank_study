package serialize;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args)throws IOException {
		
		ArrayList<String> list = new ArrayList<String>(
			Arrays.asList(new String[] {
			"������","ȫ��ȣ","���ܺ�"
			})
			
		);	
		FileOutputStream fos = new FileOutputStream("ex01.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);	//implement Serializable �� ��ü�� byte ������ �����Ͽ� ����\
//		Byte[] buf = (Byte[])list.toArray();
//		oos.writeBytes(buf);
		oos.write("������".getBytes());
		oos.flush();
		oos.close();
		
		System.out.println(list);
			
		
	}
}
