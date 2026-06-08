

abstract class Vehicles {
	abstract void moveforward();

}
class toyoto extends Vehicles{
	void moveforward() {
		System.out.println("Moves at 150 km speed");
	}
	

public class Main{
public static void main(String[] args) {
	toyoto car=new toyoto();
	car.moveforward();
}
}
}
