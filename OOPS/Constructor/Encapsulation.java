
public class Encapsulation {
	   private int rollno=0;
	//    private int Marks=0;
	//    private int Cutoff=0;

	   public int getRollno(){
	    return rollno;
	   }                                                 
	   public void setRollno(int a){
	    this.rollno=a;
	   }
	//    public int getMarks() {
	// 	   return Marks;
	//    }
	//    public void setMarks(int b) {
	// 	   this.Marks=b;
	//    }
	//    public int getCutoff() {
	// 	   return Cutoff;
	//    }
	//    public void setCutoff(int c) {
	// 	   this.Cutoff=c;
	//    }

	    public static void  main(String[] args){
	        Encapsulation a1=new Encapsulation();
	        a1.setRollno(10);
	        // a1.setMarks(90);  
	        // a1.setCutoff(170);
	        System.out.println("Roll No: "+a1.getRollno());
	        // System.out.println("Marks:"+a1.getMarks());
	        // System.out.println("Cutoff:"+a1.getCutoff());


	   

	   

	   }   
	}

