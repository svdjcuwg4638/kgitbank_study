package tv;

public class TV {
	// TV Ŭ������ �����ϼ���
	// �ʵ�� �Ӽ��� �����մϴ� : ex) ����, ä��, ����, ���Ұ� ���� ��...
	// �޼���� ����� �����մϴ� : ä�� �ø�/����, ���� �ø�/����, ���� on/off, ���Ұ� ��� ��...
	// �����ڴ� ��ü ���� �� �ʱ� �۵��� ����մϴ�. ( ������ TV�� �ʱ� ä���� 2�� �����Ѵ�)
	// ���������ڴ� �ʵ忡 ���� private, �޼��忡 ���� public�� �����մϴ�
	// getter/setter�� ����ص� �ǰ�, �����ص� �˴ϴ�
	private boolean power = false;
	private int channer;
	private int volum;
	private boolean mute = false;
	
	
	public TV(boolean power, int channer, int volum, boolean mute) {
		super();
		this.power = power;
		this.channer = channer;
		this.volum = volum;
		this.mute = mute;
	}
	public void show() {
		System.out.println("7.���α׷� ����");
		
		System.out.printf("--------------------------\n");
		System.out.printf("| 1.power               %s|\n",isPower()?"on":"off");
		System.out.printf("| 2.volUp                 |\n");
		System.out.printf("| 3.volDown         vol%3d|\n",isMute()? "":getVolum());
		System.out.printf("| 4.mute               %3s|\n",isMute()?"mute":"");
		System.out.printf("| 5.chUp                  |\n");
		System.out.printf("| 6.chDown           ch%3d|\n",getchanner());
		System.out.printf("--------------------------\n");
		System.out.print("���ϴ� ��� �Է� : ");
	}
	
	public void turnMute() {
		mute = !mute;
	}
	
	public void powerBtn() {
		power = !power; 	// ����� ���� true �̸� false�� �����ϰ�, false�̸� true�� �����Ѵ�
	}

	public boolean isPower() {
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}


	public int getchanner() {
		return channer;
	}


	public void setchanner(int channer) {
		this.channer = channer;
	}


	public int getVolum() {
		return volum;
	}


	public void setVolum(int volum) {
		this.volum = volum;
	}


	public boolean isMute() {
		return mute;
	}


	public void setMute(boolean mute) {
		this.mute = mute;
	}
}
