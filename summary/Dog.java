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
		
		return "°³²­";
	}


	@Override
	public String GiveWay() {
		
		return "´øÁ®ÁØ´Ù";
	}


//	@Override
//	String getFeed() {
//		
//		return "°³²­";
//	}




	
	
}
