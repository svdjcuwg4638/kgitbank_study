package tv;

public class TV {
	// TV 클래스를 구성하세요
	// 필드는 속성을 저장합니다 : ex) 전원, 채널, 볼륨, 음소거 상태 등...
	// 메서드는 기능을 정의합니다 : 채널 올림/내림, 볼륨 올림/내림, 전원 on/off, 음소거 기능 등...
	// 생성자는 객체 생성 시 초기 작동을 담당합니다. ( 생성된 TV의 초기 채널은 2로 설정한다)
	// 접근제한자는 필드에 대해 private, 메서드에 대해 public을 적용합니다
	// getter/setter는 사용해도 되고, 생략해도 됩니다
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
		System.out.println("7.프로그램 종료");
		
		System.out.printf("--------------------------\n");
		System.out.printf("| 1.power               %s|\n",isPower()?"on":"off");
		System.out.printf("| 2.volUp                 |\n");
		System.out.printf("| 3.volDown         vol%3d|\n",isMute()? "":getVolum());
		System.out.printf("| 4.mute               %3s|\n",isMute()?"mute":"");
		System.out.printf("| 5.chUp                  |\n");
		System.out.printf("| 6.chDown           ch%3d|\n",getchanner());
		System.out.printf("--------------------------\n");
		System.out.print("원하는 기능 입력 : ");
	}
	
	public void turnMute() {
		mute = !mute;
	}
	
	public void powerBtn() {
		power = !power; 	// 저장된 값이 true 이면 false를 대입하고, false이면 true를 대입한다
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
