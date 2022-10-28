package kimdaehyun_2A;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleToDoList {

	String title;
	Date date;
	boolean finish;
	
	
	
	public SimpleToDoList(String title, Date date) {
		this.title = title;
		this.date = date;
		finish = false;
	}
	




	String toStr() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String form = "[%s]  %s\t\t%s";
		String formatDate = sdf.format(date);
		String ment = finish ? "[¿Ï·á]" : "";
		form= String.format(form, formatDate,title,ment);
		return form;
	}
}
