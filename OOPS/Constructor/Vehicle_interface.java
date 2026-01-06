

interface Vehicle_interface {
	final int a=10;
    void moveforward();
}

class Toyota implements Vehicle_interface {

    public void moveforward() {
        System.out.println("Moves at 100km");
    }

    public static void main(String[] args) {
        Toyota car = new Toyota();
        car.moveforward();
        System.out.println(car.a);
    
}
}