import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExperments {
	public static void main(String[] args) throws FileNotFoundException {
		Set<String> s1=new HashSet<>();
		Set<String> s2=new TreeSet<String>();
		try (Scanner sc = new Scanner(new File("PanTadeusz.txt"))) {
			while(sc.hasNext()) {
				s1.add(sc.next());
			}
			System.out.println(s1.size());
		}
		s2.addAll(s1);
		Iterator<String> i=s2.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println(s2.size());
	}

}
