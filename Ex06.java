package day02;

public class Ex06 {
	public static void main(String[] args) {
		// �ݺ���
		
		int num = 10;
		if(num <20) {
			System.out.println("if)num "+ ++num);
		}
		
		while(num <20) {
			// ������ ������ �Ǳ� ������ �ݺ��Ͽ� �����Ѵ�
			// ������ ���� ���� �ݺ��Ͽ� �����Ѵ� (while)
			System.out.println("while)num "+ ++num);
		}
		for(;num<30;) {
			System.out.println("for)num : "+ ++num);
		}
		
		while(true) {	//�ݺ��� '������' ���ư��� ������
			System.out.println("infinite loop) num"+ ++ num);
			if(num==10000) {	// Ư�� ���ǿ��� �ݺ��� Ż���� ������ Ž���Ѵ�
				break;	// break�� if�� ������ ����� ���� �Ʒ��� ����������
			}
		}
		System.out.println("��");
	}
}
