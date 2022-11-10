package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) throws IOException{
		File f = new File("a.txt");				// 덮을거냐 붙일거냐?
		FileWriter fw = new FileWriter(f,true);	// append : true / false;	
		// autoFlush : 자동으로 flush
		// 최종적으론 FileWriter을 사용한다  Flush가 문제가 없다면
		fw.append("hello");
		fw.append(",");
		fw.append("world\n");
		
		fw.close();
		
		System.out.println("끝");
	}

}
