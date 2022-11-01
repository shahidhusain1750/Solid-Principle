public abstract class Car {

    final int s = 100;

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void start(String name);

    public abstract void stop();

    public void setName(String name) {
        this.name = name;
    }
}