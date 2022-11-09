package thread;

// �ڹٿ��� ���� �����带 �����Ϸ���, Thread Ŭ������ ����ؾ��Ѵ�
// �ڹٿ����� ���� ����� ������� �ʴ´�
// �̹� ����Ŭ������ ������ Ŭ������ ������� ó���Ϸ���...? �������̽�

class NumberThread extends Object implements Runnable{



	@Override
	public void run() {
		for(int i =0; i<25;i++) {
			System.out.print(i + " ");
		}
		
	}
	
}

public class Ex08 {

	public static void main(String[] args) {
		NumberThread ob = new NumberThread();	// Runnable ��ü��
		Thread th = new Thread(ob);	// Thread ������ �Ű������� �����Ѵ�
		th.start();	// start�� ȣ���ϸ� run()�� ������ ������ �����忡�� �����Ѵ�.
		
		// Runnable�� �Լ��� �������̽���, ���ٽ� ��ü ������ �����ϴ�
		Thread th2 = new Thread(()-> {
			for(char ch = 'a';ch<='z';ch++) {
				System.out.print(ch+" ");
			}
		});
		th2.start();
		
		new Thread(()->System.out.println("hello")).start();
		for(char ch = 'A';ch <='Z';ch++) {
			System.out.print(ch+" ");
		}
		
		
		System.out.println();
	}

}
