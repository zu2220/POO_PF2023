package vista;

import clases.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrmMenu extends javax.swing.JFrame {
    private Usuario user;

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public FrmMenu(Usuario user) {
        this.user = user;
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //Habilitar o Deshabilitar opciones
        if(user.getRol().equals("ASISTENTE"))
        {this.jMenu4.setEnabled(false);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuUsuario = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Mantenimiento");

        jMenu6.setText("Clientes");
        jMenu2.add(jMenu6);

        jMenuItem1.setText("Tipo de prestamo");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Procesos");

        jMenu7.setText("Prestamo");
        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        jMenuItem2.setText("Consolidado de Prestamos Otorgados");
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Seguridad");

        mnuUsuario.setText("Usuarios");
        mnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuarioActionPerformed(evt);
            }
        });
        jMenu5.add(mnuUsuario);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        setBounds(0, 0, 553, 418);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuarioActionPerformed
     
        new FrmMttoUsuario().setVisible(true);
    }//GEN-LAST:event_mnuUsuarioActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mnuUsuario;
    // End of variables declaration//GEN-END:variables
}
