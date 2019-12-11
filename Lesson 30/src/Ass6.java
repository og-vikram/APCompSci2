import java.util.Scanner;

public class Ass6 {

	public static void main(String[] args) {

		Scanner bot = new Scanner(System.in);
				
		boolean valid = true;
		while(valid) {
		    System.out.println("Enter array length");
		    int length = bot.nextInt();
		    if(length < 10) {
		        valid = false;
		    }
		    else {
		        valid = true;
		    int[] array = new int[length];
		    for(int i=0; i<length-1; i++){
		    	array[i] = (int) (Math.random() * 100);
		    }
		    int[] sArray = new int[length];
		    for(int i=0; i<length-1; i++){
		    	sArray[i] = (int) (Math.random() * 100);
		    }
		        
		    }
		  

		}
	}

}
