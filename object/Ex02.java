package object;


import java.util.Comparator;
import java.util.Scanner;

class Test extends Object{
	private String str;
	public Test(String str) {
		this.str=str;
	}
	
	public String getStr() {
		return str;
	}
	
	@Override
	public String toString() {
		return "���~";
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Test ob = new Test("�ް�");
		Runtime rt = Runtime.getRuntime();
		int[] arr = {2,7,8,4,6};
		Comparator<Double> cmp = (a,b) -> (int)(b -a );
		
		Object[] t1 = {sc,ob,rt,arr,cmp};
		
		Object target = t1;
		// �ڹ��� ��� ��ü�� object Ÿ������ ���� �����ϴ�
		// object�� �迭�� ���ܰ� �ƴϴ�
		System.out.println();
		Object[] target2 = (Object[])target;
		Test target3 = (Test)target2[1];
		System.out.println(target3.getStr());
		
		System.out.println(((Test)(((Object[])target)[1])).getStr());
		
		// ���� ) target���� �����Ͽ� �ް��̶�� ���ڿ��� ȭ�鿡 ����ϼ���
		for(int i =0; i<t1.length;i++) {
			if(t1[i] instanceof Test) {
				Test tes ;
				tes=(Test)t1[i];
				System.out.println(tes.getStr());
				
				
			}
		}
		
	}
}
