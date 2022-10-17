package sort;

public class Quiz01 {
	public static void main(String[] args) {
		String[] nameArray= {"이지은","홍진호","강호동","주호민","이병건"};
		int[] ageArray = {30,41,53,42,40};
		
		show(nameArray,ageArray);
		// 1) 나이 순으로 내림차순 정렬 후 출력하세요
		for(int i =0;i< ageArray.length-1;i++) {
			for(int j =i+1;j<ageArray.length;j++) {
				if(ageArray[i]<ageArray[j]) {
					int tmp =ageArray[i];
					ageArray[i]=ageArray[j];
					ageArray[j]=tmp;
					String tmp2 =nameArray[i];
					nameArray[i]=nameArray[j];
					nameArray[j]=tmp2;
				}
			}
		}
		show(nameArray,ageArray);
		// 2) 이름 순으로 오름차순 정렬 후 출력하세요
		for(int i =0; i < nameArray.length;i++) {
			for(int j =0; j < nameArray.length;j++) {
				if(nameArray[i].compareTo(nameArray[j])<0){	///compareTo 는 String만 가능
					int tmp =ageArray[i];
					ageArray[i]=ageArray[j];
					ageArray[j]=tmp;
					String tmp2 =nameArray[i];
					nameArray[i]=nameArray[j];
					nameArray[j]=tmp2;
				}
			}
		}
		show(nameArray,ageArray);
		// 단, 정렬에 의해서 이름과 나이가 엇갈리면 안됩니다 !!
	}

	private static void show(String[] nameArray, int[] ageArray) {
		for(int i =0; i <nameArray.length;i++) {
			System.out.printf("%s : %d살\n",nameArray[i],ageArray[i]);
		}
		System.out.println();
		
	}
}
