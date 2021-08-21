package UIA.DAPP1;

public class ReturnObjeto {

    public static void main(String args[]) {
        regresaObjeto obj_1 = new regresaObjeto(10);
        regresaObjeto obj_2;

        obj_2 = obj_1.incrementar();

        System.out.println("Objeto 1: " + obj_1.a);
        System.out.println("Objeto 2: " + obj_2.a);
    }
}

class regresaObjeto {
    int a;

    regresaObjeto(int i)
    {
        a = i;
    }

    regresaObjeto incrementar(){
        regresaObjeto tmp = new regresaObjeto(a+10);
        return tmp;
    }
}