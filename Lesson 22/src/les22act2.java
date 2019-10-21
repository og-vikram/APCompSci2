import java.util.Scanner;

public class les22act2 {
		
		public static void main(String []args){
			
			Scanner bot = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			String word = bot.nextLine();
			int length = word.length();
			int x =0;
			String space = "";
			while(x<length){
					
			
				System.out.println(space + word.charAt(x));
					
				space = space + "\t";
				
				x++;
				
			}
		}
	}


