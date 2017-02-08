package chap5;

public class list5_12 {

	// int型配列を受け取り、すべての要素を表示するメソッド
	
	
	public static void prinArray(int[] array) {
		for (int i : array) {
			
			System.out.println(i);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		prinArray(array); //配列を渡す
		System.out.println("10+20+30=" + add(10,20,30));
		

	}



	private static String add(int i, int j, int k) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
