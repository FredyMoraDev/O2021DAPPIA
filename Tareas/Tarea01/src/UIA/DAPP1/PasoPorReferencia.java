package UIA.DAPP1;

public class PasoPorReferencia {

    public static void main(String[] args) {

        PasoPorReferencia objeto = new PasoPorReferencia("Objeto inicial");
        System.out.println(" Antes de modificar el objeto su valor es: " + objeto);

        PasoPorReferencia.cambiarObjeto(objeto);

        System.out.println("\n Nuevamente en main el objeto es: " + objeto);

        System.out.println("\n Cambiando sólo la variable ...");
        PasoPorReferencia.cambiarVariable(objeto);
        System.out.println("\n Valor de la variable : " + objeto);
    }

    
    public static void cambiarObjeto(PasoPorReferencia objeto) {
        objeto = new PasoPorReferencia("Nuevo valor para el Objeto");
        System.out.println("\n Luego de reasignar el Objeto: " + objeto);
    }

    public static void cambiarVariable(PasoPorReferencia objeto) {
        objeto.asignarVariable("Nuevo valor para la variable");
    }

   
	private String variable = new String();

	public String toString() {
		return "[Variable = " + this.obtenerVariable() + "]";
    }
    
	public String obtenerVariable() {
        return variable;
    }

	public PasoPorReferencia(String variable) {
        this.asignarVariable(variable);
    }

    public void asignarVariable(String variable) {
        this.variable = variable;
    }
}

