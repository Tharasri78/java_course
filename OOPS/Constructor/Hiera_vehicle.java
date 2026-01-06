/*single parent multiple child extends parent class
class A {}
class B extends A {}
class C extends A {}

*/

class Hiera_vehicle {
    int wheels = 4;//kia model

    void moveForward() {
        System.out.println("Move forward");
    }

    void moveReverse() {
        System.out.println("Move reverse");
    }
  

}


class Kiabranch1 extends Hiera_vehicle {
    int seat = 5;
    int mileage = 20;
}
class Kiabranch2 extends Hiera_vehicle{
    int cc=200;
    
    public static void main(String[] args) {
        Kiabranch1 car = new Kiabranch1();
        Kiabranch2 car2=new Kiabranch2();

        System.out.println(car.wheels);   // from parent
        car.moveForward();                // call method, don't print void
        car.moveReverse();                // call method, don't print void
        System.out.println(car.seat);     
        System.out.println(car.mileage);
        System.out.println(car2.cc);
    }
}
