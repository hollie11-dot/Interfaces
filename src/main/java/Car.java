public class Car extends Vehicle implements Drivable {
    @Override
    public void move() {
        System.out.println("Car is driving.");
    }
}
