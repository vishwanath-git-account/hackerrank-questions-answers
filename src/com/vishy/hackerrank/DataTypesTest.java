package com.vishy.hackerrank;

import java.util.Scanner;

public class DataTypesTest {

	public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                System.out.println((-Math.pow(2, 16)/ 2));
                if(x >= (-Math.pow(2, 16)/ 2) && x < (Math.pow(2, 16)/ 2)-1)System.out.println("* short");  
                if(x >= (-Math.pow(2, 32)/ 2) && x < (Math.pow(2, 32)/ 2)-1)System.out.println("* int"); 
                if(x >= (-Math.pow(2, 64)/ 2) && x < (Math.pow(2, 64)/ 2)-1)System.out.println("* long"); 
                if(x > (Math.pow(2, 64)/ 2)-1) System.out.println("n can't be fitted anywhere."); 
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

}
