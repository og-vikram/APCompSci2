import java.util.Scanner;

public class Ass6 {

	public static void main(String[] args) {

		Scanner bot = new Scanner(System.in);
		int length;
		//checks if length is less than 10	
		boolean valid = true;
		while(valid) {
		    System.out.println("Enter array length");
		    length = bot.nextInt();
		    if(length < 10) {
		        valid = false;
		    }
		    else {
		        valid = true;
		   //makes 2 arrays    
		     int[] array = new int[length];
			 int[] sArray = new int[length];	
		    
		    for(int i=0; i<array.length; i++){
		    	array[i] = (int) (Math.random() * 100);
		    	sArray[i] = (int) (Math.random() * 100);
		    }
		    //prints both arrays
		    System.out.println("First array:");
		    for(int i =0; i<array.length; i++){
		    	System.out.print(array[i] + " ");   
		    }
		    System.out.println();
		    System.out.println("Second array:");
		    for(int i =0; i<array.length; i++){
		    	System.out.print(sArray[i] + " ");
		    } 
		 
		   int[] merge = new int[array.length + sArray.length];
		        for(int i =0; i<merge.length-1; i+=2){
		        	merge[i] = array[i];
		        	}
		        
		        for(int j =1; j<merge.length-1; j+=2){
	        		
	        		merge[j] = sArray[j];
		        }
		    }
		  

		}
	}

}
