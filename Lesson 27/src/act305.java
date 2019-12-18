import java.util.Scanner;
import java.lang.Math;

public class act305{
    public static void main(String[] args){
        Scanner bot = new Scanner(System.in);
        int countVar = 0;
        int bruh;
        int baseTen = 0;        //Base Ten Answer
        String stringInput = "";
        System.out.println("Enter a number in base 8:");
        int intinput = bot.nextInt();
         stringInput += intinput;
        if(stringInput.length() > 8)
        {
            System.out.println("Wrong octal format, error");
            return;
        }
        for(; countVar < stringInput.length(); countVar++)
        {
            if(stringInput.charAt(countVar) == '8' || stringInput.charAt(countVar) == '9') {
                System.out.println("Wrong octal format, error");
                return;
            }
        }
        bruh = Integer.parseInt(stringInput);
        int [] intArray = new int [8];
        for(int i = 0; i <= stringInput.length(); i++)
        {
            intArray[i] = bruh % 10;
            bruh /= 10;
            baseTen += (intArray[i] * Math.pow(8,i));
        }
   System.out.println(baseTen);
    }
}