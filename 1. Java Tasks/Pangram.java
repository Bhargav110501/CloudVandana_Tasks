/* 3. Check if the input is pangram or not. (A pangram is a sentence that contains all the 
alphabets from A to Z) */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        Set<Character> uniqueChar = new HashSet<>();

        for (Character ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                uniqueChar.add(ch);
            }
        }
        return uniqueChar.size() == 26; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean res = isPangram(s);
        System.out.println((res) ? "True" : "False");
        sc.close();
    }
      
}
