package chap8;

public class clericMain {

	public static void main(String[] args) {

		//聖職者クレリックの生成
		clericMain c = new ClericMain();
		System.out.println("クレリックの体力" + c hp + "クレリックの魔法能力" + c mp);
		c hp = 40;
		System.out.println("クレリックの体力" + c hp + " クレリックの魔法能力" + c mp);
		c selfAid();
		System.out.println("クレリックの体力" + c hp + "クレリックの魔法能力" + c mp);

	}



	}

}
