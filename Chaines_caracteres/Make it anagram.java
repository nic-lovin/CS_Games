import java.io.*;
import java.util.*;

public class Solution {

    /**
     * 
     * @param list
     * @return un tableau qui contient le nombre d'occurences pour chaque lettre de l'alphabet
     */
    private static int[] countOccurences(String[] list) {
        int[] letters = new int[26];

        for (int i = 1; i < list.length; i++) {
            char ch = list[i].charAt(0);
            int pos = ch - 'a';
            letters[pos] = letters[pos] + 1;
        }
        return letters;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] lineOne = sc.next().split("");
        String[] lineTwo = sc.next().split("");
        Arrays.sort(lineOne); // On sort pour que ça aille plus vite
        Arrays.sort(lineTwo);

        int[] lineOneLetters = countOccurences(lineOne);
        int[] lineTwoLetters = countOccurences(lineTwo);

        int count = 0;
        for (int i = 0; i < lineOneLetters.length; i++) {
            if (lineOneLetters[i] > lineTwoLetters[i]) { // Si le nombre de lettres est différent, alors on l'ajoute au count
                count += lineOneLetters[i] - lineTwoLetters[i];
            }
            if (lineTwoLetters[i] > lineOneLetters[i]) {
                count += lineTwoLetters[i] - lineOneLetters[i];
            }
        }

        System.out.println(count);

    }
}
