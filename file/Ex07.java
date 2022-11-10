package file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("C:\\20221110\\ex06.txt"));
		List<Person> list = new ArrayList<Person>();
		while(sc.hasNextLine()) {
			String line = sc.nextLine();		// �̸� : ������, ���� :30��
			line = line.replace("�̸�:", "");	// ������, ���� : 30��
			line = line.replace("���� :", "");	// ������, 30��
			line = line.replace("��", "");		// ������, 30
			line = line.replace(" ", "");		// ������ ,30
					
				
			String[] arr =line.split(",");
			Person p = new Person(arr[0], Integer.parseInt(arr[1]));
			list.add(p);
		}
		sc.close();
		
		list.forEach(p -> System.out.println(p));
		
	}

}
