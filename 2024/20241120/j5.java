package midterm1113;

public class j5 {
    public static void main(String[] args) {

        String a="Scanner scanner = new Scanner(System.in);",b;
        
        System.out.println("a length = "+a.length());
        ArrayList<String> words = new ArrayList<>();
        
        for(int i=0,j=0; j<a.length();j++) { 	
        	//System.out.println("i = "+i+ "  j = "+j+" "+a.substring(i, j+1));
        	if (a.charAt(j) == ' ') {
        		words.add(a.substring(i, j)); 
        		System.out.println("i = "+i+ "  j = "+j+" "+ a.substring(i, j));
        		i=j;}
        	if(j==a.length()-1) {
        		words.add(a.substring(i, j+1));
        		System.out.println("i = "+i+ "  j+1 = "+(j+1)+" "+ a.substring(i, j+1));
        	}
        	
        }

    }


}
