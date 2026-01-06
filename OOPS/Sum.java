import java.util.Scanner;

class Sum {
    public int addition(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Sum s = new Sum();
        int result = s.addition(num);

        System.out.println("Sum of digits = " + result);
    }

}