package summary;

public class Cat extends Animal implements Interface {
	
	
	Cat(String name){
		super(name);
	}
	


	@Override
	public String name() {
		
		return this.name;
	}

	@Override
	public String feed() {
		
		return "추르";
	}



	@Override
	public String GiveWay() {
		
		return "던져준다";
	}



//	@Override
//	String getFeed() {
//		
//		return "추르";
//	}




}
