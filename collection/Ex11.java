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
		return String.format("%s  %s  %,d원",name,menu,price);
	}
	
}

public class Ex11 {
	public static void main(String[] args) {
		// 메인함수 코드가 잘 작동하도록 클래스 및 함수를 작성하여 구현하세요
		
		Food f1 = new Food("굽네치킨","고추바사삭",21000);
		Food f2 = new Food("비비큐","황금올리브",20000);
		Food f3 = new Food("굽네치킨","깐풍치킨",22000);
		Food f4 = new Food("후참잘","후라이드",21000);
		
		
		
		ArrayList<Food> list2 = new ArrayList<Food>();
		list2.add(f1);
		list2.add(f2);
		list2.add(f3);
		list2.add(f4);
		
		System.out.println("가격 내림차순");
		list2.sort((ob1,ob2)->{return ob2.price - ob1.price;} );
		list2.forEach(System.out::println);
		
		System.out.println("가격 오름차순");
		list2.sort((ob1,ob2)->{return ob1.price - ob2.price;} );
		list2.forEach(System.out::println);
		
		System.out.println("이름 내림차순");
		list2.sort((ob1,ob2)-> ob2.name.compareTo(ob1.name) );
		list2.forEach(System.out::println);
		
		System.out.println("이름 오름차순");
		list2.sort((ob1,ob2)-> ob1.name.compareTo(ob2.name) );
		list2.forEach(System.out::println);
		
		
		
		
		
		
	}
}
