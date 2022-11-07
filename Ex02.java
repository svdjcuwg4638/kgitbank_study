package collectyion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		// 1에서 45사이의 자연수 중에서 중복되지 않는 값 6개를 추출하세요
		Set<Integer> set = new HashSet<Integer>();
		Random rd = new Random();
		
		System.out.println(rd);
		
		
		while(set.size()!=6) set.add(rd.nextInt(45)+1);
		
		for(Integer num : set) System.out.println(num);
		
		
		// 4) Collection의 생성자에 따른 collection을 넣어서 객체를 생성할 수 있다
		// 이떄, 기존 컬렉션의 구성 요소가 새로운 컬렉션에 그대로 이전된다
		// Set을 이용하여 List를 만든다
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println("list : "+list);
		
		// 5) list는 index도 있고, sort()함수도 있어서 자동으로 정렬이 된다
		list.sort(null);
		
		System.out.println("list : "+list);
		
		
		
		
	}
}
