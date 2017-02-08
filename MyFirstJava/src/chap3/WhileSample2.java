package chap3;

public class WhileSample2 {

	public static void main(String[] args) {

		int sai = 0;
		System.out.println("6の目が出るまでさいころを振り続けます。");

		while(sai != 6) {
			// 1～6のランダム値を sai に代入する
			sai = 1 + (int) (Math.random() * 6.0);
			System.out.println("さいころの目は" + sai + "でした。");
			// 6の目が出たらwhileループから抜ける
			if (sai == 6) {
				break;

			}
		}
		System.out.println("プログラムを終了します");

	}

}
