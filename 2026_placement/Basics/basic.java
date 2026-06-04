import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float item1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float discount = sc.nextFloat();

        float total = item1 + item2;
        float saved = total * discount / 100;
        float finalPrice = total - saved;

        System.out.printf("%.2f\n%.2f\n%.2f", total, finalPrice, saved);
    }
}