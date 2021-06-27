/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3a2;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form ventana1
     */
    public ventana1() {
        initComponents();
        initComponents();
        setTitle("Sistema de Nomina UnADM"); //Nombre que se va a desplegar en la parte superior
        this.setVisible(true); //La visualización de la ventana es verdadero, caso contrario no se muestra
        this.setLocationRelativeTo(null); // Localización en pantalla en nulo para que me de el centro
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Al cerrar la ventana se termina la ejecución del proceso
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelImagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TextoFormulario = new javax.swing.JLabel();
        PanelFormulario = new javax.swing.JPanel();
        TextoNombreEmpleado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TextoFormulario1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        cajanombre1 = new javax.swing.JTextField();
        cajanum1 = new javax.swing.JTextField();
        cajarfc1 = new javax.swing.JTextField();
        PanelBusqueda = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Caja1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo3a2/Imagenes Proyecto/recibos-nomina-timbrados.jpg"))); // NOI18N
        jLabel2.setText("IMAGn");

        TextoFormulario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TextoFormulario.setText("Formulario");

        javax.swing.GroupLayout PanelImagenLayout = new javax.swing.GroupLayout(PanelImagen);
        PanelImagen.setLayout(PanelImagenLayout);
        PanelImagenLayout.setHorizontalGroup(
            PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImagenLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextoFormulario)
                .addGap(523, 523, 523))
        );
        PanelImagenLayout.setVerticalGroup(
            PanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(TextoFormulario))
        );

        getContentPane().add(PanelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1090, 170));

        TextoNombreEmpleado.setText("Nombre del Empleado:");

        jLabel3.setText("RFC:");

        jLabel4.setText("Número de Empleado: ");

        jButton1.setText("Crear Archivo a partir de Formulario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear Nuevo Archivo ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Renombrar Archivo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar Archivo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TextoFormulario1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TextoFormulario1.setText("Opciones Adicionales");

        jButton5.setText("Sobre Escribir Archivo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFormularioLayout = new javax.swing.GroupLayout(PanelFormulario);
        PanelFormulario.setLayout(PanelFormularioLayout);
        PanelFormularioLayout.setHorizontalGroup(
            PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormularioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(PanelFormularioLayout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextoNombreEmpleado)
                            .addComponent(jLabel4))
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(PanelFormularioLayout.createSequentialGroup()
                        .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFormularioLayout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextoFormulario1)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(PanelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajanombre1)
                    .addComponent(cajanum1)
                    .addComponent(cajarfc1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelFormularioLayout.setVerticalGroup(
            PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormularioLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNombreEmpleado)
                    .addComponent(cajanombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajanum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajarfc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(TextoFormulario1)
                .addGap(18, 18, 18)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        getContentPane().add(PanelFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 550, 600));

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Titulo.setText("Búsqueda de Nómina por Documento");

        Caja1.setColumns(20);
        Caja1.setRows(5);
        Caja1.setEnabled(false);
        jScrollPane1.setViewportView(Caja1);

        jLabel1.setText("Presione el botón para abrir un documento");

        boton1.setText("Buscar Archivo extensión .txt");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBusquedaLayout = new javax.swing.GroupLayout(PanelBusqueda);
        PanelBusqueda.setLayout(PanelBusquedaLayout);
        PanelBusquedaLayout.setHorizontalGroup(
            PanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusquedaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PanelBusquedaLayout.createSequentialGroup()
                        .addComponent(Titulo)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(PanelBusquedaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton1)))
                .addContainerGap())
        );
        PanelBusquedaLayout.setVerticalGroup(
            PanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(PanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(PanelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 510, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // Aquí está la lógica de boton 1 (Abrir Archivo)
        JFileChooser fc = new JFileChooser(); //Iniciamos  el objeto que permite seleccionar la ruta del archivo
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile(); // archivo vale el documento que selecciona el usuario
        try{
            FileReader fr = new FileReader(archivo);// Declaro fr como una variable y se le pasa el parametro de lo que contiene archivo
            BufferedReader br = new BufferedReader (fr);//La variable br almacena la variable presentada en memoria
            String texto = ""; //texto es una cadena vacia
            String linea =""; //linea es una cadena vacia
            while(((linea=br.readLine())!=null)){ //mientras linea tenga un valor diferente a nulo
                texto += linea+ " \n"; //Agrega texto e imprime un salto de linea
            }
            Caja1.setText(texto);
            JOptionPane.showMessageDialog(null, "El archivo se abrió con éxito"); // si se abre el archivo muestra mensaje en pantalla
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Se produjo un error inesperado");// Se produjo una excepcion
            System.out.println("Error01");
        }
        
        
    }//GEN-LAST:event_boton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Botón crear nuevo archivo
        CrearArchivo o1 = new CrearArchivo();
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Botón Renombrar Archivo
        RenombrarArchivo objeto1 = new RenombrarArchivo();
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Botón Crear Archivo        
                JFileChooser crear_archivo = new JFileChooser(); //Iniciamos un objeto crear archivo que contenga JFileChooser
                crear_archivo.setApproveButtonText("Guardar");//mismo proceso para abrir JFilechooser
                crear_archivo.showSaveDialog(null);
                File archivo = new File (crear_archivo.getSelectedFile()+".txt");
                FileWriter ubicacion=null;
        
        try{
                   BufferedWriter salida = new BufferedWriter (new FileWriter(archivo));
                   JOptionPane.showMessageDialog(null, "El archivo se creo con éxito");
                   salida.write("Texto creado a partir de formulario: \n");
                   salida.newLine();
                   salida.write("Nombre del empleado: " + cajanombre1.getText()); // concateno nombre del empleeado con el valor del texto de caja1
                  
                   salida.newLine();
                   salida.write("Número de empleado " + cajanum1.getText());
                  
                   salida.newLine();
                   salida.write("El RFC de empleado es: " + cajarfc1.getText());
                   
                   salida.close();
           
                
           
        }catch(Exception Error1){
            System.out.println("error1");
            JOptionPane.showMessageDialog(null, "Se produjo un error inesperado");
                 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Botón eliminar
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea borrar un archivo, esta opcion no se puede deshacer?"); //variable respúesta almacena seleccipn de ususarip
        if(respuesta == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "Por favor seleccione el archivo a borrar");
         JFileChooser fc=new JFileChooser();
         fc.showOpenDialog(null);
         File archivo = fc.getSelectedFile();
         if (archivo.delete()){
              JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
         } else{
             JOptionPane.showMessageDialog(null, "El fichero no puede ser borrado");
         }  
         
         
         if(respuesta == JOptionPane.NO_OPTION){//si respuesta es no, no pasa nada
             JOptionPane.showMessageDialog(null, "No se realizaron modificaciones");
         }
         
         
    }
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Botón Sobre escribir archivo
    
        SobreescribirArchivo objeto1 = new SobreescribirArchivo();
        
        
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
            }
        });
    }
    //Al usar netbeans para crear interfaces, no permite modificar este código, aunque ahorra tiempo podría ser no muy efectivo al elaborar interfaces gráficas
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Caja1;
    private javax.swing.JPanel PanelBusqueda;
    private javax.swing.JPanel PanelFormulario;
    private javax.swing.JPanel PanelImagen;
    private javax.swing.JLabel TextoFormulario;
    private javax.swing.JLabel TextoFormulario1;
    private javax.swing.JLabel TextoNombreEmpleado;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton boton1;
    private javax.swing.JTextField cajanombre1;
    private javax.swing.JTextField cajanum1;
    private javax.swing.JTextField cajarfc1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
