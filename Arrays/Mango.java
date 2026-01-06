// import java.util.Scanner;

// public class Mango {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int tree_no = sc.nextInt();

//         int[][] arr = {
//             {1,2,3,4,5},
//             {6,7,8,9,10},
//             {11,12,13,14,15},
//             {16,17,18,19,20},
//             {21,22,23,24,25}
//         };

//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j < arr[i].length; j++){
//                 if(arr[i][j] == tree_no){
//                     if(i == 0 || i == arr.length-1 || j == 0 || j == arr[i].length-1){
//                         System.out.println("It is a mango tree");
//                         return;  
//                     }
//                 }
//             }
//         }

//         System.out.println("Not a mango tree");
//         sc.close();
//     }
// }
