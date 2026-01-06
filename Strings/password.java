// import java.util.Scanner;

// public class password {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Password: ");
//         String password = sc.nextLine();

//         int upper = 0;
//         int lower = 0;
//         int digit = 0;
//         int special = 0;

//         if(password.length() >= 8){

//             for(int i = 0; i < password.length(); i++){
//                 char ch = password.charAt(i);

//                 if(Character.isUpperCase(ch))
//                     upper++;
//                 else if(Character.isLowerCase(ch))
//                     lower++;
//                 else if(Character.isDigit(ch))
//                     digit++;
//                 else
//                     special++;
//             }

//             if(upper > 0 && lower > 0 && digit > 0 && special > 0)
//                 System.out.println("Strong Password");
//             else
//                 System.out.println("Weak Password");
//         }
//         else{
//             System.out.println("Password must be at least 8 characters");
//         }

//         sc.close();
//     }
// }
