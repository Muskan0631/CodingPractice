import java.util.Scanner;

public class StarProblem2_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int mid=(2*n-1)/2;
		for(int i=0;i<n-1;i++) {
//			System.out.print(mid+i);
//			System.out.print(mid-i);
			for(int j=0;j<2*n-1;j++) {
				if((j==mid+i) || (j==mid-i)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<2*n-1;i++) {
			System.out.print("*");
		}


}
}

/*
    *    
   * *   
  *   *  
 *     * 
*********
 */
