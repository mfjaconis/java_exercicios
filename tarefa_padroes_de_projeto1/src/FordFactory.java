public class FordFactory implements CarFactory {
    @Override
    public Car createSedan(String name, int year, String color) {
        return new Sedan("Ford Sedan " + name, year, color);
    }

    @Override
    public Car createSUV(String name, int year, String color) {
        return new SUV("Ford SUV " + name, year, color);
    }
}
