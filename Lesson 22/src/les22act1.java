import java.util.Scanner;

public class les22act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bot = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String word = bot.nextLine();
		int length = word.length();
		int x =0;
		while(x<length){
				
			System.out.println(word.charAt((length-length)+x));
			
			x++;
			
		}
	}

}
