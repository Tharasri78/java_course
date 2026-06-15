import java.util.ArrayList;

public class Arraylist{
     public static void main(String[] args){
        ArrayList<Integer> a1=new ArrayList<>();//<Object> is used to store any type of data
        a1.add(10);
        a1.add(20);
        a1.add(30);//a1.add("thara")

        for(int i=0;i<a1.size();i++){
                System.out.println(a1.get(i));

        }

        // for(int i:a1){
        //     System.out.println(a1.get(i)+2);
        // }
        
        
     }
}