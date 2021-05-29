import java.util.ArrayList;
import java.util.List;

public class PersonPrinter {

	public static void main(String[] args) {
		List<Czlowiek> ludzie=new ArrayList<>();
		ludzie.add(new Czlowiek("Jan", "Kowalski", "Wrocław"));
		ludzie.add(new Czlowiek("Roman", "Kwiatek", "Olkusz"));
		ludzie.add(new Czlowiek("Piotr", "Nowak", "Trzebinia"));
		ludzie.add(new Czlowiek("Marian", "Skórka", "Wyry"));
		ludzie.add(new Czlowiek("Stefan", "Kwiatek", "Olkusz"));
		ludzie.add(new Czlowiek("Grażyna", "Nowak", "Trzebinia"));
		ludzie.add(new Czlowiek("Jan", "Matejko", "Kraków"));
		ludzie.add(new Czlowiek("Roman", "Dąbrowski", "Oświęcim"));
		ludzie.add(new Czlowiek("Maria", "Konopnicka", "Myślenice"));
		
		Printer p=new Printer(ludzie);
//		p.print(new Filtr() {
//			
//			@Override
//			public boolean accept(Czlowiek c) {
//				// TODO Auto-generated method stub
//				return c.getImie().contains("Jan");
//			}
//		});
		p.print(c->c.getImie().contains("Jan"));
		p.print(c->c.getMiasto().contains("O"));
		p.print(c->c.getNazwisko().contains("N") && c.getMiasto().contains("T"));
		
	}

}

interface Filtr{
	boolean accept(Czlowiek c);
}

class Printer{
	List<Czlowiek> ludzie;

	public Printer(List<Czlowiek> ludzie) {
		super();
		this.ludzie = ludzie;
	}
	
	public void print(Filtr f) {
		for(Czlowiek c: ludzie) {
			if(f.accept(c))
				System.out.println(c);
		}
	}
}

class Czlowiek{
	private String imie, nazwisko, miasto;

	public Czlowiek(String imie, String nazwisko, String miasto) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.miasto = miasto;
	}

	public String getImie() {
		return imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public String getMiasto() {
		return miasto;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return imie+" "+nazwisko+" "+miasto;
	}
}
