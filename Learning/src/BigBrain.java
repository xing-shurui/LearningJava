import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BigBrain {

	public static void main(String[] args) {
		try {
			Scanner scanner =new Scanner(new File("test"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
			
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Caleb");
		names.push("Peter");
		names.push("Sally");
		
		System.out.println(names.pop());
		System.out.println(names.pop());
		System.out.println(names.pop());
		
	}
}