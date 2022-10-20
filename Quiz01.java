package array;

public class Quiz01 {
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
		int[][] arr = new int[5][5];
		int cnt =1 ;
		guide(arr);
		// �ʱⰪ�� �����
		// x , y ���� �����ϸ� �̵�
		// while �ȿ� for��
		int width =5 ; //����
		int height =4 ; //����
		int x=-1,y=0;
		while(cnt<=25) {
			
			for(int i =0 ; i<width;i++) {
					arr[y][++x]=cnt++;
	
			}
			width--;

			for(int i =0; i<height ; i++) {
				arr[++y][x]=cnt++;
			}
			height--;
			for(int i =0; i<width;i++) {
				arr[y][--x]=cnt++;
			}
			width--;
			for(int i =0; i<height;i++) {
				arr[--y][x]=cnt++;
			}
			height--;
			
		}
		show(arr);
	}	
			
}


