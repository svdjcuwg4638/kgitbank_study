package collectyion;

import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		// map : �迭�� index ���, key�� �̿��Ͽ� value�� �����ϴ� �ڷᱸ��
		// key�� �ߺ��� �� ����, value�� �ߺ��� �� �ִ�
		// arr[i] �������� �迭�� �� ���� �����ϴ� ��ó��
		// map[key] �������� �����Ѵ�. ��, �迭ó�� ������ �ʰ�, �Լ��� �̿��Ͽ� ���� �����Ѵ�
		Hashtable<String, Object> map = new Hashtable<String, Object>();
		
		map.put("apple", "���");
		map.put("banana", "�ٳ���");
		map.put("sc", new Scanner(System.in));
		map.put("f", new File("a.txt"));
		
		System.out.println("map�� ũ�� : " + map.size());
		
		System.out.println(map.get("apple")); // map["apple"]
		System.out.println(map.get("banana"));// map["banana"]
		
		// key�� �̿��Ͽ� value�� ������ �� ������, value�� �̿��Ͽ� key�� ���������� �ʴ´�
		// key�� value�� ����� mapping�� �ƴϴ�. key -> value (O), value -> key (X)
		System.out.println(map.get("���"));
		
		
		// map�� �̿��Ͽ� ������ ��� ���� ����ϴ� ����
		// 1) for
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			Object value = map.get(key);
			System.out.printf("%s : %s\n", key, value);
		}
		System.out.println();
		
		// 2) Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			Object value = map.get(key);
			System.out.printf("%s : %s\n", key, value);
		}
		System.out.println();
		
		// 3) Enumeration
		Enumeration<String> enu = map.keys();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Object value = map.get(key);
			System.out.printf("%s : %s\n", key, value);
		}
		System.out.println();
		
		// 4) EntrySet
		for(Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.printf("%s : %s\n", key, value);
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


