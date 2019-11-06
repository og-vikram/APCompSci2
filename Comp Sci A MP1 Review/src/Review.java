import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
			
		Scanner bot = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = bot.nextLine();
		
		for(int i =0; i<word.length(); i+=2){
		System.out.print(word.substring(i, i+1).toUpperCase());
		System.out.print(word.substring(i).toLowerCase());
		
		
		System.out.println(word);
	
		}
	}
}
