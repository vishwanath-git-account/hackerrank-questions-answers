package com.vishy.hackerrank;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int line = 1;
        while(scanner.hasNext()) {
        	String token = scanner.nextLine();
        	System.out.println(line + " " + token);
        	line=line + 1;
        	if(token.contains("end-of-file"))
        		break;
        }
        scanner.close();
        
    }

}
