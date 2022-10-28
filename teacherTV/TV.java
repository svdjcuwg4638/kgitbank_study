package teacherTV;

public class TV {
	// TV Ŭ������ �����ϼ���
	// �ʵ�� �Ӽ��� �����մϴ� : ex) ����, ä��, ����, ���Ұ� ���� ��...
	// �޼���� ����� �����մϴ� : ä�� �ø�/����, ���� �ø�/����, ���� on/off, ���Ұ� ��� ��...
	// �����ڴ� ��ü ���� �� �ʱ� �۵��� ����մϴ�. (������ TV�� �ʱ� ä���� 2�� �����Ѵ�)
	// ���������ڴ� �ʵ忡 ���� private, �޼��忡 ���� public�� �����մϴ�
	// getter/setter�� ����ص� �ǰ�, �����ص� �˴ϴ�
	
	private boolean power;
	private int channel = 2;	// 2 ~ 10
	private int volume = 10;	// 0 ~ 20
	private int muteVolume = 0;
	
	public void powerBtn() {
		power = !power;	// ����� ���� true�̸� false�� �����ϰ�, false�̸� true�� �����Ѵ�
		show();
	}
	
	public void channelUp() {
		if(power) {
			channel++;
			if(channel > 10) 	
				channel = 2;
		}
		show();
	}
	
	public void channelDown() {
		if(power) {
			channel--;
			if(channel < 2) 	
				channel = 10;
		}
		show();
	}
	
	public void volumeUp() {
		if(power && volume < 20) {
			volume++;
		}
		show();
	}
	
	public void volumeDown() {
		if(power && volume > 0) {
			volume--;
		}
		show();
	}
	
	public void mute() {
		if(power) {
			int tmp = volume;
			volume = muteVolume;
			muteVolume = tmp;
		}
		show();
	}
	
	private void show() {
		if(power) {
			System.out.println("���� : " + power);
			System.out.println("ä�� : " + channel);
			System.out.println("���� : " + volume);
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("���� off ����");
			System.out.println();
		}
	}
}	






