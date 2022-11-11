package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream obj = new ObjectInputStream(new FileInputStream("03.dat"));
		ArrayList<String> list = (ArrayList<String>)obj.readObject();
		
		list.forEach(f->System.out.println(f));
	}
	
	

}
