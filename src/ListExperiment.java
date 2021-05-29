import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListExperiment {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		List<String> l2=new LinkedList<>();

		for(int i=0;i<50;i++) {
			String s= makeString(6);
			l1.add(s);
			l2.add(s);
		}
		
//		Iterator<String> ii=l1.iterator();
//		ii.next();
//		ii.remove();
//		ii.remove();
		
//		Iterator<String> i1=l1.iterator();
		int count=0;
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//			count++;
//			if(count%2==0)
//				i1.remove();
//		}
//		System.out.println("-----------");
//		i1=l1.iterator();
//		while(i1.hasNext())
//			System.out.println(i1.next());
		
		ListIterator<String> i2=l2.listIterator();
		while(i2.hasNext())
			System.out.println(i2.next());
		count=0;
		while(i2.hasPrevious()) {
			i2.previous();
			count++;
			if(count%2==0)
				i2.remove();
		}
		System.out.println("-----------");
		while(i2.hasNext())
			System.out.println(i2.next());
	}

	public static String makeString(int len,int ...seed) {
		Random rn;
		if(seed.length>0)
			rn=new Random(seed[0]);
		else
			rn=new Random();
		StringBuilder sb=new StringBuilder(len);
		for(int i=0;i<len;i++)
		{
			int code=rn.nextInt(26)+65;
			char[] c=Character.toChars(code);
			sb.append(c);
		}	
		return sb.toString();
	}
}
