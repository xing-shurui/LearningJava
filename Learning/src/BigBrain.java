import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BigBrain {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Caleb");
		names.push("Peter");
		names.push("Sally");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		names.add(2, "susan");
		
		for(String s : names) {
			System.out.println(s);
		}
	}
}