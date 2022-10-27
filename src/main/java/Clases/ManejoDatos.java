/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alema
 */
public class ManejoDatos {

    File file = new File("BasesDeDatos.json");
    

    public void guardarDatosBD(ArrayList<BD> bds) throws IOException {
        ObjectMapper om = new ObjectMapper();

        if (!file.isFile()) {
            om.writerWithDefaultPrettyPrinter().writeValue(new File("BasesDeDatos.json"), bds);

            System.out.println(bds.size());

        } else {
            om.writerWithDefaultPrettyPrinter().writeValue(file, bds);
        }

        for (int i = 0; i < bds.size(); i++) {
            System.out.println(i);

            System.out.println(bds.get(i));

        }

        JOptionPane.showMessageDialog(null, "Cambios Guardados!: " + bds.size());
        System.out.println("Datos Guardados.");
    }
    
    public boolean guardarDatosBD2(ArrayList<BD> bdTemp) throws IOException{
        ArrayList<BD> bds = bdTemp;
        
        String archivo = "BASESDEDATOS.DBS";
        try {
            FileOutputStream file = new FileOutputStream(archivo);
            ObjectOutputStream out = new ObjectOutputStream(file);
            
            out.writeObject(bds);
            
            out.close();
            file.close();
            
            System.out.println("Datos Guardados.");
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }

    public ArrayList<BD> leerDatosBD() throws IOException {
        ArrayList<BD> bds;
        File jsonFile = new File("BasesDeDatos.json");

        bds = new ObjectMapper().readerFor(ArrayList.class).readValue(jsonFile);
        ArrayList<BD> bdsTemporal = new ArrayList<>();
        
//        for (int i=0;i<bds.size();i++) {
//            
//            //bdsTemporal.add((BD)bds.get(i));
//            System.out.println(bds.get(i).getNombre());
//        }
        

        return bds;
    }
    
    public ArrayList<BD> leerDatosBD2() throws IOException, ClassNotFoundException{
        ArrayList<BD> bds = new ArrayList<BD>();
        
        String archivo = "BASESDEDATOS.DBS";
        try {
            FileInputStream file = new FileInputStream(archivo);
            ObjectInputStream in = new ObjectInputStream(file);
            
            bds = (ArrayList<BD>) in.readObject();
            
            in.close();
            file.close();
            
            System.out.println(bds.toString());
            System.out.println("Datos Leidos Correctamente");
            
         return bds;   
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoDatos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en metodo leerDatosBD2");
        }
        
        
        return bds;
        
        
    }
    
}
