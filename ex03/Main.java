package ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Main2 ������ handler�� ������� �ʰ� ��� ������ main���� ó���Ѵ�
		// handler�� ���ٸ� �����͸� ������ �迭�� main�� �־�� �Ѵ�
		
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		String name, result;			// ����� ����� ���ڿ� ������ result
		int kor, eng, mat, row, select;	// �Լ��� ó�� ����� ����޴� ������ row
		Student ob;
		
		do {
			System.out.println("1. ��� | 2. �߰� | 3. �˻� | 4. ���� | 5. ���� | 0. ����");
			System.out.print("�޴� ���� >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				result = "";
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
						result += arr[i].toString() + "\n";
					}
				}
				System.out.println(result);
				break;
				
			case 2:
				System.out.print("�̸� �Է� : "); name = sc.nextLine();
				System.out.print("���� �Է� : "); kor = Integer.parseInt(sc.nextLine());
				System.out.print("���� �Է� : "); eng = Integer.parseInt(sc.nextLine());
				System.out.print("���� �Է� : "); mat = Integer.parseInt(sc.nextLine());
				ob = new Student(name, kor, eng, mat);
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] == null) {
						arr[i] = ob;
						break;
					}
				}
				break;
			case 3:break;
			case 4:break;
			case 5:break;
			}
			
			System.out.println();
		} while(select != 0);
		sc.close();
	}
}
