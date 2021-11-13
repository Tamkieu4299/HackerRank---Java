import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
		
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		
        for(int i = 1; i<=10; i++) {
        	System.out.println(N + " x " + i + " = " + N*i);
        }

        //bufferedReader.close();
		sc.close();

	}

}
