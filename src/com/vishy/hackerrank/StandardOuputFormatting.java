package com.vishy.hackerrank;

import java.util.Formatter;
import java.util.Scanner;

public class StandardOuputFormatting {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Formatter formatter = new Formatter();
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            sc.nextLine();
            System.out.printf( "%-15s%03d %n", s1, x);
        }
        System.out.println("================================");

}

}
