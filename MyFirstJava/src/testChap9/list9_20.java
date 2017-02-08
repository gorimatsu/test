package testChap9;

public class list9_20 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Hero.money = 100;
		
		System.out.println(Hero.money);
		System.out.println(Hero.money);
		Hero.money = 300;
		System.out.println(Hero.money);

	}

}
