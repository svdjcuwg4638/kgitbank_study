package day01;
import java.util.Random;
public class Ex03 {

	public static void main(String[] args) {
		
		//������ (operator) : �����͸� �����ϱ� ���� ����ϴ� ��ȣ Ȥ�� �ܾ�
		/*
		 * ���� ������ : �ϳ��� ���� Ȥ�� ���� ���Ͽ� ������ ó���Ѵ� ( num++ )
		 * ���� ������ : �ΰ��� ���� �̿��Ͽ� ������ �����Ѵ� ( n1 + n2)
		 * ���� ������ : ������ ���� �̿��Ͽ� ������ �����Ѵ� ( login ? " �α��� " : " �α׾ƿ� " )
		 * 
		 * 
		 * ��� ���� : + , - ,* , / , %
		 * ���� ���� : ++ , --
		 * ���� ���� : =,
		 * ���� ���� ���� : += -= %= /= *=
		 * �� ���� : > ,< >= , <= , == , !=
		 * �� ���� : && || !
		 * ��Ʈ ���� : << , >> , | , &
		 * �ֿ켱 ������ : . , [] , instanceof(), ()
		 */
		
		// ��� ����, �� ���� �ڷ����� ���� ����� �ڷ����� �޶��� �� �ִ�
		// ������ ������ ������ ���´�. �Ǽ��� ������ �Ǽ��� ���´�. �Ǽ��� �Ǽ��� �Ǽ��� ���´�
		double d1 = 100 /3 ;			// ������ ����Ͽ� ���� ���Ѵ�
		double d2 = (double)100 / 3;	// �Ǽ��� ����Ͽ� ��Ȯ�� ���� ���Ѵ�
		double d3 = 100 / (double) 3;
		double d4 = 100 / 3.0;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		// � ���� 0���� ������ �ȵȴ�
//		int test =3/0;
		
		// ������ ������ Ȱ��
		// 1) Ȧ��,¦�� (���,���)�� ������ �� ����� �� �ִ�
		
		// 2) � ���� 10�� �������� ������ 0�� ������ŭ ���ڸ��� �и��� �� �ִ�
		int idNum = 930516;
		int date = idNum % 100; //0�� ������ŭ (2��) ���ڸ��� �и��Ѵ�
		idNum /= 100;			// ���� 2�ڸ��� ������, ���� 4�ڸ��� �����
		int month = idNum %100;
		int year = idNum / 100 ;
		
		System.out.printf("%d�� %d�� %d��\n",year,month,date);
		
		// 3) ������ ������ �����Ѵ�
		Random ran = new Random();
		int r = ran.nextInt();
		System.out.println("r:"+r);
		r = r % 10 +1;					//���� ����
		System.out.println("r:"+r);
		r = r > 0 ? r : -r ;		// ��ȣ ����
		System.out.println("r:"+r);
	
		int r2 = ran.nextInt(45)+1;
		System.out.println("r2 = "+r2);
	}
}
