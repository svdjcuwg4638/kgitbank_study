package summary;

public class Friend extends Human implements Interface{

	Friend(String name){
		super(name);
	}




	@Override
	public String name() {
		
		return this.name;
	}


	@Override
	public String feed() {
	
		return "ÁÖ¸Ô¹ä";
	}




	@Override
	public String GiveWay() {
		
		return "°Ç³×ÁØ´Ù";
	}
	
}
