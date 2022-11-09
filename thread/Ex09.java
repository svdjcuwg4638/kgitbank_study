package thread;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Timer extends Object implements Runnable{
	private int second;
	private boolean over;
	
	public Timer(int second) {
		this.second = second;
	}
	
	public void check() {
		for (int i = second; i != -1; i--) {
			System.out.printf("\t[%02d:%02d]\n",i/60,i%60);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
				
		}
		over=true;
	}
	public boolean isOver() {
		return over;
	}

	@Override
	public void run() {
		check();
		
	}
}

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		// 10�� ���� �󸶳� ���� ���ڿ��� �Է��� �� �ִ��� Ȯ���ϴ� �ڵ带 �ۼ��غ�����
		Timer tm = new Timer(5);
		Thread th = new Thread(tm);
		System.out.print("�Է� :");
		list.add(sc.nextLine());
		
		th.start();
		while(tm.isOver() == false) {
		
			System.out.print("�Է� :");
			list.add(sc.nextLine());
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		sc.close();
		// 10�ʰ� ������ ���ݱ��� �Է¹��� ��� ���ڿ��� ���پ� ����մϴ�
	}

}
