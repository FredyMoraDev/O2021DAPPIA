package UIA.DAPP1;

public class ReturnPrimitivo {

    public static void main(String[] args) {
        Auto Camry = new Auto(1994);

        Auto Toyota = Camry;
        System.out.println(Camry.modelo);  // Imprime 1994

        Toyota.modelo = 1995;
        System.out.println(Camry.modelo);  // Imprime 1995
        System.out.println(Toyota.modelo); // Imprime 1995
    }

    public static class Auto {
        public int modelo;
        public Auto(int m) { modelo = m; }
    }
}
