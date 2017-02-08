package testChap9;

public class list9_23 {

	private static String money;

	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero h1 = new Hero();
		System.out.println(h1.money);
		
		
		System.out.println("h1.money:" + h1 + money);
		
		
		
		
		

	}

}
