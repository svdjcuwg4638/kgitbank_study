package summary;

public class Human {

	String name;
	public Human(String name) {
		this.name = name;
	}

	
	void give(Interface ob) {
		
		String form = "%s�� %s���� %s�� %s \n";
		String feed = ob.feed();
		
//		String msg = "";
//		if(ob instanceof Human) msg+= "�ǳ�";
//		if(ob instanceof Animal) msg+= "����";
		
		System.out.printf(form,name,ob.name(),feed,ob.GiveWay());
	}



}
