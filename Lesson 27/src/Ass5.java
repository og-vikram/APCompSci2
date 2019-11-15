import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner bot = new Scanner(System.in);
		System.out.println("How long do you want your array to be?");
		int arrayLength = bot.nextInt();
		
		if (arrayLength <= 0){
			System.out.println("Not a valid array length!"); 
		}
		else{
			double[] array= new double[arrayLength];
		
			for(int i=0; i<arrayLength; i++){
				System.out.println("Enter a number");
				array[i]=bot.nextDouble();
				}
		
			System.out.print("Your array is {");

			for(int j = 0; j<array.length; j++){
				System.out.print(array[j]);
				if(j==(array.length-1)){
				System.out.println("}");
				}
				else{
				System.out.print(",");
				}
			}
			
			//average
			double average = 0;
			for(int k = 0; k<arrayLength; k++){
				average += array[k];
			}
			System.out.println("The average is " + average/arrayLength);
			
			//range
			double min = 2147483647;
		    double max = -2147483647;
		    double range = 0;
		    
			for(int i =0; i<array.length; i++){
				if(array[i]>max){
		            max = array[i];
		          }
		          if(array[i]<min){
		            min = array[i];
		          }
		          range = max - min;
			}
			String inc="";
			String dec="";
			
			for(int d=1; d<array.length; d++){
		          if(array[d]>=array[d-1]){
		            inc = "The array is sorted in increasing order";
		          }else if(array[d]<=array[d-1]){
		            dec = "The array is sorted in decreasing order";
		        }
		      }
			
		      System.out.println("The range is " + range);
		      if(inc != "" && dec != ""){
		        System.out.println("The array is unsorted");
		      }else{
		        System.out.println(inc + dec);
		      }
		}

		
	}

}
