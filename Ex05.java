package collectyion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Ŭ���� ��� Map�� �̿��ϱ�

public class Ex05 {
	public static void main(String[] args) {
		HashMap<String, Object> p1 = new HashMap<String, Object>();
		
		p1.put("name","������");
		p1.put("age",30);
		
		HashMap<String, Object> p2 = new HashMap<String, Object>();
		p2.put("name","ȫ��ȣ");
		p2.put("age",41);
		
		HashMap<String, Object> p3 = new HashMap<String, Object>();
		p3.put("name","���ܺ�");
		p3.put("age",5);
		
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+"��° ����� �̸��� "+list.get(i).get("name"));
			System.out.println(i+"��° ����� ���̴� "+list.get(i).get("age"));
			System.out.println();
		}
		
 	}
}
