package chap9;

public class list9_6 {

	public static void main(String[] args) {
		//勇者の生成
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		
		//勇者h2の生成
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;


		
		//魔法使い wの作成
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		//魔法使いの動作
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h1.name + "の体力" + h1.hp + " ");
		System.out.println(h2.name + "の体力" + h2.hp);

	}

}
