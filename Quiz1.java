package day01;

public class Quiz1 {
	public static void main(String[] args) {
		
		//ù���� ���࿡ ���� 10�� �غ��Ͽ� �Ա��Ѵ�
		//��°������ �������� �ι��� 20���� �غ��Ͽ� �Ա��Ѵ�
		// ��°������ �������� �ι��� 40���� �غ��Ͽ� �Ա��Ѵ�
		// �̷������� 30�� ���� ���࿡ ���� �Ա��ϸ�
		// 30�� ���� ������ڿ� �Աݵ� �ݾ��� �Ѿ��� ���ΰ�?
		// (��, ������¿��� ó���� ���� ������ ������ �����Ѵ�)
		int day = 1;
		long money =10;
		long bk = 0;
		while(day<31) {
			bk += money;
			System.out.println(money);
			money *= 2;
			day++;
			
		}
		System.out.printf("�� �ݾ��� : %,d �Դϴ�.\n",bk);
		
	}
}
