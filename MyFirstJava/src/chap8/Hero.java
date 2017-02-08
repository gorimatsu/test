package chap8;

public class Hero {
	//フィールド変数の宣言
	String name; //名前の宣言
	int hp; //HPの宣言


	//メソッド

	//眠る
	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	 //座る
	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した.");
	}

	//転ぶ
	void slip(){
		this.hp -= 5;

		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ");
	}

	 //逃げる
	void run(){
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}



	//戦う
	void attack(){
		System.out.println(this.name + "は、殴りかかった！！");
		System.out.println("HIT!!!");
		System.out.println("相手に100ダメージ与えた");
	}






}