

public class College {
	
int classrooms=50;
int labs=30;
int staffs=60;
void Placements() {
	System.out.println("Placement Training");
}
}
class Department extends College{
	String dpt="IT";
	String Role="Developer";
	int students=500;
	
	
}
class Student extends Department{
	int Roll_no=58;
	String Domain="Fullstack Developer";
	
	  public static void  main(String[] args) {
		  College clg=new College();
		  Department dpts=new Department();
		  Student me=new Student();
		System.out.println(clg.classrooms);	 
		clg.Placements();
		System.out.println(dpts.Role);
		System.out.println(me.Domain);
		System.out.println(me.Roll_no);
		
		  
	  }
	
}
