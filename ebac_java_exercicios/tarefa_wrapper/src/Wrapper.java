public class Wrapper {

    public static void main(String[] args) {
        // Imprimindo os valores
        System.out.println(getNum1());
        System.out.println(getNum2());
    }

    // Variável do tipo Primitivo
    private static int num1 = 10;

    // Variável do tipo Wrapper
    private static Integer num2 = 20;

    // Casting implícito
    private static int numInt1 = 25;
    private static long numLongo1 = numInt1;

    // Casting explícito
    private static long numLongo2 = 52525151L;
    private static int numInt2 = (int) numLongo2;

    public static int getNum1() {
        return num1;
    }

    public static Integer getNum2() {
        return num2;
    }
}
