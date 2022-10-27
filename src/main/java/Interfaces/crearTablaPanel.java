/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.BD;
import Clases.Campo;
import Clases.ManejoDatos;
import Clases.Tabla;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

    

public class crearTablaPanel extends javax.swing.JPanel {

    ManejoDatos md = new ManejoDatos();
    ArrayList<BD> bds = new ArrayList<>();
    int ind;
    public crearTablaPanel(int indexBD) throws IOException {
        initComponents();
        ind=indexBD;
        try {
            bds = md.leerDatosBD2();
//            String nombre="",desc="";
//            int campos;
//            Tabla tabla = new Tabla();
//            if((!tablaNombreTF.getText().isEmpty())&&(!tablaCamposTF.getText().isEmpty())){
//                nombre = tablaNombreTF.getText();
//                desc = tablaDescTF.getText();
//                campos = Integer.parseInt(tablaCamposTF.getText());
//                
//                for(int i = 1;i<=campos;i++){
//                    Campo campo = new Campo();
//                    tabla.addCampo(campo);
//                    
//                }System.out.println("Campos Agregados.");
//                
//            }
//            tabla.setNombre(nombre);
//            tabla.setDescripcion(desc);
//            
//            bds.get(indexBD).addTablas(tabla);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(crearTablaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tablaNombreTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tablaCamposTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDescTF = new javax.swing.JTextArea();
        btnCrearTabla = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(503, 364));

        jLabel1.setText("Crear Tabla");

        jLabel2.setText("Nombre");

        jLabel5.setText("Descripción");

        jLabel3.setText("Número de Campos");

        tablaDescTF.setColumns(20);
        tablaDescTF.setRows(5);
        jScrollPane1.setViewportView(tablaDescTF);

        btnCrearTabla.setText("Crear");
        btnCrearTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnCrearTabla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tablaCamposTF, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tablaNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(tablaNombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tablaCamposTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnCrearTabla)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTablaActionPerformed
        
        String nombre="",desc="";
            int campos;
            Tabla tabla = new Tabla();
            if((!tablaNombreTF.getText().isEmpty())&&(!tablaCamposTF.getText().isEmpty())){
                nombre = tablaNombreTF.getText();
                desc = tablaDescTF.getText();
                campos = Integer.parseInt(tablaCamposTF.getText());
                
                for(int i = 1;i<=campos;i++){
                    Campo campo = new Campo();
                    tabla.addCampo(campo);
                    
                }System.out.println("Campos Agregados.");
                
            }
            tabla.setNombre(nombre);
            tabla.setDescripcion(desc);
            
            bds.get(ind).addTablas(tabla);
            
        try {
            md.guardarDatosBD2(bds);
            System.out.println("Tabla Guardada");
            tablaNombreTF.setText("");
            tablaDescTF.setText("");
            tablaCamposTF.setText("");
            JOptionPane.showMessageDialog(null,"Tabla Guardada");
                   
        } catch (IOException ex) {
            Logger.getLogger(crearTablaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btnCrearTablaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tablaCamposTF;
    private javax.swing.JTextArea tablaDescTF;
    private javax.swing.JTextField tablaNombreTF;
    // End of variables declaration//GEN-END:variables
}
