package chap5;

public class list5_14 {

	public static void incNum(int num) {
		num++;// num=num + 1;
		System.out.println("incNumメソッド内の　num =" +num);
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int n = 5;
		incNum(n);
		System.out.println("メインメソッド内の n =" + n);

	}

}

