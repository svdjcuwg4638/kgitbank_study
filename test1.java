package day02;

import java.util.Scanner;

class Product{
	private int cnt, pee;
	static int sum;
	
	Product(int cnt, int pee){
	this.cnt = cnt;
	this.pee = pee;
	Productsum();
	
	}
	private void Productsum(){
		sum += cnt *pee;
	}
}

public class test1 {
	
	public static void main(String[] args) {
		int totalpee,totalcnt;
		Scanner sc = new Scanner(System.in);
		System.out.println("ÃÑ ±Ý¾× ÀÔ·Â:");
		totalpee = sc.nextInt();
		
		System.out.println("ÃÑ °¹¼ö ÀÔ·Â:");
		totalcnt = sc.nextInt();
		
		Product [] pr = new Product[totalcnt]; 
		
		for(int i = 0; i<totalcnt;i++) {
			System.out.println("¹°Ç° °´¼ö¿Í °¡°Ý ÀÔ·Â :");
			pr[i]= new Product(sc.nextInt(),sc.nextInt());
		}
		
		String result = (Product.sum == totalpee) ? "yes" : "no";
		System.out.println(result);
		sc.close();
						
	}



}
