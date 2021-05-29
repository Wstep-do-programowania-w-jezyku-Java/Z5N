import java.time.LocalDate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		Set<Pracownik> s1=new TreeSet<>();
		
		s1.add(new Pracownik("Jan","Kowalski", LocalDate.of(1999, 1, 10)));
		s1.add(new Pracownik("Janusz","Adamowski", LocalDate.of(2000, 10, 1)));
		s1.add(new Pracownik("Marian","Boruta", LocalDate.of(1987,11, 11)));
		
		System.out.println("Sortowanie po nazwisku:");
		Iterator<Pracownik> i1=s1.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		
		Set<Pracownik> s2 =new TreeSet<Pracownik>(new Comparator<Pracownik>() {

			@Override
			public int compare(Pracownik o1, Pracownik o2) {
				// TODO Auto-generated method stub
				return o1.getImie().compareTo(o2.getImie());
			}
		});
		
		s2.addAll(s1);
		System.out.println("Sortowanie po imieniu:");
		Iterator<Pracownik> i2=s2.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
		
		Set<Pracownik> s3=new TreeSet<>((c1,c2)->c1.getDataUr().compareTo(c2.getDataUr()));
		
		s3.addAll(s1);
		System.out.println("Sortowanie po dacie urodzenia: (implementacja z wyrażeniem lambda)");
		Iterator<Pracownik> i3=s3.iterator();
		while(i3.hasNext())
			System.out.println(i3.next());
		
	}

}

class Pracownik implements Comparable<Pracownik>{
	private String imie,nazwisko;
	private LocalDate dataUr;
	public Pracownik(String imie, String nazwisko, LocalDate dataUr) {
		super();
		this.imie=imie;
		this.nazwisko = nazwisko;
		this.dataUr = dataUr;
	}
	
	
	public String getImie() {
		return imie;
	}


	public String getNazwisko() {
		return nazwisko;
	}


	public LocalDate getDataUr() {
		return dataUr;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return imie+" "+nazwisko+" "+dataUr;
	}
	@Override
	public int compareTo(Pracownik o) {
		// TODO Auto-generated method stub
		return this.nazwisko.compareTo(o.nazwisko);
	}
	
	
}
