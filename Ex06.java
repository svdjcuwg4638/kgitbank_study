package collectyion;

import java.util.HashMap;

class person{	// private ��� �ʵ�, public getter/setter �� �ְ�, �⺻ �����ڰ� �����Ǿ� �ִ�
				// Java beans : �����͸� �����ϴ� �뵵�� ����� �� �ִ� �ڹ� Ŭ���� ����
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
		public String toString() {
			
			String form = "{name = %s, age =%d}";
			return String.format(form, name,age);
		}
}

public class Ex06 {
	public static void main(String[] args) {
		person p1 = new person();
		p1.setName("������");
		p1.setAge(30);
		
		HashMap<String,Object> p2 = new HashMap<String, Object>();
		p2.put("name","ȫ��ȣ");
		p2.put("age",41);
		
		System.out.println("p1 :"+p1);
		System.out.println("p2 :"+p2);
		System.out.println();
		
		System.out.println("p1�� �̸���"+p1.getName());		// ${p1.name}
		System.out.println("p1�� ���̴�"+p1.getAge());		// ${p1.age}
		System.out.println();
		
		System.out.println("p2�� �̸���"+p2.get("name"));	// ${p2.name}
		System.out.println("p2�� ���̴�"+p2.get("age"));	// ${p2.age}
		System.out.println();
		
		
	}
}
