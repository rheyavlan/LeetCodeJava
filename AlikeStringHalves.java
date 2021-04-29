package leetcode.string;

import java.util.Scanner;

public class AlikeStringHalves {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String text = sc.nextLine();

        boolean alikeHalf = halvesAreAlike(text);
        System.out.println("Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.\n" +
                "\n" +
                "Return true if a and b are alike. Otherwise, return false. ");
        System.out.println("Entered Text : " + text + " Answer : " + alikeHalf);
    }

        public static boolean halvesAreAlike (String s){
            int stringHalvedLength = s.length() / 2;
            String st = s;
            String stringHalvedFirst = st.substring(0, stringHalvedLength);
            String stringHalvedSecond = st.substring(stringHalvedLength, st.length());

            int vowelFirstHalf = 0;
            int vowelSecondHalf = 0;

            for (int i = 0; i < stringHalvedFirst.length(); i++) {
                char ch = stringHalvedFirst.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelFirstHalf++;
                }
            }

            for (int i = 0; i < stringHalvedSecond.length(); i++) {
                char ch = stringHalvedSecond.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelSecondHalf++;
                }
            }

            if (vowelFirstHalf == vowelSecondHalf) {
                System.out.println("True");
                return true;

            } else {
                System.out.println("False");
                return false;
            }
        }
}
