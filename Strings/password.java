import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        int upper = 0, lower = 0, digit = 0, special = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else if (Character.isDigit(ch))
                digit++;
            else
                special++;
        }

        int count = 0;

        if (password.length() < 8) {
            System.out.println("Password too short");
            count++;
        }

        if (upper == 0) {
            System.out.println("Missing uppercase letter");
            count++;
        }

        if (lower == 0) {
            System.out.println("Missing lowercase letter");
            count++;
        }

        if (digit == 0) {
            System.out.println("Missing digit");
            count++;
        }

        if (special == 0) {
            System.out.println("Missing special character");
            count++;
        }

        if (count == 0) {
            System.out.println("Strong Password");
        }
    }
}