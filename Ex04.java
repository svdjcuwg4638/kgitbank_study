package day01;

public class Ex04 {
	public static void main(String[] args) {
		// �� ���꿡 ���� ���� �̼���
		int n1 = -1, n2 =5, n3 =1, n4=2;
		System.out.printf("%d , %d, %d, %d\n",n1,n2,n3,n4);
		
		boolean flag1 = n1++ + ++n2 < 0 && n3-- + ++n4==0;
		System.out.println(flag1);
		System.out.printf("%d , %d, %d, %d\n",n1,n2,n3,n4);
		// �� ������ ù��° ���Ǹ����� ��ü����� Ȯ���ȴٸ�
		// �ι�° ������ �������� �ʴ´�
	}
}
