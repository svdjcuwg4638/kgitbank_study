package object;

import java.lang.Object;

class A/*extends object */{}

class B extends A {}

public class Ex01 {
	
	public static void main(String[] args) {
		
		A ob = new B();
		
		System.out.println(ob.getClass().toString());
		
		// 1) �ڹ��� ��� ��ü�� object Ŭ������ �ν��Ͻ��̴�
		// 2) object�� �ڹٿ� �ִ� ��� Ŭ������ �ֻ��� ���� Ŭ�����̴�
		// 3) object Ŭ������ ���ǵ� �޼���� ��� Ŭ������ �������̵� �� �� �ִ� (��, final�� ����)
		
		B ob2 = (B) ob;
		
		System.out.println(ob.equals(ob2));
		
		// Java API ���� Ȯ���ϱ�
		
		// ��� ��ü�� object Ÿ���� ������ �� �ִ�
		
		Object ob3 =ob;
		Object ob4 = ob2;
		
		System.out.println(ob3.getClass());	// ������ ��ĳ���õǾ ��ü �ڽ��� ������ ������ �ʴ´�
		System.out.println(ob4.getClass());
		
		System.out.println(ob3==ob4);
	}
}
