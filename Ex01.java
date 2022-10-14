package day04;

public class Ex01 {

	public static void main(String[] args) {
		// 1) ���ڿ��� ���ϴ� ���Ŀ� ���缭 ������ִ� String.format( )
		String name = "�Ƹ޸�ī��";
		int price = 1500;
		System.out.printf("%s : %,d��\n",name,price );
		
		// printf() �� ���ڿ��� ���Ŀ� ���缭 ȭ�鿡 ����Ѵ�
		// String.format() �� ���� ������� ���ڿ��� ���� ��ȯ�Ѵ� (������ ���� ����)
		
		String result = String.format("%s : %,d��\n", name,price);
		System.out.println(result);
		
		// ���� ���� ����

		/*
		 * 		�����		�ڷ���
		 * 		%s			String		���ڿ��� ǥ���ϴ� ���Ĺ���
		 * 		%d			����			������ 10���� ���·� ǥ��
		 * 		%f			�Ǽ�			�Ǽ��� ǥ��
		 * 		%c 			����			������ �ڵ忡 �´� ���ڷ� ǥ��(char)
		 * 		%x			����			������ 16���� ���·� ǥ��
		 * 
		 * 	1) % �� ���� ���̿� ������ �־ �ڸ������� ĭ ���� ������ �� �ִ�
		 *  2) ������ %02d �� ���� 2�ڸ��� ����ϰ�, ���� �����ϸ� 0���� ä�� �� �ִ�
		 *  3) �Ǽ��� %.2f �� ���� �Ҽ��� ���� �ڸ��� 2�ڸ������� ǥ���� �� �ִ�
		 *  4) ���ڴ� %,d �� ���� õ���� ���б�ȣ�� �ڵ����� ó���� �� �ִ�
		 *  
		 *
		 */
		System.out.printf("[%s]\n","java");
		System.out.printf("[%10s]\n","java");
		System.out.printf("[%-10s]\n","java");
		
		System.out.printf("[%d]\n",1236000);
		System.out.printf("[%9d]\n",1236000);
		System.out.printf("[%09d]\n",1236000);
		System.out.printf("[%,09d]\n",1236000);
		
		System.out.printf("[%02d : %02d]\n",123/60,127%60);
		
		System.out.printf("[%f]\n",3.14);	//�ڸ����� �������� ������ �Ҽ��� ���� 6�ڸ�����
		System.out.printf("[%f]\n",3.1415923446);	//printf�������� ��½� 6�ڸ�ǥ��
		System.out.println(3.1415464534534);		//println ���� ��½� ��� ǥ��;
		System.out.printf("[%.2f]\n",3.1415923446);	
//		System.out.printf("[%.2f]\n",100);	//100�Է½� ������ �־ �����߻�	
		System.out.printf("[%.2f]\n",100.0);//.0�� �ٿ��� �ڷ��� ������!
		
		System.out.printf("[%c]\n",65);
		System.out.printf("[%c]\n",66);
		System.out.printf("[%c]\n",44032);
		System.out.printf("[%c]\n",44033);
		System.out.printf("[%c]\n",'��');
		System.out.printf("[%c]\n",'��'+1);
		
//		object���� : �ڹ��� ��� �ڷ����� ó���� �� �ִ�
			
		
	
		
	}

}
