public class SVCar extends Car {

    public SVCar(String name) {
        super(name);

    }

    @Override
    public void start(String name) {
        System.out.println("Car is started");

    }

    @Override
    public void stop() {
        System.out.println("Car Stoped");

    }

}
