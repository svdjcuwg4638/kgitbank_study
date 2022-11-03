package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// (�ٸ� Item2 ��) �񱳰� ������ Ŭ���� Item2
class Item2 implements Comparable<Item2>{
	String name;
	int price;
	Item2(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return String.format("%s : %,d��", name,price);
	}
	@Override
	public int compareTo(Item2 o) {	//Item2�� compareTo
		
		return this.name.compareTo(o.name); // String�� compareTo
		// Item2�� ��ü this�� Item2�� �Ǵٸ� ��üo�� ���Ϸ���
		// this�� name�� o�� name�� ���Ͽ� �� ���̸� int�� ��ȯ�ϸ� �ȴ�
	}
	
	

}

public class Ex10 {
	public static void main(String[] args) {
		String[] arr = {"������","ȫ��ȣ","���ܺ�","���缮","������"};
		List<String> list = Arrays.asList(arr);
		
		System.out.println(list);
		
		list.sort(null);
		System.out.println(list);
		
		ArrayList<Item2> list2 = new ArrayList<Item2>();
		
		list2.add(new Item2("������",2000));
		list2.add(new Item2("����",3000));
		list2.add(new Item2("������",2500));
		list2.add(new Item2("��������",2700));
		list2.add(new Item2("������",2900));
		
		list2.forEach(System.out::println);
		list2.sort(null);
	}
}
