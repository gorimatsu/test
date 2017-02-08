package chap3;

import java.util.Scanner;

public class prc4_3 {

	public static void main(String[] args) {
		//(1)配列の準備
		int[] numbers = { 3, 4, 9 };
		System.out.println("1桁の数字を入力してください");
		
		int input = new Scanner(System.in).nextInt();
		
		for (int n : numbers) {
			if (n == input){
				System.out.println("アタリ！");
			}
			
		}
		
		
	
	}
			

}
