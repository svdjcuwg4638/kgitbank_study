package kimdaehyun_2A;




import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) throws Exception{
		
		Handler hd = new Handler();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Scanner sc = new Scanner(System.in);
	
		String flanName;
		
	
		
		
		Date sdf1 = sdf.parse("2022.12.20");
		Date sdf2 = sdf.parse("2022.10.27");
		Date sdf3 = sdf.parse("2022.11.05");
		
		SimpleToDoList stl1 = new SimpleToDoList("����", sdf1);
		SimpleToDoList stl2 = new SimpleToDoList("��A��", sdf2);
		SimpleToDoList stl3 = new SimpleToDoList("sqld ����", sdf3);
		
		hd.arr[0] = stl1;
		hd.arr[1] = stl2;
		hd.arr[2] = stl3;
		
		

		
		int menu;
		
		do {
			System.out.println("Simple Todo List ( �ۼ��� : ����� )");
			System.out.println();
			System.out.println("1. ��� || 2. �߰� || 3. �Ϸ� ó�� || 4. ���� || 0. ����");
			System.out.print("�޴� ���� >>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu){
			case 1 :
				System.out.println("���� ��� (��¥���� �������� ����)");
				hd.rangeArray();
				System.out.println(hd.showAll());
				break;
			case 2 : 
					
					System.out.print("��ȹ �̸� �Է� :");
					flanName = sc.nextLine();
					String inputDate=""; 
					System.out.print("��¥ �Է� [ex yyyy.MM.dd ] : ");
					inputDate = sc.nextLine();	
					Date dt = sdf.parse(inputDate);
					SimpleToDoList ob = new SimpleToDoList(flanName, dt);
					if(hd.insert(ob)== 1 ) System.out.println("�߰� ����");
					
					else System.out.println("�߰� ����");
					
				break;
				
					
			case 3 :
				System.out.print("�Ϸ� ó���ϰ���� ��ȹ �̸� �Է� :");
				flanName = sc.nextLine();
				if(hd.finish(flanName)==1) System.out.println("�Ϸ� ó�� ��");
				else System.out.println("�Ϸ� ó�� ����. ( ��ġ�ϴ� ��ȹ�� �����ϴ�. )");
				break;
			case 4 :
				System.out.print("���� ���ϴ� ��ȹ�̸� �Է� : ");
				flanName = sc.nextLine();
				int flag =hd.delete(flanName);
				if(flag==1)System.out.printf("%s ��ȹ �����Ǿ����ϴ�.\n",flanName);
				else System.out.println("���� ���� ( ��ġ�ϴ� ��ȹ�� �����ϴ�. )");
				break;
				
			}
			
		}while(menu!=0);
		sc.close();
	
	}

}
