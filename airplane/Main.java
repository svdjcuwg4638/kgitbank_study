package airplane;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		// Human의 서브클래스는 여러개를 만들어도 됩니다
		// 이때, 최소 2명의 의사를 포함시킵니다
		String healer;
	
		
		Human singH1 = new Singer("김c");
		Human pastorH2 = new Pastor("김요환");
		Human actorH3 = new Actor("김수로");
		Human doctorH4 = new Doctor("봉달희");
		Human doctorH5 = new Doctor("소지섭");
		Human actorH6 = new Actor("장혁");
		// 비행기 내부에서 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요
		
		air.entrance(singH1);
		air.entrance(pastorH2);
		air.entrance(actorH3);
		air.entrance(doctorH5);
		air.entrance(doctorH4);
		air.entrance(actorH6);
		
		air.healing(air.emergency());

		
	}
}
