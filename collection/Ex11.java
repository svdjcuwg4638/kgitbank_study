package collection;


import java.util.ArrayList;

class Food {
	String name;
	String menu;
	int price;
	
	Food(String name,String menu,int price){
		this.menu =menu;
		this.name =name;
		this.price =price;
	}
	@Override
	public String toString() {
		return String.format("%s  %s  %,d��",name,menu,price);
	}
	
}

public class Ex11 {
	public static void main(String[] args) {
		// �����Լ� �ڵ尡 �� �۵��ϵ��� Ŭ���� �� �Լ��� �ۼ��Ͽ� �����ϼ���
		
		Food f1 = new Food("����ġŲ","���߹ٻ��",21000);
		Food f2 = new Food("���ť","Ȳ�ݿø���",20000);
		Food f3 = new Food("����ġŲ","��ǳġŲ",22000);
		Food f4 = new Food("������","�Ķ��̵�",21000);
		
		
		
		ArrayList<Food> list2 = new ArrayList<Food>();
		list2.add(f1);
		list2.add(f2);
		list2.add(f3);
		list2.add(f4);
		
		System.out.println("���� ��������");
		list2.sort((ob1,ob2)->{return ob2.price - ob1.price;} );
		list2.forEach(System.out::println);
		
		System.out.println("���� ��������");
		list2.sort((ob1,ob2)->{return ob1.price - ob2.price;} );
		list2.forEach(System.out::println);
		
		System.out.println("�̸� ��������");
		list2.sort((ob1,ob2)-> ob2.name.compareTo(ob1.name) );
		list2.forEach(System.out::println);
		
		System.out.println("�̸� ��������");
		list2.sort((ob1,ob2)-> ob1.name.compareTo(ob2.name) );
		list2.forEach(System.out::println);
		
		
		
		
		
		
	}
}
