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
        File file = new File("BasesDeDatos.json");
        
    
    public void guardarDatosBD(ArrayList bd) throws IOException {
        ObjectMapper om = new ObjectMapper();
        
        
        if(!file.isFile()){
            om.writerWithDefaultPrettyPrinter().writeValue(new File("BasesDeDatos.json"), bd);
        }else
        om.writerWithDefaultPrettyPrinter().writeValue(file, bd);    
        

        System.out.println("");
    }

    public ArrayList<BD> leerDatosBD() throws IOException {
        ArrayList<BD> bds;
        File jsonFile = new File("BasesDeDatos.json");

        bds = new ObjectMapper().readerFor(ArrayList.class).readValue(jsonFile);

        return bds;
    }
}
