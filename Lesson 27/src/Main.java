import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner jah = new Scanner(System.in);
    System.out.println("How long do you want the array?");
    int length = jah.nextInt();
    double nums [];
    double avg = 0;
    double min = 2147483647;
    double max = -2147483647;
    double range = 0;
    String inc = "";
    String dec = "";
    String none = "The array is unsorted";

    if(length<=0){
      System.out.print("Not a valid length!");
    }else{
      nums = new double [length];
      for(int i=0; i<length; i++){
        System.out.println("Enter a number");
        nums[i] = jah.nextDouble();
      }
      System.out.print("Your array is {");
      for(int i=0; i<nums.length; i++){
        if(i==nums.length-1){
          System.out.println(nums[i] + "}");
        }else{
          System.out.print(nums[i] + ", ");
        }
      }
        for(int j=0; j<nums.length; j++){
          avg += nums[j];
        }
        for(int k=0; k<nums.length; k++){
          if(nums[k]>max){
            max = nums[k];
          }
          if(nums[k]<min){
            min = nums[k];
          }
          range = max - min;
        }
        for(int d=1; d<nums.length; d++){
          if(nums[d]>=nums[d-1]){
            inc = "The array is sorted in increasing order";
          }else if(nums[d]<=nums[d-1]){
            dec = "The array is sorted in decreasing order";
        }
      }
      System.out.println("The average is " + avg/nums.length);
      System.out.println("The range is " + range);
      if(inc != "" && dec != ""){
        System.out.println(none);
      }else{
        System.out.println(inc + dec);
      }
    }
  }
}

