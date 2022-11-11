package com.vishy.hackerrank;

import java.util.Scanner;

public class StaticInitializationBlocks {

	private static boolean flag;
	private static int B, H;
	static{
	    Scanner scanner = new Scanner(System.in);
	    B = scanner.nextInt();
	    H = scanner.nextInt();
	    if (B <= 0 || H <= 0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
	    }
	    else
	        flag = true;
	        
	    scanner.close();
	}

	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main


}
