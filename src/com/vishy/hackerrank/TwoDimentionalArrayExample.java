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
        
        List<List<Integer>> rows = new ArrayList<List<Integer>>();
        for(int t = 0; t <= 3;t++)
        {
        	for(int row = t; row < 3 + t;row++)
        		rows.add(arr.get(row));
        	int col = 0;
        	int sum = 0;
        	while(col < 4) {
        		for(int i = 0; i < rows.size();i++) {
            		//System.out.println(rows.get(i));
            		int k = 0;
            		for(int j=col;j<col + 3;j++) {
            		//	System.out.print(rows.get(i).get(j));
            		//	System.out.print(" ");
            			if(i == 1 && (k == 0 || k == 2))
            				continue;
            			else
            				sum += rows.get(i).get(j);
            		}
            		//System.out.println();
            	}
        		col += 1;
        		System.out.print(sum);
        		System.out.print(" ");
        		sum = 0;
        		
        	}
        	System.out.println();
        	rows.clear();
        	System.out.println("------------------------------");
        }
        
//        for(int row = 0;row < 4;row++) {
//        	for(int i = row; i < row + 3;i++) {
//            	for(int j = 0; j < 3; j++) {
//            		System.out.print(rows.get(i).get(j));
//            		System.out.print(" ");
//            	}
//            	System.out.println();
//            }
//        	System.out.println("-------------------------");
//        }
        
        
    }

}
