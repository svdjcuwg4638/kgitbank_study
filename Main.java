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
		
		SimpleToDoList stl1 = new SimpleToDoList("여행", sdf1);
		SimpleToDoList stl2 = new SimpleToDoList("평가A형", sdf2);
		SimpleToDoList stl3 = new SimpleToDoList("sqld 시험", sdf3);
		
		hd.arr[0] = stl1;
		hd.arr[1] = stl2;
		hd.arr[2] = stl3;
		
		

		
		int menu;
		
		do {
			System.out.println("Simple Todo List ( 작성자 : 김대현 )");
			System.out.println();
			System.out.println("1. 목록 || 2. 추가 || 3. 완료 처리 || 4. 삭제 || 0. 종료");
			System.out.print("메뉴 선택 >>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu){
			case 1 :
				System.out.println("일정 목록 (날짜별로 오름차순 정렬)");
				hd.rangeArray();
				System.out.println(hd.showAll());
				break;
			case 2 : 
					
					System.out.print("계획 이름 입력 :");
					flanName = sc.nextLine();
					String inputDate=""; 
					System.out.print("날짜 입력 [ex yyyy.MM.dd ] : ");
					inputDate = sc.nextLine();	
					Date dt = sdf.parse(inputDate);
					SimpleToDoList ob = new SimpleToDoList(flanName, dt);
					if(hd.insert(ob)== 1 ) System.out.println("추가 성공");
					
					else System.out.println("추가 실패");
					
				break;
				
					
			case 3 :
				System.out.print("완료 처리하고싶은 계획 이름 입력 :");
				flanName = sc.nextLine();
				if(hd.finish(flanName)==1) System.out.println("완료 처리 끝");
				else System.out.println("완료 처리 실패. ( 일치하는 계획이 없습니다. )");
				break;
			case 4 :
				System.out.print("삭제 원하는 계획이름 입력 : ");
				flanName = sc.nextLine();
				int flag =hd.delete(flanName);
				if(flag==1)System.out.printf("%s 계획 삭제되었습니다.\n",flanName);
				else System.out.println("삭제 실패 ( 일치하는 계획이 없습니다. )");
				break;
				
			}
			
		}while(menu!=0);
		sc.close();
	
	}

}
