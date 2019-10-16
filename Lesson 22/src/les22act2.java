import java.util.Scanner;

public class les22act2 {
		
		public static void main(String []args){
			
			Scanner bot = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			String word = bot.nextLine();
			int length = word.length();
			int x =0;
			int y = 0;
			while(x<length){
					
				while(y<length){
					System.out.print("\t");
					
					y++;
				}
				
				System.out.println(word.charAt(x));
					
					
				
				x++;
				
			}
		}
	}


