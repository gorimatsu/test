package chap4;

public class list4_8 {

	public static void main(String[] args) {

		int [] score = { 20, 30, 40, 50, 60 };
		int sum = 0;
//		
//		for (int i = 0; i < 6; i++) {
//			sum = sum + score[i];
//			}
		
		for (int i : score) {
			System.out.println(i);
			
		}
		
		
		
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + sum / score.length);
	
				
	}

}