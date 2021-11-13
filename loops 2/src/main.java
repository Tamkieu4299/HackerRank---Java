import java.util.*;
import java.io.*;
import java.lang.Math;

public class main {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter queries: ");
        int t=sc.nextInt();
        StringBuilder sb = new StringBuilder();
  
        for(int i=0;i<t;i++){

            int a = sc.nextInt();
            
            int b = sc.nextInt();
            
            int n = sc.nextInt();
            
            sb.setLength(0);
            
            for(int j=0; j<n; j++) {
                // 2^0 + 2^1 + ... 2^j = 2^(j+1) - 1
                sb.append((int) (a + b*(Math.pow(2, j+1) - 1))).append(" ");
            }
            System.out.println(sb.toString());
        }
        sc.close();

	}

}
