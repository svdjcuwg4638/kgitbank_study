package collectyion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		// 1���� 45������ �ڿ��� �߿��� �ߺ����� �ʴ� �� 6���� �����ϼ���
		Set<Integer> set = new HashSet<Integer>();
		Random rd = new Random();
		
		System.out.println(rd);
		
		
		while(set.size()!=6) set.add(rd.nextInt(45)+1);
		
		for(Integer num : set) System.out.println(num);
		
		
		// 4) Collection�� �����ڿ� ���� collection�� �־ ��ü�� ������ �� �ִ�
		// �̋�, ���� �÷����� ���� ��Ұ� ���ο� �÷��ǿ� �״�� �����ȴ�
		// Set�� �̿��Ͽ� List�� �����
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println("list : "+list);
		
		// 5) list�� index�� �ְ�, sort()�Լ��� �־ �ڵ����� ������ �ȴ�
		list.sort(null);
		
		System.out.println("list : "+list);
		
		
		
		
	}
}
