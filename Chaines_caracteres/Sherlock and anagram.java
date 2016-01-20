import java.util.*;
public class Solution{

    /**
     * 
     * @param str
     * @return la string sorted alphabétiquement
     */
    private static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbLines = sc.nextInt();

        for (int i = 0; i < nbLines; i++) {
            String line = sc.next();
            int length = line.length();

            int answer = 0;

            HashMap<String, Integer> hm = new HashMap<>();

            for (int j = 1; j < length; j++) { // On itère pour chaque caractère
                for (int k = 0; k < (length -j +1); k++) {
                    String word = sortString(line.substring(k, k +j)); // Crée une sub string

                    if (hm.containsKey(word)) { // Si mot déjà présent dans la liste, on augmente son compte:
                        hm.put(word, hm.get(word) +1);
                    } else {    // sinon on ajoute le mot
                        hm.put(word, 1);
                    }
                    answer += hm.get(word) -1; // Ajuste le compte...
                }
            }
            System.out.println(answer);
        }
    }
}
