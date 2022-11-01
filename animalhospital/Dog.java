package animalhospital;

public class Dog extends Animal {
	
	
	Dog(String name,int age) {
		super(name,age);
	}
	
	public void tailling() {
		System.out.println(name + "°¡ ²¿¸®¸¦ Èçµì´Ï´Ù.");
	}
	@Override
	public void bark() {
		System.out.println(name + "°¡¸Û¸ÛÇÏ°í Â¢½À´Ï´Ù.");
		
	}
	
}
