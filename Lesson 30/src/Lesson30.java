import java.util.Scanner;

public class Lesson30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner bot = new Scanner(System.in);	
		String array[] = new String[2];
	
		System.out.println("Enter a word");
		array[0] = bot.nextLine();
		
		System.out.println("Enter a word");
		array[1] = bot.nextLine();
		
		char[] array0 = array[0].toCharArray();
		char[] array1 = array[1].toCharArray();
		
		array0[0] = array1[0];
		array1[0] = array0[0];
		
		String x = String.valueOf(array0);
		String y = String.valueOf(array1);
	
		System.out.println(x + " " + y);
	}
}