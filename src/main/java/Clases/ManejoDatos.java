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
    
    public void guardarDatosBD(ArrayList bd) throws IOException{
        ObjectMapper om = new ObjectMapper();
        
        om.writerWithDefaultPrettyPrinter().writeValue(new File("BasesDeDatos.json"),bd);
        
        System.out.println("");
    }
    
    public ArrayList<BaseDatos> leerDatosBD() throws IOException{
        ArrayList<BaseDatos> bds = new ArrayList<>();
        
        bds = new ObjectMapper().readerFor(ArrayList.class).readValue("BaseDatos.json");
        
    return bds;
    }
}
