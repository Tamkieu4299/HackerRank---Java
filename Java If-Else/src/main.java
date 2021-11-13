import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        scanner.close();
        
        if(N % 2 !=0) {
        	System.out.println("Weird");
        }
        else {
        	System.out.println("Not Weird");
        }
	}

}
