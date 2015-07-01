package com.infer.utils.basics;

/**
 * Created by Anoop on 6/30/2015.
 */
public class MultiDimensionArray {
    public static void main(String[]args){
        int[][]Efficient= new int[2][5];
        Efficient[0][0]= 2;
        Efficient[0][1]= 5;
        Efficient[0][2]= 8;
        Efficient[0][3]= 7;
        Efficient[0][4]= 9;

        Efficient[1][0]= 3;
        Efficient[1][1]= 1;
        Efficient[1][2]= 29;
        Efficient[1][3]= 23;
        Efficient[1][4]= 8;

        int rows=2;
        int column=5;

        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                System.out.print(Efficient[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
