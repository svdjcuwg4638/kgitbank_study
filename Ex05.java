package day02;

public class Ex05 {
	public static void main(String[] args) {
		int n1 =10, n2 =3;		// ������ ������ ����
		
		System.out.println(n1);	
		n1 += n2;
		n1 = n1 +n2;
		System.out.println(n1);
		
		String s1 ="";			// ���ڿ��� ���ڿ��� ����
		String s2 ="A";
		
		s1 = s1 + s2;
		s1 += s2;
		System.out.println(s1);
		
		String s3 ="";			//���ڿ��� ������ ���ϴ� ����
		int n3 =8;
		s3 += n3;
		s3 = s3 + n3;
		System.out.println(s3);
		
		double pi = 3.124125125;	// primitive�� ���ڿ��� ���ϸ�
		String s4 =pi + "";			// �� ����� String Ÿ������ ��Ÿ����
		System.out.println(s4);
	}
}
