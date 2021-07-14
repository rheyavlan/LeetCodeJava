package leetcode.medium;

import java.util.Scanner;
import java.lang.String;
import leetcode.medium.*;
import java.util.Arrays;


public class Leetcode {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String for medium : \n" +
                "240. Search a 2D Matrix II \n");
        String text = sc.nextLine();

        switch(text) {
            case "240":
                Scanner target = new Scanner(System.in);
                System.out.println("Enter Target : ");
                int targetValue = target.nextInt();
                Search2DMatrixII search2DMatrixII = new Search2DMatrixII();
                int matrix[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
                boolean present = search2DMatrixII.searchMatrix(matrix, targetValue);
                System.out.println("\n The statement that target value : " + targetValue + " is present in 2D matrix is : "
                        + present);
                break;


            default:
                break;

        }


    }
}
