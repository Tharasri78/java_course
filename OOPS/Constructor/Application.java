public class Application{
   int rollno=0;
   int marks=0;
    Application(int r,int m){//constructor
      this.rollno=r;
      this.marks=m;
   }
    Application(Application obj){//constructor
      this.rollno=obj.rollno;
      this.marks=obj.marks;
   }

        public static void main(String args[]){
             Application obj1=new Application(25,123);
             Application obj2=new Application(20,1234);

             System.out.println("Roll No: "+obj1.rollno);
             System.out.println("Marks: "+obj2.marks);
             
        
   }

}
