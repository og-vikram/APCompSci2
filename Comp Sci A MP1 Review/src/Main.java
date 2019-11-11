import java.util.Arrays;

public class Main {
    public static void main(String []args){

        int []array = {2, 5, 3, 7, 9, 9, 8, 20};

        System.out.println("Range of the array is: " + (array[7]-array[0]));

        int even = 0, odd=0;
        for (int i=0; i<array.length; i++){
            if(i%2==0){
                even += array[i];
            }
            else{
                odd+=array[i];
            }

        }
        System.out.println("Average of evens: " + (even/array.length));
        System.out.println("Average of odds: " + (odd/array.length));
    }

}
