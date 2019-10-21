import java.util.Scanner;

public class Main {
	public static void main(String []args){
		
		Scanner bot = new Scanner(System.in);
		
		System.out.println("Type the message to be shortened");
		String word = bot.nextLine();
		String nWord = "";
		int vowel = 0;
		int doubleLetters = 0;
		
		if(word.length() < 10){
			System.out.println("This doesn't need shortening!");
		}else{
			word = word.toLowerCase();
			for(int i = 0; i <word.length(); i++){
				if(i==0){
					nWord = "" + word.substring(0,1);	
				}
				else if(word.charAt(i-1) == ' '){
					nWord = nWord + word.charAt(i);
				}else if(word.charAt(i-1) == word.charAt(i) 
						&& word.charAt(i)!= 'a'&& word.charAt(i)!= 'e'
						&& word.charAt(i)!= 'i'&& word.charAt(i)!= 'o'
						&& word.charAt(i)!= 'u')
				{
				doubleLetters++;
				}
				else{
					if(word.charAt(i) != 'a'&& word.charAt(i) != 'e'&&
					   word.charAt(i) != 'i'&& word.charAt(i) != 'o' &&
					   word.charAt(i) != 'u')
					{
					   nWord = nWord + word.charAt(i);	
					}
					else{
						vowel++;
					}
				}	
			}
			System.out.println("Shortened message: " + nWord);
			System.out.println("Repeated letters removed: " + doubleLetters);
			System.out.println("Vowels removed: " + vowel);
			System.out.println("Total characters saved: " + (doubleLetters+vowel));
		}
	}
}
			
			
			
			
		


