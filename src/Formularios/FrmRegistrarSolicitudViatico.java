/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

import Clases.SolicitudViatico;
import Clases.Trabajador;
import Clases.Viatico;
import EstructuraDeDatos.*;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class FrmRegistrarSolicitudViatico extends javax.swing.JFrame {
    
        
    
    private DefaultTableModel dtm;
    private Object[] o=new Object[7];
    
    private ArregloSolicitudViatico arraySV=new ArregloSolicitudViatico(1);
     
    private SolicitudViatico sv1=new SolicitudViatico();
    
    
    
    /**
     * Creates new form frmRegistrarSolicitud
     */
    public FrmRegistrarSolicitudViatico() {
        initComponents();
        dtm= (DefaultTableModel) jTListado.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        tfBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListado = new javax.swing.JTable();
        TablaSV = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCodigoSolicitud = new javax.swing.JTextField();
        tfCodigoRemitente = new javax.swing.JTextField();
        tfFechaIda = new javax.swing.JTextField();
        tfFechaRetorno = new javax.swing.JTextField();
        tfMonto = new javax.swing.JTextField();
        cbxTipoViaje = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnLimpiarSolicitud = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Búsqueda:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/find.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pencil_add.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/to_do_list_cheked_all.png"))); // NOI18N
        btnEditar.setText("Editar");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnEliminar.setText("Eliminar");

        jTListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de Solicitud", "Codigo del remitente ", "Fecha de la Solicitud", "Tipo de viaje", "Fecha de Ida", "Fecha de Retorno", "Monto "
            }
        ));
        jTListado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTListadoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTListado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnNuevo)
                        .addComponent(btnEditar)
                        .addComponent(btnEliminar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jTabbedPane4.addTab("Listado de Solicitudes", jPanel1);

        TablaSV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Codigo de solicitud:");
        TablaSV.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel3.setText("Codigo de Remitente:");
        TablaSV.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel4.setText("Fecha de Ida:");
        TablaSV.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jLabel5.setText("Fecha de Retorno:");
        TablaSV.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jLabel6.setText("Tipo de Viaje:");
        TablaSV.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 80, -1));

        jLabel7.setText("Monto de Viatico:");
        TablaSV.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 100, -1));

        tfCodigoSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoSolicitudActionPerformed(evt);
            }
        });
        TablaSV.add(tfCodigoSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 120, -1));
        TablaSV.add(tfCodigoRemitente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 120, -1));
        TablaSV.add(tfFechaIda, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 120, -1));
        TablaSV.add(tfFechaRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 110, -1));
        TablaSV.add(tfMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 110, -1));

        cbxTipoViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "Nacional", "Internacional", " " }));
        TablaSV.add(cbxTipoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 120, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save_as.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        TablaSV.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 130, 40));

        btnLimpiarSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnLimpiarSolicitud.setText("Limpiar");
        btnLimpiarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSolicitudActionPerformed(evt);
            }
        });
        TablaSV.add(btnLimpiarSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, 40));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel8.setText("SOLICITUD DE VIATICO");
        TablaSV.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 410, -1));

        jLabel9.setText("Fecha de envio de la solicitud:");
        TablaSV.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        tfFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaActionPerformed(evt);
            }
        });
        TablaSV.add(tfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 120, -1));

        jTabbedPane4.addTab("Registro de Solicitud", TablaSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoSolicitudActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String codS=tfCodigoSolicitud.getText();
        String codRe=tfCodigoRemitente.getText();
        String fechaEnvio=tfFecha.getText();
        String fechaIda=tfFechaIda.getText();
        String tipoViaje=cbxTipoViaje.getSelectedItem().toString();
        String fechaRe=tfFechaRetorno.getText();
        Viatico monto=new Viatico();
        monto.setMontoViatico(Double.parseDouble(tfMonto.getText()));
       
        
        ArregloSolicitudViatico arreglo1=new ArregloSolicitudViatico(1);
        SolicitudViatico s1=new SolicitudViatico(codS, codRe, fechaEnvio, fechaIda, fechaRe,tipoViaje,monto);
        arreglo1.addSolicitudViatico(s1);
        
        o[0]=tfCodigoSolicitud.getText().trim();
        o[1]=tfCodigoRemitente.getText().trim();
        o[2]=tfFecha.getText();
        o[3]=cbxTipoViaje.getSelectedItem().toString();
        o[4]=tfFechaIda.getText();
        o[5]=tfFechaRetorno.getText().trim();
        o[6]=tfMonto.getText();
        dtm.addRow(o);
        
      
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTListadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTListadoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTListadoKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        JTable jTListado2=new JTable();
        
        for(int i=0; i<=dtm.getRowCount(); i++){
        if(tfBusqueda.equals(dtm.getValueAt(i, 0).toString())){
           for(int j=0; j<=dtm.getColumnCount(); j++){
           jTListado2.addColumn((TableColumn)dtm.getColumnName(j));
           }
           
            //dtm.getDataVector().elementAt(0).elementAt(6);
            
        }
      }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        

        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnLimpiarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSolicitudActionPerformed
        // TODO add your handling code here:
        //LIMPIAR
        Limpiar();
        
    }//GEN-LAST:event_btnLimpiarSolicitudActionPerformed

    private void tfFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaActionPerformed
private void Limpiar() {
        tfCodigoSolicitud.setText("");
        tfCodigoRemitente.setText("");
        tfFechaIda.setText("");
        tfFechaRetorno.setText("");
        tfMonto.setText("");
        tfFecha.setText("");
        cbxTipoViaje.setSelectedIndex(0);
    }
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
            java.util.logging.Logger.getLogger(FrmRegistrarSolicitudViatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarSolicitudViatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarSolicitudViatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarSolicitudViatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarSolicitudViatico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TablaSV;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiarSolicitud;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxTipoViaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListado;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JTextField tfCodigoRemitente;
    private javax.swing.JTextField tfCodigoSolicitud;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfFechaIda;
    private javax.swing.JTextField tfFechaRetorno;
    private javax.swing.JTextField tfMonto;
    // End of variables declaration//GEN-END:variables

    

    

    
}