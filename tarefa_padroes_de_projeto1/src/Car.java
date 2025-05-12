public abstract class Car {
    private String name;
    private int year;
    private String color;

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void createdCar() {
        System.out.println();
        System.out.println("Criando o carro...");
        System.out.println("Nome: " + getName() + " Cor: " + getColor() + " Ano: " + getYear());
        System.out.println("Carro criado com sucesso!");
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();
    }

}
