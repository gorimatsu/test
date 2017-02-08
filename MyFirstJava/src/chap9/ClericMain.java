package chap9;

public class ClericMain {

	public static void main(String[] args)  {

		Cleric c = new Cleric();
		c.name = "Cleric";
		c.mp = 5;
		c.pray(3);
		c.selfAid();
	}
}
