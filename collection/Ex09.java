package collection;


import java.util.Arrays;
import java.util.List;

public class Ex09 {
	public static void main(String[] args) {
		
		Integer[] arr = {1,5,7,4,3};
		List<Integer> list = Arrays.asList(arr);
		// asList �迭�� ����Ʈ�� ��ȯ����
		System.out.println(list);
		
		list.sort((a,b) -> a - b);
		System.out.println(list);
	}
}
