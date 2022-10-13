package day01;

import java.util.Scanner;

// �ڹ��� �ҽ��ڵ�� Ŭ������ �⺻ ���� �����̴�
// �ڹٿ��� Ŭ������ ������ ������ ��Ҵ� ��� ù���ڸ� �ҹ��ڷ� �����Ѵ�
// (����, �Լ�, ����������, ��Ű��, ������Ʈ....)
// ��, Ŭ������ static final ����� ��� ���ڸ� �빮�ڷ� �ۼ��Ƹ�_�� �ܾ�� �����Ѵ�
// ���� �� �Լ��� �̸��� �ҹ���, _ �� �����Ҽ� �ִ�. ( ���ڴ� ù��° ���ڰ�  �� �� ����)


/*
*	dao.selectALL()	: ��ü�� �޼��带 ȣ��
*	DAO.getInstance() : Ŭ������ ���� �޼��带 ȣ��
*/
public class Ex01 {
	public static void main(String[] args) {
		
		
		// �ڷ���(data type)
		/*
		 * 	#	boolean 	1����Ʈ 	����			true, false
		 *		byte		1����Ʈ	����(8��Ʈ)		-128 ~ +127
		 *		short		2����Ʈ 	����(8��Ʈ)		-32768 ~ +32767
		 *		char		2����Ʈ	����(����)			0~ 65535
		 *		int			4����Ʈ 	����(32��Ʈ)		��-21��~��+21��
		 *	#	long		8����Ʈ	����(64��Ʈ)		-922�� ~ +922��
		 *		float		4����Ʈ	�Ǽ�
		 *	#	double		8����Ʈ 	�Ǽ�
		 * 
		 * 
		 * 1. primitive type (�ܼ� �ڷ���, ���� �ڷ���) (int,char,double,,,,)
		 * �ҹ��ڷ� �����Ͽ� �� 8���� �������� �ڷ����� �ִ�
		 * ������ �����Ͱ� �ƴϹǷ�, ������ �����͸� ���� �����Ѵ�
		 * 
		 * 2. reference Type (���� �ڷ���)
		 * - Array Type : �迭
		 *  - Class Type : Ŭ����, �������̽� ��...
		 * 
		 * ���� �����͸� �޸𸮿� �����ϰ� �ʹ� -> ũ�⿡ �´� ����
		 * ���� �ڷ����� �����͸� ������ ��� �����ϰ� �ʹ� -> �迭
		 * 
		 * ���� �ٸ� �ڷ����� �����͸� ��� �����Ϸ��� ���ο� �ڷ����� �����ؾ� �Ѵ�
		 * 
		 * ����ü in   c��� 		������ ��� �ڷ����� �����
		 * Ŭ���� in 	java(c++)	������ �Լ��� ��� �ڷ����� �����
		 * 
		 * 
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("itbank��� �Է��ϼ��� : ");
		String str1 = sc.nextLine();
		
		String str2 = "itbank"; 
		String str3 = new String("itbank");
		String str4 = "itbank";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		System.out.println(str2 == str4);
		sc.close();
				
		
	}
	
}
