package airplane;

import java.util.Random;

public class Airplane {
	
	private Random ran = new Random();
	Human[] arr = new Human[5];
	
	public int entrance(Human c) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = c;
				System.out.println(c.name + " ž�� �Ϸ�");
				return 1;
			}
		}
		System.out.println(c.name + " ž�� �Ұ�");
		return 0;
	}
	
	public int emergency() {
		
		int index;
		int cnt = 0;
		do {
			index = ran.nextInt(arr.length);
			if(cnt > 100) {
				System.out.println("ž�°��� �����ϴ�");
				return -1;
			}
			cnt++;
		}while(arr[index] == null);
		
		System.out.println(arr[index].name + " ���� ��ü�߽��ϴ�");
		return index;
	}
	
	
	public void healing(int index) {
		for(int i =0; i < arr.length;i++) {
			if(arr[i]!= arr[index] && arr[i] instanceof Doctor) {
				Doctor d1 =(Doctor) arr[i];
				d1.heal(arr[index]);
				break;
			}
		}
	}

	
}
