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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alema
 */
public class ManejoDatos {
        File file = new File("BasesDeDatos.json");
        
    
    public void guardarDatosBD(ArrayList<BD> bds) throws IOException {
        ObjectMapper om = new ObjectMapper();
        
        
        if(!file.isFile()){
            om.writerWithDefaultPrettyPrinter().writeValue(new File("BasesDeDatos.json"), bds);
           
            System.out.println(bds.size());
            
            
                
            
            
        }else
        om.writerWithDefaultPrettyPrinter().writeValue(file, bds);    
        String bd1="";
        for(int i=0;i<bds.size();i++){
                System.out.println(i);
                
                System.out.println(bds.get(i));
                bd1 = i+"|"+bds.get(i).getNombre()+"|"+bds.get(i).getDescripcion();
            }
        guardatTxt("BASESDEDATOS.DBS",bd1,true);
        
        JOptionPane.showMessageDialog(null,"Cambios Guardados!: " + bds.size());
        System.out.println("Datos Guardados.");
    }

    public ArrayList<BD> leerDatosBD() throws IOException,JsonProcessingException {
        ArrayList<BD> bds;
        File jsonFile = new File("BasesDeDatos.json");

        bds = new ObjectMapper().readerFor(ArrayList.class).readValue(jsonFile);
        //bds = ObjectMapper.readValue(jsonFile, new TypeReference<ArrayList<BD>>(){});
        

        return bds;
    }
    
    public static void guardatTxt(String nombreArch,String texto,boolean agregar) throws IOException{
        File archivo = new File(nombreArch);
        FileWriter fw = new FileWriter(archivo,agregar);
        
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(texto);
        pw.close();
        
    }
}
