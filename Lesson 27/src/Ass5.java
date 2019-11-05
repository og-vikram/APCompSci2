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
			
			double[] newArray = Arrays.copyOf(array, array.length);
			Arrays.sort(newArray);
			
			System.out.println("The range is " + (newArray[newArray.length-1] - newArray[0]));
			
			boolean flag1 = true; 
			boolean flag2 = true;
			
		/*	for(int m =1; m<arrayLength; m++){
				if(array[m-1] > array[m] && flag1 == true){
					flag2 = false;
				}
				
				}
				if(array[m-1] < array[m] && flag2 == true){
					flag2=true;
				}
			}
			if(flag1==true){
				
				System.out.println("The array is sorted in decreasing order");
			}
			else if(flag2==true){
				
				System.out.println("The array is in increasing order");
			}
			else{
				System.out.println("The array is unsorted");
			}
			*/
		}
		
		
	}

}
