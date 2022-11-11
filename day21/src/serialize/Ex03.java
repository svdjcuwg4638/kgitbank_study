package serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Todo implements Comparable<Todo>,Serializable{
	
	// 1) private �ʵ带 �ۼ��ϰ� �����Ѵ�
	// 2) ���� ���� ��Ŭ��  - s,o(�ʵ带 �Ű������� ���޹޴� ������ �ڵ� �ۼ�)
	// 3) ���� ���� ��Ŭ�� = s, r = alt + a,r (�� �ʵ忡 ���� getter/setter �ڵ� �ۼ�)
	 
	
	private static final long serialVersionUID = 6737531346498093713L;
	//  ����ȭ �Ͽ� ���� ���� �� ������ ��(������ȭ) ���� �ڷ����� �´��� Ȯ���ϱ� ���� �ĺ���
	
	private String title;
	private Date date;
	
	public Todo(String title, Date date) {
		this.title = title;
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyy.MM.dd");
		return String.format("[%s]\t%s", title,sdf.format(date));
	}
	@Override
	public int compareTo(Todo o) {
		
		return this.date.compareTo(o.date);
	}
}

public class Ex03 {
	public static void main(String[] args) throws ParseException, IOException {
		ArrayList<Todo> list = new ArrayList<Todo>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy.MM.dd");
		list.add(new Todo("�����ε���",sdf.parse("2022.11.11")));
		list.add(new Todo("�赵�� ����",sdf.parse("2022.11.04")));
		list.add(new Todo("���� SW��(�ʱ�)",sdf.parse("2022.11.15")));
		list.add(new Todo("����� ����",sdf.parse("2022.12.19")));
		list.add(new Todo("������ ����",sdf.parse("2022.12.22")));
		list.sort(null);
		list.forEach(todo -> System.out.println(todo));
		
//		FileOutputStream fos = new FileOutputStream("ex03.dat");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("03.dat"));
		oos.writeObject(list);
		oos.flush();
		oos.close();
		
		System.out.println("���� �Ϸ�!!");
	}
	

}
