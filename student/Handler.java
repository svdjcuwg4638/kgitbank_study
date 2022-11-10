package student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Handler implements Comparator<Student> {

	private List<Student> list = new ArrayList<Student>();
	private File f = new File("student.txt");
	private Scanner loader;
	private FileWriter writer;

	public Handler() throws IOException {
		if (f.exists()) {
			loader = new Scanner(f);
			int cnt =0;
			while (loader.hasNextLine()) {
				cnt ++;
				String line = loader.nextLine();
				String[] arr = line.split(",");
				String name = arr[0];
				int kor = Integer.parseInt(arr[1]);
				int eng = Integer.parseInt(arr[2]);
				int mat = Integer.parseInt(arr[3]);
				Student st = new Student(name, kor, eng, mat);
				list.add(st);

			}
			loader.close();
			System.out.println(cnt+"개의 데이터 불러오기 완료!!");
		} else
			System.out.println("불러올 데이터가 없습니다.");
	}

	public void showList() {

		for (Student st : list) {
			st.show();
		}
		System.out.println();
	}

	public void save() throws IOException {
		writer = new FileWriter(f);
		for (int i = 0; i < list.size(); i++) {
			Student st = list.get(i);
			writer.append(st.getFileData());
		}
		writer.flush();
		writer.close();
		System.out.println("저장완료!!");
	}

	public void insert(Student st) {
		list.add(st);
		
	}

	public int delete(String name) {
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				return 1;
			}
		}
			
		
		return 0;
	}
	
	public void sortByName() {
		list.sort((a,b)-> a.name.compareTo(b.name));
	}
	public void sortBysum() {
		list.sort((a,b)->a.sum -b.sum);
	}
	public void sortByAvg() {
		list.sort((a,b)->a.avg-b.avg >0? 1:-1);
	}
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}


	

	
}
