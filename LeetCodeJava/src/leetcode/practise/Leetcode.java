package leetcode.practise;

import java.util.Scanner;
import java.lang.String;
import leetcode.practise.AlikeStringHalves;
import leetcode.practise.TwoSum;
import java.util.Arrays;


public class Leetcode {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : \n" +
                "1704. Alike String \n" +
                "1. Two Sum \n");
        String text = sc.nextLine();

        switch(text) {
            case "1704":
                Scanner alike = new Scanner(System.in);
                System.out.println("Enter String : ");
                String alikestring = alike.nextLine();
                AlikeStringHalves alikeStringHalves = new AlikeStringHalves();

            boolean alikeHalf = alikeStringHalves.halvesAreAlike(alikestring);
            break;

            case "1":
                Scanner targetsc = new Scanner(System.in);
                TwoSum twoSum = new TwoSum();
                int[] input = {2,7,11,15};
                int[] twosumArray = twoSum.twoSum(input, 9);
                System.out.println("Two Sum array : "+ Arrays.toString(twosumArray));
                break;

        }


    }
}
