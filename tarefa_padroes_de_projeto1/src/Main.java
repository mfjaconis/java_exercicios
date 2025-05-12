public class Main {
    public static void main(String[] args) {
        // Fábrica da Toyota
        CarFactory toyotaFactory = new ToyotaFactory();
        Car toyotaSedan = toyotaFactory.createSedan("Corolla", 2025, "Branco");
        Car toyotaSUV = toyotaFactory.createSUV("RAV4", 2025, "Preta");

        toyotaSedan.createdCar();
        toyotaSUV.createdCar();

        // Fábrica da Ford
        CarFactory fordFactory = new FordFactory();
        Car fordSedan = fordFactory.createSedan("Focus", 2025, "Azul");
        Car fordSUV = fordFactory.createSUV("Edge", 2025, "Vermelho");

        fordSedan.createdCar();
        fordSUV.createdCar();
    }
}
