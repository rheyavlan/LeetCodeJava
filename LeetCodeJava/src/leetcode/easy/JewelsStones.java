package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class JewelsStones {
    public int numJewelsInStones(String jewels, String stones) {

        System.out.println("ou're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.\n" +
                "\n" +
                "Letters are case sensitive, so \"a\" is considered a different type of stone from \"A\".");

        int numOfJewelsInStones = 0;


        char[] jewelsChar = new char[jewels.length()];
        char[] stonesChar = new char[stones.length()];

        for(int i=0; i< jewels.length(); i++) {
            jewelsChar[i] = jewels.charAt(i);

            for(int j=0; j< stones.length();j++){
                stonesChar[j] = stones.charAt(j);
                if(stonesChar[j]==jewelsChar[i]) {
                    numOfJewelsInStones+=1;
                }
            }
        }

        return numOfJewelsInStones;

    }
}