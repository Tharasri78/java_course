
// public class cnt{
//     public static void main(String[] args) {
//        String str="Hello";
//        str+="World";
//        System.out.println(str);
//     String str2="Arun";
//      String str1=str2.substring(1,4); 
//      System.out.println(str1);  
        

//     }
// }

public class cnt{
    public static void main(String[] args) {
       String str="madam";
       String rev="";
         for(int i=str.length()-1;i>=0;i--){
              rev+=str.charAt(i);
         }
         if(str.equals(rev)){
            System.out.println("Pallindrome");
         }
         else{
            System.out.println("Its not a pallindrome");
         }


      
        

    }
}
