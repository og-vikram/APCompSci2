
public class questions {
    public static String [] list = {};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<list.length; i++){
			
			for(int j=0; j<list[i].length(); j++){
				if(list[i].charAt(j) == ' '){
				list[i]=list[i].substring(0,j) + list[i].substring(j+1) ;
				}
				
			}
			
		}
		
		
	}
	
}

