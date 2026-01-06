class inheritance {
    int wheels = 4;

    void moveForward() {
        System.out.println("Move forward");
    }

    void moveReverse() {
        System.out.println("Move reverse");
    }
}

class Kia extends inheritance {
    int seat = 5;
    int mileage = 20;

    public static void main(String[] args) {
        Kia car = new Kia();

        System.out.println(car.wheels);   // from parent
        car.moveForward();                // call method, don't print void
        car.moveReverse();                // call method, don't print void
        System.out.println(car.seat);     
        System.out.println(car.mileage);
    }
}
