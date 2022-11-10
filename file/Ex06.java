package file;

import java.io.FileWriter;
import java.io.IOException;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		
		return String.format("�̸�: %s , ���� : %d�� ",name,age);
	}
	
	
}

public class Ex06 {

	public static void main(String[] args) throws IOException{
		Person ob1 = new Person("������", 30);
		Person ob2 = new Person("ȫ��ȣ", 41);
		Person ob3 = new Person("���ܺ�", 5);
		
		FileWriter fw = new FileWriter("C:\\20221110\\ex06.txt");
		
		fw.write(ob1.toString() + "\n");
		fw.write(ob2.toString() + "\n");
		fw.write(ob3.toString() + "\n");
		
		fw.flush();
		
		fw.close();
		
		System.out.println("��");
	}

}
