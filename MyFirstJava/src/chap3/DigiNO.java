package chap3;

public class DigiNO {
	
	}
	public static final int length(long value) {
		
		int cnt = 0;
		do{
			cnt++;
			value /= 10;
		}while (value != 0);
		return cnt;
	}
	
	public static void main(String[] args){
		
	int n = 89847;
	System.out.println(length(n));
	
	}
}
