class Vehicles{
    String name;

    public Vehicles(String name){
        this.name = name;
    }

    public void start(){
        System.out.println(name+" is starting...");
    }
    public void stop(){
        System.out.println(name+" is stopping...");
    }
}

class Car extends Vehicles{
    public Car(){
        super("Car");
    }

    @Override
    public void start() {
        System.out.println("The Car's engine is starting with roar!");
    }

    @Override
    public void stop() {
        System.out.println("The Car's engine is stopping with brake lights!");
    }
}

class Bike extends Vehicles{
    public Bike(){
        super("Bike");
    }

    @Override
    public void start() {
        System.out.println("The bike is starting with a smooth engine rev!");
    }

    @Override
    public void stop() {
        System.out.println("The bike is stopping with its hand brake!");
    }
}


public class Vehicle {
    public static void main(String[] args){
        Vehicles vehicle = new Vehicles("Cycle");
        vehicle.start();
        vehicle.stop();

        System.out.println();
        Car car = new Car();
        car.start();
        car.stop();

        System.out.println();
        Bike bike = new Bike();
        bike.start();
        bike.stop();
    }
}
