public class Solution {
    private static String generateLine(String s1) {
        int size = s1.length();
        String newString = "";
        int i = 0;
        while (i < size) {
            int j = i;
            int offset = 1;
            while ((i + offset < size) && (s1.charAt(i) == s1.charAt(i + offset))) {
                offset++;
            }
            if (offset > 1)  {
                i += offset;
            } else {
                i++;
            }
            newString = newString + offset + s1.charAt(j);
        }

        return newString;
    }

    public static void main(String[] args) {
        String s1 = generateLine("1321131112");
        for (int i = 0; i < 39; i++) {
            s1 = generateLine(s1);
        }
        System.out.println(s1.length());
    }
}
