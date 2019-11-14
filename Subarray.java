import java.util.*;
import java.util.Scanner;
public class Subarray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=sc.nextInt();
        
        int b = ((n-k+1)*(n-k+2))/2;
        
        	System.out.println(b);

	}
}