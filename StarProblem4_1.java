import java.util.Scanner;

public class StarProblem4_1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			
	        for(int j=0;j<n;j++){
	          if(j==n-i-1)
	            	System.out.print("X");
	          else {
	        	  System.out.print(".");
	          }
	            
	            }
	        
	        System.out.println();
	    }
		
	}


}
/*
....X
...X.
..X..
.X...
X....
*/