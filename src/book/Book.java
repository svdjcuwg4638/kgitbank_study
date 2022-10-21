package book;

// ����, ����, ���ǻ�, ����, ����1, ����2

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
	
	String toStr() {	// toString() �� ��Ӱ� �����־ �ٸ� �̸��� ���
		
		String form = "%s (%s | %s)\t%,d�� (����: %.1f / ���� : %.1f)";
		form = String.format(form, name, author, publisher, price, starPoint1, starPoint2);
//		System.out.println(form);
		return form;
	}
	
	
}
