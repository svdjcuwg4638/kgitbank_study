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
		
		return String.format("%s : %,d원", name,price);
	}
	
	

}

// 비교하는 객체를 직접 만들어서 사용해보기
class MyComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		
		return o1.price - o2.price;
		// 반환값이 0보다 큰지 아닌지 에 따라서 자리 바꿈을 판별한다
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
		
		list2.add(new Item("오래오",2000));
		list2.add(new Item("몽쉘",3000));
		list2.add(new Item("오예스",2500));
		list2.add(new Item("초코파이",2700));
		list2.add(new Item("빅파이",2900));
		ArrayList<Item> list3 = new ArrayList<Item>(list2);
		
		System.out.println(list3);
		list3.sort((ob1,ob2)->{return ob1.name.compareTo(ob2.name);});
		System.out.println("list3 람다식 이름 오름차순");
		list3.forEach(System.out::println);
		System.out.println(list3);
		System.out.println("list3 람다식 가격 오름차순");
		list3.sort((ob1,ob2)->{return ob1.price -ob2.price;});
		System.out.println(list3);
		
		// 가격 순 오르맟순 정렬(Mycomparator implement Comparator 의 객체를 생성하여 전달)
		MyComparator priceCmp = new MyComparator();
		list2.sort(priceCmp);
		
		
		list2.forEach(System.out::println);
		System.out.println();
		
		list2.sort(new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				
				return o1.name.compareTo(o2.name);
				// 문자열끼리 비교하여 그 차이를  int 타입으로 반환하는 함수 compareTo(s1,s2)
			}
		});
		System.out.println("문자열compareTo");
		list2.forEach(System.out::println);
		System.out.println();
		
		// 가격 순 내림차순 정렬(람다식)
		System.out.println("람다식 숫자별 오름차순");
		list2.sort((o1,o2)->{return o1.price - o2.price;});
		list2.forEach(System.out::println);
		System.out.println();
		System.out.println("람다식 문자열오름차순");
		list2.sort((o1,o2)->{return o1.name.compareTo(o2.name);});
		list2.forEach(System.out::println);
		
		
		list2.sort((ob1,ob2)->{return ob1.name.compareTo(ob2.name);});
		
	}
}
