package inheritance;

class Super {
	
	int n1;
	
	Super(int n1){
		this.n1 = n1;
		System.out.println("Super ������ ȣ��");
	}
}


class Sub extends Super{
	
	int n2;
	
	Sub(int n1,int n2){
		super(n1);
		this.n2 = n2;
		System.out.println("Sub ������ ȣ��");
	}
}


public class Ex03 {
	public static void main(String[] args) {
		
		Sub ob = new Sub(10,20);
		System.out.printf("n1 : %d, n2 : %d \n",ob.n1,ob.n2);
	}
}
