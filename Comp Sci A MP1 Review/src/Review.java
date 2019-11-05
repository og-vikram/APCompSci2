import java.util.Scanner;

public class Review {

	public static void main(String[] args) {

		Scanner bot = new Scanner(System.in);
		System.out.println("enter word");
		String word = bot.nextLine();
		
		if(word.length()>=1 && word.length()<=3){
			System.out.println(word.substring(word.length()-1));
		}
	
		else if(word.length()>3 && word.length()<7){
			for(int i=0; i<word.length(); i+=2){
				System.out.print(word.charAt(i));
			}
		}
		else if(word.length()>=7){
			System.out.println(word.substring(7,word.length()));
		
		}
	}
	

}
