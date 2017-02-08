package chap3;

public class MainP134 {

	public static void main(String[] args) {
		
		int point = 59;
		String judge = "";
        if (point == 100) {
          System.out.println("優秀");
        }else if(point >= 80){
        	System.out.println("優");
        }else if(point >= 60){
        	System.out.println("良");
        }else{
        
        	System.out.println("落第");
        	
        }
	}

}
