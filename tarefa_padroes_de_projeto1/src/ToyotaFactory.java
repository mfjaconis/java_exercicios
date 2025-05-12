public class ToyotaFactory implements CarFactory {
    @Override
    public Car createSedan(String name, int year, String color) {
        return new Sedan("Toyota Sedan " + name, year, color);
    }

    @Override
    public Car createSUV(String name, int year, String color) {
        return new SUV("Toyota SUV " + name, year, color);
    }
}