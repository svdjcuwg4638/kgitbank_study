package array;

public class Quiz02_test {
	static void guide(int[][] arr) {
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				System.out.printf("(%d, %d) ",i,j);
			}
			System.out.println();
		}
		System.out.println();
	}	
	static void show(int[][] arr) {
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int x=-1,y=0 ;
		int cnt=0;
		int length=5;
		int[][] arr = new int[length][length];
		int sign=1;
		
		
		while(true) {
			
			for(int i =0; i< length;i++) {
				x += sign;
				arr[x][y]=++cnt;
			}
			
			length --;
			if(cnt ==25) break;
			for(int i =0; i< length;i++) {
				y += sign;
				arr[x][y]=++cnt;
			}
			sign = -sign;
		}
		show(arr);
		
	}
}
