package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) throws IOException{
		File f = new File("a.txt");				// �����ų� ���ϰų�?
		FileWriter fw = new FileWriter(f,true);	// append : true / false;	
		// autoFlush : �ڵ����� flush
		// ���������� FileWriter�� ����Ѵ�  Flush�� ������ ���ٸ�
		fw.append("hello");
		fw.append(",");
		fw.append("world\n");
		
		fw.close();
		
		System.out.println("��");
	}

}
