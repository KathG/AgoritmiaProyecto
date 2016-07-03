
package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;


public class InicioSesion extends javax.swing.JFrame {

    public InicioSesion() {
        initComponents();
        PanelPrincipal Pp=new PanelPrincipal(); 
        this.add(Pp,BorderLayout.CENTER);
        this.pack();
        
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ingreso");
        
        Image icon=Toolkit.getDefaultToolkit().getImage("/Imagenes/UCSM.png");
        this.setIconImage(icon);
        
    }

    @SuppressWarnings("unchecked")
    //nombres de etiquetas en el disenio
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdmin = new javax.swing.JButton();
        btnalumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdmin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnalumno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnalumno.setText("Alumno");
        btnalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        Admin_In objAdmin=new Admin_In();
        objAdmin.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalumnoActionPerformed
        Alumno_In objAlumno=new Alumno_In();
        objAlumno.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnalumnoActionPerformed
    
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnalumno;
    // End of variables declaration//GEN-END:variables
}
