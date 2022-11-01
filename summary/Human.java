package summary;

public class Human {

	String name;
	public Human(String name) {
		this.name = name;
	}

	
	void give(Interface ob) {
		
		String form = "%s이 %s에게 %s을 %s \n";
		String feed = ob.feed();
		
//		String msg = "";
//		if(ob instanceof Human) msg+= "건네";
//		if(ob instanceof Animal) msg+= "던져";
		
		System.out.printf(form,name,ob.name(),feed,ob.GiveWay());
	}



}
