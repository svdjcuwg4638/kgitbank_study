package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex02 {
	@SuppressWarnings("unchecked") // Ȯ�ε��� ���� Ŭ���� �ٿ� ĳ���ÿ� ���Ͽ� ������� �ʴ´�
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		FileInputStream fis = new FileInputStream("ex01.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		ArrayList<String> list = (ArrayList<String>)ois.readObject();
		System.out.println("�ҷ��� ����Ʈ : "+list);
		
		ois.close();
	}

}
