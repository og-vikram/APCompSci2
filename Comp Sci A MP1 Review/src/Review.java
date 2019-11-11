import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
			
		Scanner bot = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = bot.nextLine();
		
		for(int i =0; i<word.length(); i++){
			if(i%2==0){
				System.out.print(word.toUpperCase().charAt(i));
			}
			else{
				System.out.print(word.toLowerCase().charAt(i));
			}
	
		}
	}
}
