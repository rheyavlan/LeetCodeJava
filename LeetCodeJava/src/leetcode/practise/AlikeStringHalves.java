package leetcode.practise;

public class AlikeStringHalves {
    public static boolean halvesAreAlike (String s){
        System.out.println("Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.\n" +
                "\n" +
                "Return true if a and b are alike. Otherwise, return false. ");

        int stringHalvedLength = s.length() / 2;
        String st = s;
        String stringHalvedFirst = st.substring(0, stringHalvedLength);
        String stringHalvedSecond = st.substring(stringHalvedLength, st.length());

        int vowelFirstHalf = 0;
        int vowelSecondHalf = 0;

        boolean alike = false;

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
            System.out.println("Entered Text : " + s + " Answer : " + alike);
            System.out.println("True");
            alike = true;
            return alike;

        } else {
            System.out.println("False");
            System.out.println("Entered Text : " + s + " Answer : " + alike);
            alike = false;
            return alike;
        }
    }
}