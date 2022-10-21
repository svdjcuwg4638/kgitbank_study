package book;


public class Book {
	String name;
	String author;
	String publisher;
	int price;
	double starPoint1;
	double starPoint2;
	
	Book(String name, String author, String publisher, 
			int price, double starPoint1, double starPoint2) {
		
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.starPoint1 = starPoint1;
		this.starPoint2 = starPoint2;
	}
	
	String toStr() {	// toString() 은 상속과 관련있어서 다른 이름을 사용
		
		String form = "%s (%s | %s)\t%,d원 (내용: %.1f / 구성 : %.1f)";
		form = String.format(form, name, author, publisher, price, starPoint1, starPoint2);
//		System.out.println(form);
		return form;
	}
	
	
}
