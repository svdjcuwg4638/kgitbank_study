package array;

import java.util.List;
import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		
		StringList list = new StringList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("hello");
		list2.add("world");
		list2.add("java");
		list2.add("spring");
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list.size());
		System.out.println(list2.size());
		
	}
}
