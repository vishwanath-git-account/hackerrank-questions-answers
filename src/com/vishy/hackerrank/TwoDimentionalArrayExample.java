package com.vishy.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TwoDimentionalArrayExample {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            //System.out.println(arrRowTempItems);
            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        int max = 0;
        int sum = 0;
        for(int i = 0; i < 3; i++) {
        	
        	
        	for(int j=i; j < i+3;j++) {
        		sum += arr.get(i).get(j); 
        	}
        	System.out.println(sum);
        }
        
    }

}
