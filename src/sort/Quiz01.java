package sort;

public class Quiz01 {
	public static void main(String[] args) {
		String[] nameArray= {"������","ȫ��ȣ","��ȣ��","��ȣ��","�̺���"};
		int[] ageArray = {30,41,53,42,40};
		
		show(nameArray,ageArray);
		// 1) ���� ������ �������� ���� �� ����ϼ���
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
		// 2) �̸� ������ �������� ���� �� ����ϼ���
		for(int i =0; i < nameArray.length;i++) {
			for(int j =0; j < nameArray.length;j++) {
				if(nameArray[i].compareTo(nameArray[j])<0){	///compareTo �� String�� ����
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
		// ��, ���Ŀ� ���ؼ� �̸��� ���̰� �������� �ȵ˴ϴ� !!
	}

	private static void show(String[] nameArray, int[] ageArray) {
		for(int i =0; i <nameArray.length;i++) {
			System.out.printf("%s : %d��\n",nameArray[i],ageArray[i]);
		}
		System.out.println();
		
	}
}
