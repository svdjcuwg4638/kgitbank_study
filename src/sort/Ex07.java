package sort;

public class Ex07 {
	public static void main(String[] args) {
		String str = "Helloworld";
		char[ ]arr=str.toCharArray();	//String�� char[] �� �ٲ���
		
		
		
		
		for(int i =0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {	//���� ���ڰ� �� ũ���� �ٲ�� (��������)
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
