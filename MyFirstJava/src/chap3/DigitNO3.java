package chap3;

import java.util.Scanner;

public class DigitNO3 {

	public static void main(String[] args) {
        
		System.out.println("正の整数の桁数を求めます");
		int x = new Scanner(System.in).nextInt();
		int digit = 0;
		
		while (x > 0){
			digit++;
			x /= 10;
		}
		System.out.println("その数は"+ digit+ "桁です");
	}

}
