package collectyion;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
// iterator �ݺ���

public class Ex01 {
	public static void main(String[] args) {
		
		// set�� ũ�Ⱑ ������, index�� ����. ���� �ߺ��� ������� �ʴ´�
		
		
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		System.out.println("set�� ũ�� : "+set.size());
//		set.get(0); 	// index�� �̿��ؼ� Ư�� ���� �ҷ��� �� ����
		
		System.out.println(set);

//		for(int i =0; i< set.size();i++) {
//			index�� �̿��� �ݺ����� ����� �� ���ٸ�?
//		}
		
		for(Integer num : set) { // set�ȿ� ����ִ� �� ���Ҹ� integer Ÿ���� num�� �����ؼ�
			System.out.println(num); // �� ������ ȭ�鿡 ����Ѵ�.
		}	// ��ȸ
		
		// ���̺귯���� Iterator�������� ������ ó���� �� �˾ƾ��Ѵ�.
		Iterator<Integer>it = set.iterator();	// �ݺ���
		while(it.hasNext()) {					// sc.hasNext();
			Integer num = it.next();			// sc.next();
			System.out.println("num : "+num);
		}
	}
}
