package chap4;

public class list4_16a {

	public static void main(String[] args) {
	
	int[][]scores = { {40,50,60},{80,60,70} };
	System.out.println("親配列の要素数" + scores.length);
	System.out.println("子配列scores[1]の要素数" + scores[0].length);
	System.out.println("子配列scores[1]の要素数" + scores[1].length);
	
	for (int i = 0; i < scores.length; i++) {
		for (int j = 0; j < scores.length; j++) {
		  System.out.print(scores[i][j] + " ");
		  
		}
		System.out.println();
	}
	
	}
}
	

