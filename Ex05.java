package day04;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex05 {
	
	
	public static void main(String[] args) throws IOException {
		// �޼��� �����ε�
		// overload : ������
		File f = new File("C:\\window\\system32\\drivers\\etc\\hosts");
		String str = "sgesefsefsegsesgsefse";
		InputStream in = System.in;
		
		
		
		Scanner sc1 = new Scanner(f);	//������ ������ �о���̴� ��ĳ��
		Scanner sc2= new Scanner(str);	//���ڿ��� ������ �о���̴� ��ĳ��
		Scanner sc3 = new Scanner(in);	// ǥ���Է��� ������ �о���̴� ��ĳ��
		
		// Scanner()��� �Ϲ��� �̸��� �ϳ��ε�
		// �Ű������� �ڷ����� ����, �����δ� 3���� �Լ��� ���� ���� �����Ѵ�
		// �Ű������� �־��ִ� ���ڰ��� �ڷ����� ���� ���� �ٸ� �Լ��� �����ϴ� ���̴�
		// �ϳ��� �̸��� ���� �Լ��� ���ǰ� �ߺ��Ǿ� ����� ������ �Լ� �����ε��̶�� �Ѵ�
		int n1 =sum(0,10);
		int n2 =sum(20,10,30);
		int n3 =sum(1,2,3,4,5,6,7,8,4);
		double n4 = sum(1.2,3.4);
		
	}	//end of main
	// �� ������ ���޹޾Ƽ� �հ踦 ��ȯ�ϴ� �Լ� sum
	static int sum(int n1,int n2) {
		return n1 + n2;
	}
	// �� ������ ���޹޾Ƽ� �հ踦 ��ȯ�ϴ� �Լ� sum
	static int sum(int n1,int n2, int n3) {
		return n1+n2+n3;
	}
	static int sum(int...args) {

		int total =0;
		for(int i =0; i<args.length;i++) {
			total+=1;
		}
		return total;
	}
		
//		 �� �Ǽ��� ���޹޾Ƽ� �հ踦 ��ȯ�ϴ� �Լ� sum
	static double sum(double n1,double n2) {
		return n1+n2;
	}
		
	
	
}
