public interface CarFactory {
    Car createSedan(String name, int year, String color);

    Car createSUV(String name, int year, String color);
}