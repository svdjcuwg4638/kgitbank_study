package serialize;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex04 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// ex03.dat�� ��ü�� list�� �����Ͽ� �Ʒ� ����ڵ尡 �۵��� �� �ֶǷ� ó���ϼ���.
		ObjectInput ois = new ObjectInputStream(new FileInputStream("03.dat"));
		ArrayList<Todo> list = (ArrayList<Todo>)ois.readObject();
		
		for(int i = 0 ; i< list.size();i++) {
			Todo t = list.get(i);
			System.out.println(t);
		}
		System.out.println("\n===============================================\n");
		
		for(Todo t : list) {
			System.out.println(t);
		}
		System.out.println("\n===============================================\n");
		
		list.forEach(t -> System.out.println(t));
		System.out.println("\n===============================================\n");
		
		list.forEach(System.out::println);
		System.out.println("\n===============================================\n");
		
	}

}
