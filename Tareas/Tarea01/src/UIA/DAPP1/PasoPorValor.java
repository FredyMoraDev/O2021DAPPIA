package UIA.DAPP1;

public class PasoPorValor {

    public static void main(String[] args) {

        int variable = 10;
        System.out.println(" Valor de la variable ANTES de llamar al metodo <incrementaVariable>: " + variable);

        System.out.println("\n Llamando al metodo <incrementaVariable> ...");
        incrementaVariable(variable);

        System.out.println("\n Valor de la variable DESPUES de llamar al metodo <incrementaVariable>:" + variable);
    }

    public static void incrementaVariable(int variable){
        variable += 10;
        System.out.println(" Valor de la variable llamando al metodo <incrementaVariable>:" + variable);
    }
}
