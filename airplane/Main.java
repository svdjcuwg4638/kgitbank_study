package airplane;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		// 6���� ��ü�� �����Ͽ� ����⿡ ž�½�ŵ�ϴ� (1���� ��Ž)
		// Human�� ����Ŭ������ �������� ���� �˴ϴ�
		// �̶�, �ּ� 2���� �ǻ縦 ���Խ�ŵ�ϴ�
		String healer;
	
		
		Human singH1 = new Singer("��c");
		Human pastorH2 = new Pastor("���ȯ");
		Human actorH3 = new Actor("�����");
		Human doctorH4 = new Doctor("������");
		Human doctorH5 = new Doctor("������");
		Human actorH6 = new Actor("����");
		// ����� ���ο��� �ǻ簡 �ִٸ�, �ǻ��� heal() �Լ��� ȣ���Ͽ� ����� ġ���ϴ� �ڵ带 �ۼ��ϼ���
		
		air.entrance(singH1);
		air.entrance(pastorH2);
		air.entrance(actorH3);
		air.entrance(doctorH5);
		air.entrance(doctorH4);
		air.entrance(actorH6);
		
		air.healing(air.emergency());

		
	}
}
