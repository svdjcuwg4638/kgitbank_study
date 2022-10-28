package tv;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TV tv = new TV(false, 2, 5, false);
		// TV 클래스를 구성하여 실제 현실의 TV기능을 모두 구현해보세요
		Scanner sc = new Scanner(System.in);
		// main에서는 TV의 메서드만 호출합니다
		int menu,power;
		
		do {
			System.out.println("1. power | 7 .프로그램 종료 ");
			power = Integer.parseInt(sc.nextLine());
			if(power == 1 )tv.powerBtn();
			while(tv.isPower()==true) {
				tv.show();
				menu = Integer.parseInt(sc.nextLine());
				switch(menu) {
				case 1 : 
					tv.powerBtn();
					continue;
				case 2 : 
					if(tv.getVolum() >= 10) tv.setVolum(1);
					else tv.setVolum(tv.getVolum()+1);
					break;
				case 3 :
					if(tv.getVolum() <=1) tv.setVolum(1);
					else tv.setVolum(tv.getVolum()-1);
					break;
				case 4 :
					tv.turnMute();
					break;
				case 5 :
					if(tv.getchanner() >=10) tv.setchanner(1);
					else tv.setchanner(tv.getchanner()+1);
					break;
				case 6 :
					if(tv.getchanner() <=1) tv.setchanner(10);
					else tv.setchanner(tv.getchanner()-1);
					break;
					
					
					
				}
			}
			
		}while(power !=7);
		sc.close();
	
	}
}
