import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static Scanner sc = new Scanner(System.in);
    static int B;
    static int H;
    static boolean flag;
    
    static void calc() {
    	B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        
        if ((B<=0) || (H<=0)) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            flag = true;
        }
    }
   
   
//    static Scanner input = new Scanner(System.in);
//    static boolean flag = true;
//    static int B = input.nextInt();
//    static int H = input.nextInt();
//
//    static{
//        try{
//            if(B <= 0 || H <= 0){
//                flag = false;
//                throw new Exception("Breadth and height must be positive");
//            }
//        }catch(Exception e){
//            System.out.println(e);
//        }
//
//    }

public static void main(String[] args){
		calc();
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}