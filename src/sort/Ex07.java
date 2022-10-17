package sort;

public class Ex07 {
	public static void main(String[] args) {
		String str = "Helloworld";
		char[ ]arr=str.toCharArray();	//String을 char[] 로 바꿔줌
		
		
		
		
		for(int i =0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {	//앞의 숫자가 더 크면은 바꿔라 (오름차순)
					char tmp =arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		System.out.println(arr);
	
	
		for(int i =0; i<arr.length;i++) {
			char ch =arr[i];
			System.out.printf(arr[i]+" ");
		}
		System.out.println();
	}
}
