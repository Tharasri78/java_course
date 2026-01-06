import java.util.Scanner;
public class Tree{
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int tree=sc.nextInt();
        int total=rows*cols;
        int lastSi=total-(2*rows);
        int lastEi=total-rows;

        if((tree>rows)  && ( tree<=rows*2)){
            System.out.println("Its a mango tree");

        }
        else if (tree>lastSi && tree<=lastEi) {
                        System.out.println("Its a mango tree");

        }
        else{
            System.out.println("Not a Mango tree");
        }

      
         


        }}