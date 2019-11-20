
public class questions {
    public static String [] list = {};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String reverse = "";
		
		for(int i=0; i<list.length; i++){
			for(int j=list.length; j>=0; j++){
				
				reverse = reverse + list[i].charAt(j);
			}
			System.out.println(reverse);
		
		}
		
	}
	
}

