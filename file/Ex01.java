package file;

import java.io.IOException;
import java.io.File;	//�ڹٿ��� ������ ó���ϱ� ���� Ŭ����

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// ����ڿ��� �Է��� ����ϸ� �پ��� ����� ���� ���ܰ� �߻��� �� �ִ�!!
		// IOException : Input / Output Exception
		
//		System.out.println("���� �ϳ� �Է� : ");
//		char ch = (char)System.in.read();
		
//		System.out.println("�Է��� ���ڴ�"+ch);
		
		File f1 = new File("a.txt");				//�����̸��� ���ڿ��� ���� ( ����� )
		File f2 = new File("c:\\20221110");			// ���� �� ������ �����θ� ���ڿ��� ����
		File f3 = new File(f2,"b.txt");				// �θ� ��θ� ���Ϸ�, �����̸��� ���ڿ��� ����
		File f4 =new File ("C:\\20221110","c.txt");	// �θ� ��θ� ���ڿ��� ,������ �̸��� ���ڿ��� ����
		
		
//		�ڹٿ��� ��ġ�� �̸��� �����Ͽ� ���� ��ü�� �����ص�, ���� ������ ��������� ���� �ƴϴ�
//		�ڹٿ��� ���� ��ü �����ϴ� �۾��� ���� ������ ����� ����� ����
		
		f1.createNewFile();	//����ִ� ���ο� ������ �����Ѵ� ( ���� ���θ� boolean���� ��ȯ)
		f2.mkdir();			//����(���丮)�� �����Ѵ�  ( ���� ���θ� boolean���� ��ȯ)
		f3.createNewFile();
		f4.createNewFile();
		
		System.out.println("f2�� ���� ��� : " + f3.getAbsolutePath());
		System.out.println("f3�� �̸� : " + f3.getName());
		System.out.println("f3�� ����ũ�� (byte)"+f3.length());
		//����
		System.out.println("f3�� �����ϴ°� : "+f3.exists());
		System.out.println("f3�� �����ΰ� : " +f3.isDirectory());
		System.out.println("f3�� �����ΰ� : "+f3.isFile());
		//����
		System.out.println("f3�� �б� �����Ѱ� : "+f3.canRead());
		System.out.println("f3�� ���� �����Ѱ� : "+f3.canWrite());
		System.out.println("f3�� ���� �����Ѱ� : "+f3.canExecute());
		System.out.println();
		
		System.out.println("f2�� ���� ���� ��� : " ); 
		String[] list = f2.list();	// String ������ ����Ʈ
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println();
		
		
		
		System.out.println("�Ϸ�!!");
		
		
	}

}
