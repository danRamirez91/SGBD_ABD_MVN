/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author alema
 */
public class ManejoDatos {

    public void guardarDatosBD(ArrayList bd) throws IOException {
        ObjectMapper om = new ObjectMapper();

        om.writerWithDefaultPrettyPrinter().writeValue(new File("BasesDeDatos.json"), bd);

        System.out.println("");
    }

    public ArrayList<BD> leerDatosBD() throws IOException {
        ArrayList<BD> bds = new ArrayList<>();
        File jsonFile = new File("BasesDeDatos.json");

        bds = new ObjectMapper().readerFor(BD.class).readValue("BasesDeDatos.json");

        return bds;
    }
}
