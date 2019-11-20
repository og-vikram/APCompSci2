
public class bruh {
	public static String [] list = {};
		public static void main(String[] args)
    {
      for (int i = 0; i < list.length; i++){
        int bruh = list[i].length()-1;
        for (int y = list[i].length()-1; y >= 0; y--){
          System.out.print(list[i].charAt(bruh));
          bruh--;
        }
        System.out.println();
      }
         
    }
}
