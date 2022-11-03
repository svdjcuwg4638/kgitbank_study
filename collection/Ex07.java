package collection;

import java.util.ArrayList;
import java.util.Comparator;

class Item{
	String name;
	int price;
	public Item(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return String.format("%s : %,d��", name,price);
	}
	
	

}

// ���ϴ� ��ü�� ���� ���� ����غ���
class MyComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		
		return o1.price - o2.price;
		// ��ȯ���� 0���� ū�� �ƴ��� �� ���� �ڸ� �ٲ��� �Ǻ��Ѵ�
	}
	
}


public class Ex07 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Item> list2 = new ArrayList<Item>();
		
		
				
		list1.add(2);
		list1.add(7);
		list1.add(8);
		list1.add(4);
		list1.add(6);
		System.out.println(list1);
		list1.sort(null);
		System.out.println(list1);
		
		list2.add(new Item("������",2000));
		list2.add(new Item("����",3000));
		list2.add(new Item("������",2500));
		list2.add(new Item("��������",2700));
		list2.add(new Item("������",2900));
		ArrayList<Item> list3 = new ArrayList<Item>(list2);
		
		System.out.println(list3);
		list3.sort((ob1,ob2)->{return ob1.name.compareTo(ob2.name);});
		System.out.println("list3 ���ٽ� �̸� ��������");
		list3.forEach(System.out::println);
		System.out.println(list3);
		System.out.println("list3 ���ٽ� ���� ��������");
		list3.sort((ob1,ob2)->{return ob1.price -ob2.price;});
		System.out.println(list3);
		
		// ���� �� �������� ����(Mycomparator implement Comparator �� ��ü�� �����Ͽ� ����)
		MyComparator priceCmp = new MyComparator();
		list2.sort(priceCmp);
		
		
		list2.forEach(System.out::println);
		System.out.println();
		
		list2.sort(new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				
				return o1.name.compareTo(o2.name);
				// ���ڿ����� ���Ͽ� �� ���̸�  int Ÿ������ ��ȯ�ϴ� �Լ� compareTo(s1,s2)
			}
		});
		System.out.println("���ڿ�compareTo");
		list2.forEach(System.out::println);
		System.out.println();
		
		// ���� �� �������� ����(���ٽ�)
		System.out.println("���ٽ� ���ں� ��������");
		list2.sort((o1,o2)->{return o1.price - o2.price;});
		list2.forEach(System.out::println);
		System.out.println();
		System.out.println("���ٽ� ���ڿ���������");
		list2.sort((o1,o2)->{return o1.name.compareTo(o2.name);});
		list2.forEach(System.out::println);
		
		
		list2.sort((ob1,ob2)->{return ob1.name.compareTo(ob2.name);});
		
	}
}
