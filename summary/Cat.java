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
		
		return "�߸�";
	}



	@Override
	public String GiveWay() {
		
		return "�����ش�";
	}



//	@Override
//	String getFeed() {
//		
//		return "�߸�";
//	}




}
