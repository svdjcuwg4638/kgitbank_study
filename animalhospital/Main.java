package animalhospital;

public class Main {
	public static void main(String[] args) {
//		The type new Animal(){} must implement the inherited abstract method Animal.bark()
//		Animal 타입은 객체화 할수 없습니다(추상 클래스는 생성자를 통해 직접 객체를 생성할 수 없다)
//		Animal a1 = new Animal() {
			
		Cat c1 = new Cat("구름이",2);
		c1.bark();
		c1.grooming();
		
//		고양이는 동물이다(다형성)
		Animal a1 = new Cat("냐옹이",5);
		a1.bark();    // 오버라이딩 메서드는 호출할 수 있고, 내용도 Cat의 내용대로 수행된다
//		a1.grooming(); // grooming() Animal에 정의되어 있지 않아서 호출할 수 없다.
		
		
		if(a1 instanceof Cat) {	// 만약, a1이 Cat타입의 객체이면
			Cat c2 = (Cat) a1;	// 다운캐스팅 해서 다른 변수에 저장해두고
			c2.grooming();		// 고유기능을 호출한다
		}
		Dog d2 = new Dog("개임",4);
		d2.bark();
		d2.tailling();
		
		Animal a2 = new Dog("멍멍이",4);
		a2.bark();
		
		if(a2 instanceof Dog) {
			Dog d1 = (Dog) a2;
			d1.tailling();
			System.out.println(d1);
			System.out.println(a2);
		}
		// 동일한 객체를 참조하더라도, 참조되는 자료형(클래스)에 따라서 호출할 수 있는 메서드가 달라진다
		// 단, 오버라이딩 메서드는 슈퍼클래스에 정의되어 있기 때문에 호출할 수 있고
		// 내용을 덮어씌웠기 때문에 호출 후 실행되는 내용은 서브클래스에 작성된 내용을 따른다
		
	
	}
}
