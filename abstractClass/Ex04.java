package abstractClass;

interface USB{	// �������̽��� �߻� Ŭ����,�߻�Ŭ������ Ŭ����, Ŭ������ �ڷ���
	void action();
}
class PowerChargeCable implements USB{

	@Override
	public void action() {
		System.out.println("���� ���� ��...");
		
	}	// ���� ����
	
}
class portableSSD extends Object implements USB{	// ������ �����
	@Override
	public void action() {
		System.out.println("E : �����. �뷮 1TB");
		
	}	
}
class Speaker extends Object implements USB{

	@Override
	public void action() {
		System.out.println("����Ŀ �����. ���� ���� 20");
		
	}	// ���� ������ ����
	
}
class PC{
	// ��ǻ�� �ܺ� ��ġ�� �����ϱ� ���ؼ��� USB �������̽� �԰��� �����ϸ� �ȴ�
	// => �ڷ����� USB�̸� �����ϴ�(������)
	void connect(USB device) {
		device.action();
	}
	
	
}

public class Ex04 {
	public static void main(String[] args) {
		// ���� �ٸ� �ڷ����� 3���� ��ġ�� ��� �ϳ��� �Լ��� ���� ��ǻ�Ϳ� ����� �� �ִ�
		PC pc = new PC();
		PowerChargeCable cable = new PowerChargeCable();
		portableSSD ssd = new portableSSD();
		Speaker sp = new Speaker();
		
		pc.connect(cable);	// ���̺� ���� ���� ������ ���������� ȣ���
		pc.connect(ssd);	// SSD ���� ���� ������ ���������� ȣ���
		pc.connect(sp);		// ����Ŀ ���� ���� ������ ���������� ȣ���
		
		// �ڹ� 8 ���� �Լ��� �������̽� ������ �߰��Ǿ���
		// �Լ��� �������̽���, �� �ϳ��� �߻�޼��常 ������ �������̽��� ���Ѵ�
		// �Լ��� �������̽��� ���ٽĿ� ���� ��ü�� ������ �� �ִ�
		// �͸� Ŭ������ ���� ��ü �������� ���� �����ϰ�, ���� �۵��� �ٸ���
		
		USB mouse = () -> System.out.println("���콺 �����...");
	
		pc.connect(mouse);
		
		// ���ٽ� ����
		// (�Ű�����) -> {������ ����};
		
		USB keyboard = () -> {
			System.out.println("Ű���� �����...");
		};
		pc.connect(keyboard);
		
		// 1) �Լ��� ������ �����̸� {} ���� ����
		// 2) �Լ��� �Ű������� �ϳ��̸�() ���� ����
		// 3) �Լ��� ��ȯ���� void�� �ƴϰ�, ���ٿ��� ���� ��ȯ�Ѵٸ� return ���� ����
		
		// Interface ob = a -> a > 0 ? a : -a;
		// Interface ob = (a) -> {return a > 0 ? a : -a;};
	}
}
