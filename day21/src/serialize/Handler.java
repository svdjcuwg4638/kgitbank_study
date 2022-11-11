package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Handler {

	private ArrayList<Todo> list = new ArrayList<Todo>();
	private ObjectInputStream ois;
	private FileWriter writer;
	
	@SuppressWarnings( "unchecked" )
	
	private void load() throws FileNotFoundException, IOException, ClassNotFoundException {
		ois = new ObjectInputStream(new FileInputStream("03.dat"));
		list = (ArrayList<Todo>)ois.readObject();
		System.out.println("불러오기 완료");
	}
	
	Handler() throws FileNotFoundException, ClassNotFoundException, IOException{
		load();
		
	}
	public void save() throws IOException {
		
		writer = new FileWriter(new File("saveData"));
		for(Todo td : list) {
			String value = td.toString();
			value+="\n";
			writer.append(value);
		}
		writer.flush();
		writer.close();
		System.out.println("저장완료");
	}
	public void show() {
		for(Todo str : list) {
			System.out.println(str.toString());
		}
		System.out.println();
	}
	
	public int insert(Todo todo) {
		if(list.add(todo)) return 1;
		return 0;
	}
	
	public int delete(Todo todo) {
		
		if(list.removeIf(f -> f.getTitle().equals(todo.getTitle()))) return 1;
			
		
			
		
		return 0;
	}

}
