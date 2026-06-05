public class Vehicle {
    String color;
    String type;
    int speed;

    public void displayInfo() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.type = "Car";
        car.color = "Red";
        car.speed = 120;


        Vehicle bike = new Vehicle();
        bike.type = "Bike";
        bike.color = "Blue";
        bike.speed = 80;

        car.displayInfo();
        System.out.println();
        bike.displayInfo();
    }
}