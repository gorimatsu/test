package chap8;

public class Matango {

	//フィールドの宣言
	int hp;
	final int LEVEL = 10;
	char suffix;
	
	//逃げるメソッド
	void run(){
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}

}
