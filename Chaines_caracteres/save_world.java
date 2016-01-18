import java.util.*;
public class Solution {
    private static boolean is_matching(String lineOne, String lineTwo) {
        int length;
        int lengthOne = lineOne.length();
        int lengthTwo = lineTwo.length();
        if (lengthTwo > lengthOne) {
            length = lengthTwo;
        } else {
            length = lengthOne;
        }

        boolean count = false;
        for (int i = 0; i < length; i++) {
            if ((i >= lengthOne) || (i >= lengthTwo)) {
                if (lengthTwo > lengthOne) {
                    return false;
                }
                return true;
            } else {
                if (lineOne.charAt(i) != lineTwo.charAt(i)) {
                    if (count) {
                        return false;
                    }
                    count = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String lineOne = sc.next();
            String lineTwo = sc.next();
            boolean rep = false;
            int lengthOne = lineOne.length();
            for (int j = 0; j < lengthOne; j++) {
                if (is_matching(lineOne.substring(j), lineTwo)) {
                    System.out.print(j + " ");
                    rep = true;
                }
            }
            if (!rep) {
                System.out.println("No Match!");
            } else {
                System.out.println();
            }
        }
    }
}
