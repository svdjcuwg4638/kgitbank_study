package collectyion;

import java.util.ArrayList;
import java.util.HashMap;

public class QuizTeacher {
	public static void main(String[] args) {
		String json = "[";
		json += "{\"name\": \"���ϴ�\", \"pnum\": \"010-2323-2323\"}";
		json += ",";
		json += "{\"name\": \"ȫ��ȣ\", \"pnum\": \"010-2222-2222\"}";
		json += "]";
		
//		String test = "say \"Hello\" !!";
//		System.out.println(test);
		
		// ArrayList�� HashMap�� �̿��Ͽ�, �� ���ڿ����� �����͸� �����Ͽ�
		// ��ü �������� �����ϰ� ����ϼ���
		// split, replace, trim ���� ���ڿ� �Լ��� ���������� Ȱ���ϼ���
		
		System.out.println("���� : " + json);
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		
		// 1) �ʿ���� ���ڴ� �����Ѵ�
		json = json.replace(" ", "");
		json = json.replace("\"", "");
		System.out.println("1) " + json);
		
		// 2) �ݺ��� �ȿ��� �� ��ü(������ ��ü�� {} �� �����ִ�)�� �����Ͽ� ������ ��´�
		while(json.contains("{")) {
			HashMap<String, String> map = new HashMap<String, String>();
			
			int begin = json.indexOf("{");
			int end = json.indexOf("}") + 1;
			String person = json.substring(begin, end);
			json = json.substring(end + 1);
//			System.out.println("person : " + person);
//			System.out.println("json : " + json);
			
			person = person.replace("{", "");
			person = person.replace("}", "");
			
			String name = person.split(",")[0];
			String pnum = person.split(",")[1];
			
			map.put(name.split(":")[0], name.split(":")[1]);
			map.put(pnum.split(":")[0], pnum.split(":")[1]);
			
//			System.out.println(name);
//			System.out.println(pnum);
			
			System.out.println();
			list.add(map);
		}
		
		System.out.println("��� : " + list);
		
		System.out.println(list.get(0).get("name"));
		System.out.println(list.get(0).get("pnum"));
		System.out.println(list.get(1).get("name"));
		System.out.println(list.get(1).get("pnum"));
		
	}
}
