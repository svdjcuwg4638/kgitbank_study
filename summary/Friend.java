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
	
		return "�ָԹ�";
	}




	@Override
	public String GiveWay() {
		
		return "�ǳ��ش�";
	}
	
}
