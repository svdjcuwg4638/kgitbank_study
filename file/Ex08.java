package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Menu{
	String name;
	int price;
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void show() {//��¿�
		System.out.printf("��ǰ�� : %s,���� : %,d��\n",name,price);
	}
	
	@Override
	public String toString() {// ���Ͽ� ����ϴ� �뵵
	
		return String.format("%s:%d\n", name,price);
	}
	
}

public class Ex08 {
	public static void main(String[] args) throws IOException {
		File f = new File("ex08.txt");
		FileWriter fw = new FileWriter(f);
		
		Menu ob1 = new Menu("�Ƹ޸�ī��", 2000);
		Menu ob2 = new Menu("ī���", 2500);
		Menu ob3 = new Menu("��ü��", 3500);
		Menu ob4 = new Menu("�����̵�", 2700);
		Menu ob5 = new Menu("�ݵ����", 5000);
		
		Menu[] arr = new Menu[] {ob1,ob2,ob3,ob4,ob5};
		
		for (int i = 0; i < arr.length; i++) {
			fw.append(arr[i].toString());
		}
		fw.flush();
		fw.close();
		System.out.println("���峡");
	}

}
