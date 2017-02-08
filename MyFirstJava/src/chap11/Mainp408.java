package chap11;

public class Mainp408 {

	private static Hero sh;

	public static void main(String[] args) {
		
		Hero h = new Hero();
		Matango m = Matango();
		m.hp = 10;
		m.suffix = 'A';
		System.out.println("勇者" + h.name + "体力:" + h.hp + " お化けキノコ" + m.suffix + m.hp);
		
		h.attack(m);
		h.run();
		System.out.println("勇者" + h.name + "体力:" + h.hp + " お化けキノコ" + m.suffix + m.hp);
		SuperHero.sh = new SuperHero();
		System.out.println("勇者" + h.name + "体力:" + h.hp + " お化けキノコ" + m.suffix + m.hp);
		sh.run();

	}

	private static Matango Matango() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	;
	}


