package studentTeacher;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Handler {

	private List<Student> list = new ArrayList<Student>();
	private File f = new File("student.txt");
	private Scanner loader;
	private FileWriter writer;
	
	public Handler() throws IOException {
		if(f.exists()) {
			loader = new Scanner(f);
			int cnt = 0;
			while(loader.hasNextLine()) {
				cnt++;
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
			System.out.printf("\n\t%d�� ������ �ҷ����� �Ϸ� !!\n\n", cnt);
		}
		else {
			System.out.println("�ҷ��� �����Ͱ� �����ϴ�");
		}
	}

	public void save() throws IOException {
		writer = new FileWriter(f);
		for(int i = 0; i < list.size(); i++) {
			Student st = list.get(i);
			writer.append(st.getFileData());
		}
		writer.flush();
		writer.close();
		System.out.println("���� �Ϸ� !!");
	}
	
	public void showList() {
		for(Student st : list) {
			st.show();
		}
		System.out.println();
	}

	public void insert(Student st) {
		list.add(st);
	}

	public void delete(String name) {
		// list���� ������ ���� �ݺ����ȿ��� �������� ����
		// list.remove(int index)	// index ��°�� ��ü�� �����Ѵ�
		// list.remove(Object o)	// o�� ��ġ�ϴ� ��ü�� �����Ѵ� (equals)
		
//		int index = -1;
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).name.equals(name)) {
//				index = i;
//			}
//		}
//		if(index != -1) {
//			list.remove(index);	// �ݺ������� ȣ������ �ʴ´�
//		}
		
		// list�� remove�� ȣ���Ͽ� ��ü�� �����ϸ� �� ��� size�� ��ȭ�Ѵ�
		// for������ �����ϸ�, ������ Ƚ����ŭ �ݺ��ϱ�� ����ϰ� �����ϴµ�
		// ���߿� size�� ����Ǹ�, ������ Ƚ����ŭ �ݺ��� ������ �� �������� ������
		// ���ܰ� �߻��� �� �ִ�.
		
		list.removeIf(st -> st.name.equals(name));
		// ���ǿ� �´� ��ü�� ã�Ƽ� �����Ѵ�
		
	}

	public void sortByName() {
		list.sort((a, b) -> a.name.compareTo(b.name));	// int Ÿ������ ��ȯ�ϱ�
	}
	
	public void sortBySum() {
		list.sort((a, b) -> a.sum - b.sum);
	}
	
	public void sortByAvg() {
		list.sort((a, b) -> a.avg - b.avg > 0 ? 1 : -1);
	}
	
	

	
}
