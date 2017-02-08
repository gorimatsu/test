package chap3;

public class DigitNO2 {

	public static void main(String[] args) {
		int n = 567865;
		int len = String.valueOf(n).length();
		int d = (int)Math.pow(10,len - 1);
		
		for(int i = 1; i <= len; i++){
			System.out.println(i + "桁目は" + (n/d) + "です");
			n %= d;
			d /= 10;
		}

	}

}