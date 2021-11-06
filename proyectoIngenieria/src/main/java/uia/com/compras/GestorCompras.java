package uia.com.compras;
import com.google.gson.Gson;

import uia.com.compras.ListaReportesNivelStock;


import java.io.*;
import java.lang.reflect.Type;
import java.util.Properties;

public class GestorCompras {
    private int opcion;
    private ListaReportesNivelStock miReporteNS;

    public GestorCompras(){
        Gson gson = new Gson();
        String fichero = "";

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\216577\\comprasarregloItemsV1.json"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    InfoComprasUIA infoComprasUia = gson.fromJson(fichero,InfoComprasUIA.class);
    System.out.println(infoComprasUia);
    }
}
