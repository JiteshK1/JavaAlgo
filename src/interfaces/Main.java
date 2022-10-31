package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
//        Engine car = new Car();
//        car.brake();
//        car.acc();
//        car.start();

    NiceCar car1 = new NiceCar();
    car1.startEngine();
    car1.startMedia();
    car1.upgradeEngine();
    car1.startEngine();
    }
}
