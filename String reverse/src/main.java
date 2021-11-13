import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     String A=sc.next();
	     
	     
	     /* String builder */
	     StringBuilder input1 = new StringBuilder(A);
	     StringBuilder input2 = new StringBuilder(A);
       
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        System.out.println(input1);
        
        
	    if(input1.toString().equals(input2.toString())) {
	    	System.out.println("Yes");
	    }  
	    else {
	    	System.out.println("No");
	    }
	    
	    /* One line Solution 
	     
	    System.out.println( A.equals( new StringBuilder(A).reverse().toString()) 
	    	    ? "Yes" : "No" );
	   	*/
	    
	    /* Another solution
	     
	    for(int i=0,j=A.length()-1;i<=j;i++,j--) {

            if(A.charAt(i)!=A.charAt(j)) 
            {k=1;}

            }

    		System.out.println((k==0)?"Yes":"No");
    	*/
	     
	}

}
