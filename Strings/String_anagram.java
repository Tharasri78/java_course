import java.util.Scanner;

public class String_anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (s1.indexOf(ch) != s1.lastIndexOf(ch))
                continue;

            if (s1.indexOf(ch) != s2.indexOf(ch)) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}