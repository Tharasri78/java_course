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

        if (password.length() < 8)
            System.out.println("Password too short");
        else if (upper == 0)
            System.out.println("Missing uppercase letter");
        else if (lower == 0)
            System.out.println("Missing lowercase letter");
        else if (digit == 0)
            System.out.println("Missing digit");
        else if (special == 0)
            System.out.println("Missing special character");
        else
            System.out.println("Strong Password");

        
    }
}