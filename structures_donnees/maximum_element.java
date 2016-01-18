import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String line = sc.next();
            if (line.equals("1")) {
                al.add(Integer.parseInt(sc.next()));
            } else if (line.equals("2")) {
                  al.remove(al.size()-1);
            } else {
                System.out.println(Collections.max(al));
            }
        }
    }
}
