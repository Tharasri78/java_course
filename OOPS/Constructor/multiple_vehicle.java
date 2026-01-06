
/*single parent child1 extends parent and child2 extends child1
class A {}
class B extends A {}
class C extends B {}
*/
class multiple_vehicle {
    int wheels = 4;

    void moveForward() {
        System.out.println("Move forward");
    }

    void moveReverse() {
        System.out.println("Move reverse");
    }
  

}


class Kia extends multiple_vehicle {
    int seat = 5;
    int mileage = 20;
}
class kiabranch extends Kia{
    int cc=200;
    
    public static void main(String[] args) {
        Kia car = new Kia();
        kiabranch car2=new kiabranch();

        System.out.println(car.wheels);
        car.moveForward();                
        car.moveReverse();                
        System.out.println(car.seat);     
        System.out.println(car.mileage);
        System.out.println(car2.cc);
    }
}
