package summary;

public class Dog extends Animal implements Interface{
	
	
	Dog(String name){
		super(name);
	}
	

	@Override
	public String name() {
		
		return this.name;
	}

	@Override
	public String feed() {
		
		return "����";
	}


	@Override
	public String GiveWay() {
		
		return "�����ش�";
	}


//	@Override
//	String getFeed() {
//		
//		return "����";
//	}




	
	
}
