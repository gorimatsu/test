package chap11;

public class MainP424 {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		Matango m = new Matango();
		m.hp = 10;
		m.suffix = 'A';
		
		sh.fly();
		sh.attack(m);
		System.out.println("m.hp ="  + m.hp);
		sh.land();
	}

}
