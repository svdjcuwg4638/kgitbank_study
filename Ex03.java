package day04;

public class Ex03 {
	public static void main(String[] args) {
		// ���ڿ� ���� �Լ�
		
		String s1 = "root:x:0:0:root:/root:/bin/bash";
		String[] arr = s1.split(":");	//split �����ڸ� �����Ͽ� ������
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
													//  query=�˻�	where=��(�̹�����)
		String s2 = "http://search.naver.com/search.naver?query=������&where=image";
		String[] a1= s2.split("\\?");	//? �� ������ ����� �־ ������
		String[] a2= a1[1].split("&");
		for(int i = 0;i<a2.length;i++) {
			String[] a3 =a2[i].split("=");
			System.out.printf("%s : %s\n",a3[0],a3[1]);
		}
		System.out.println();
		
		//substring : ���ڿ� ���� (-)
		// a.substring(int beginIndex, int endIndex)
		
		String s3 = s2.substring(8, 24);
		System.out.println(s3);
		
		int beginIndex = s2.indexOf("search");
		int endIndex = s2.lastIndexOf("/search")-1;
		
		System.out.printf("%d~%d\n",beginIndex,endIndex);
		
		
		String s4 = s2.substring(beginIndex,endIndex);
		System.out.println(s4);
		
		// ���ڿ��� ��ġ ��
		String t1 = "apple";
		String t2 = new String("apple");	//Scanner�� �Է¹��� ���ڿ��� �Ȱ���
		String t3 = "apple";
		
		System.out.printf("%s, %s, %s\n",t1,t2,t3);
		
		//�ٶ󺸴� ����� ��ġ�ϴ°�
		System.out.println(t1==t3);
		System.out.println(t1==t2);
		
		// ���ڿ��� ���Ҷ� ������ equals�� ������
		// �� ����� ������ �Ȱ�����
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t3));
		
	}
}
