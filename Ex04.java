package collectyion;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class DataServer {
	
	private HashMap<String, String> map = new HashMap<String, String>();
	
	public DataServer() {
		map.put("apple", "���");
		map.put("banana", "�ٳ���");
		map.put("car", "�ڵ���");
		map.put("desk", "å��");
		map.put("ant", "����");
		map.put("answer", "����");
		map.put("animal", "����");
		map.put("chicken", "ġŲ");
		map.put("phone", "��ȭ��");
		map.put("coffee", "Ŀ��");
		map.put("pizza", "����");
	}
	
	// ����ڴ� map�� ���� ������ ���� ������ �޼��带 ���ؼ� keyword�� �����ϴ� ��Ҹ� ��� ���޹��� �� �ִ�
	public HashMap<String, String> selectAll(String keyword) {
		
		Set<Entry<String, String>> entrySet = map.entrySet();	// map�� key�� value�� ���� �����ϱ�
		HashMap<String, String> result = new HashMap<String, String>();	// ����� ��� ��ȯ�� map
		
		for(Entry<String, String> entry : entrySet) {	// map�� �� ������Ҹ� �ϳ��� Entry��� �Ҷ�
			if(entry.getKey().contains(keyword)) {		// key�� keyword�� �����ϰų�
				result.put(entry.getKey(), entry.getValue());
			}
			if(entry.getValue().contains(keyword)) {	// value�� keyword�� �����Ѵٸ�
				result.put(entry.getKey(), entry.getValue());	// result�� �߰��Ѵ�
			}
		}
		return result;	// ����� ���� result�� ��ȯ�Ѵ�
	}
}

public class Ex04 {
	public static void main(String[] args) {
		// map�� �ټ��� ���� �ϳ��� ��� �����ؾ� �� �� ����Ѵ�
		Scanner sc = new Scanner(System.in);
		String keyword;
		
		System.out.print("�˻��� ���ڸ� �Է��ϼ��� : ");
		keyword = sc.nextLine();	// a
		
		DataServer db = new DataServer();
		HashMap<String, String> result = db.selectAll(keyword);

		Set<String> keySet =result.keySet();
		for(String key : keySet) {
			Object value = result.get(key);
			System.out.printf("%s : %s ",key,value);
		}
		System.out.println();
		sc.close();
	}
}
