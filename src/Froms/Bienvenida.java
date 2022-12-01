
package Froms;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Controller.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Bienvenida extends javax.swing.JFrame {
private Conexion cx;
    
    public Bienvenida() {
        this.setContentPane(new FondoPanel());
        cx = new Conexion ();
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnopen1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnopen2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnopen3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnopen4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido ");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 24))); // NOI18N

        jLabel2.setText("Registro de peces:");

        btnopen1.setText("Registrar");
        btnopen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopen1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Precauciones del dia");

        btnopen2.setText("Open");
        btnopen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopen2ActionPerformed(evt);
            }
        });

        jLabel5.setText("peces en via de extincion: ");

        btnopen3.setText("Open");
        btnopen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopen3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Registrar barco");

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Simular Pesca");

        btnopen4.setText("Open");
        btnopen4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopen4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Peces totales");

        jLabel8.setText("Barcos registrados");

        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Open");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Pdf barcos");

        jButton3.setText("Create");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Pdf peces");

        jButton4.setText("Create");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnopen3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(btnregistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnopen4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnopen1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnopen2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnopen1)
                            .addComponent(jLabel7)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnopen2)
                            .addComponent(jLabel8)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btnopen3)
                            .addComponent(jLabel9)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnregistrar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jButton4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnopen4))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnopen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopen2ActionPerformed
        // TODO add your handling code here:
        String kl=JOptionPane.showInputDialog("Tipo de clima y estaciones "+"\n"+"Soleado (1)."+"\n"+"Lluvioso (2)."+"\n"+"Nublado (3)."
        +"\n"+"Invierno (4)."+"\n"+"Verano (5).");
        switch (kl){
            case "1":
                JOptionPane.showMessageDialog(null, "Para el día soleado se recomienda llevar y aplicar bloqueador antes de ingresar a pescar, también tener equipados flotadores y equipo de pesca"+"\n"+"Peces prohibidos: "+"\n"+cx.mostrarpecespeligro());
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "No es posible la entrada a la pesca"+"\n"+"Peces prohibidos: "+"\n"+cx.mostrarpecespeligro());
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Se recomienda estar atento, ya que si empieza a llover debe salir inmediatamente del agua, uso del salvavidas permanentemente mientes entre en el agua"+"\n"+"Peces prohibidos: "+"\n"+cx.mostrarpecespeligro());
                    break;
            case "4":
                JOptionPane.showMessageDialog(null, "No está permitió salir al público, totalmente negado.");
                break;
            case "5":
                JOptionPane.showMessageDialog(null, "Recomendaciones, bloqueado solar, paraguas, flotadores, radar de señal ya que en esta estaciones del año se tiende a perder mucho la señal "+"\n"+"Peces prohibidos: "+"\n"+cx.mostrarpecespeligro());
                break;
            default:
        }
    }//GEN-LAST:event_btnopen2ActionPerformed

    private void btnopen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopen1ActionPerformed
        // TODO add your handling code here:
        String v=JOptionPane.showInputDialog("Nombre del pez: ");
        String c=JOptionPane.showInputDialog("Codigo del pez: ");
        String e=JOptionPane.showInputDialog("Estado del pez "+"\n"+"Normal (1)"+"\n"+"Advertencia (2) "+"\n"+"Via de extincion (3):");
        switch (e){
            case "1":
                String ca=JOptionPane.showInputDialog("Cantidad que pueden ser pescados por embarcacion: ");
                cx.registrarpeces(v, c, Integer.parseInt(ca), e);
                break;
            case "2":
                cx.registrarpeces(v, c,10, e);
                break;
            case "3":
                cx.registrarpeces(v, c,0, e);
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR");
        }
    }//GEN-LAST:event_btnopen1ActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
       cx.registrarbarco(JOptionPane.showInputDialog("Propietario del barco: "), JOptionPane.showInputDialog("Codigo del barco: "),0);
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, cx.mostrarpeces());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, cx.mostrarbarcos());
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnopen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopen3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, cx.mostrarpecespeligro());
    }//GEN-LAST:event_btnopen3ActionPerformed

    private void btnopen4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopen4ActionPerformed
        // TODO add your handling code here:
        int multas=0;
        String ji=JOptionPane.showInputDialog("Tipo de clima "+"\n"+"Soleado (1)."+"\n"+"Lluvioso (2)."+"\n"+"Nublado (3)."
        +"\n"+"Invierno (4)."+"\n"+"Verano (5).");
        switch(ji){
            case "1":
        {
            try {
                multas=0;
                JOptionPane.showMessageDialog(null, "1. No alimentar a los animales\n" +
"2. Si obtiene otra animal que no sea un pez, devolverlo al aguan inmediatamente \n" +
"3. Rocas, fósiles, y corales reportarlos ante el personal autorizado \n" +
"4. No llevar entes de contaminación como: plásticos, vidrios, cartón si es necesario llevar algún tipo de alimento guardo en este tipo de cosas, por favor no botarlo en el mar, llevar a casa");
                java.sql.ResultSet rx=cx.buscarbajos(Integer.parseInt(JOptionPane.showInputDialog("Codigo barco: ")));
                if(rx.next()){
                    int mk=Integer.parseInt(rx.getString(3));
                    if(mk<=10){
                  int a=Integer.parseInt(JOptionPane.showInputDialog("Peces pescados: "));                   
                    for(int i=1;i<=a;i++){
                     java.sql.ResultSet rxx=cx.buscarpeces(JOptionPane.showInputDialog("Codigo del pez: "));
                     if(rxx.next()){
                            String gh=rxx.getString(4);        
                         if(gh.equals("3")){
                             JOptionPane.showMessageDialog(null, "Pez Ilegal Pesca");
                             multas++;
                         }else{
                            int jss=Integer.parseInt(JOptionPane.showInputDialog("Peces pescados: "));
                            if(rxx.getInt(3)<=jss){
                                JOptionPane.showMessageDialog(null, "cantidad ilegal Pesca");
                                multas++;
                            }else{
                                 JOptionPane.showMessageDialog(null, "Buena Pesca");
                            }
                         }
                     }
                               
                    }
                    int ko=rx.getInt(3);
                    int totalm=ko+multas;
                    if(multas>=1){
                    cx.buscarbarcosmul(rx.getString(1), rx.getString(2),totalm);
                    }
                   //cx.modificar(rx.getString(1), rx.getString(2), totalm);
                    }else{
                        JOptionPane.showMessageDialog(null, "Esta barco tiene muchas multas para pescar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Barco no existe");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Bienvenida.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Esta prohibido pescar con este clima...ESPERE POR FAVOR!");
                break;
            case "3":
                {
            try {
                multas=0;
                JOptionPane.showMessageDialog(null, "1. No alimentar a los animales\n" +
"2. Si obtiene otra animal que no sea un pez, devolverlo al aguan inmediatamente \n" +
"3. Rocas, fósiles, y corales reportarlos ante el personal autorizado \n" +
"4. No llevar entes de contaminación como: plásticos, vidrios, cartón si es necesario llevar algún tipo de alimento guardo en este tipo de cosas, por favor no botarlo en el mar, llevar a casa");
                java.sql.ResultSet rx=cx.buscarbajos(Integer.parseInt(JOptionPane.showInputDialog("Codigo barco: ")));
                if(rx.next()){
                    int mk=Integer.parseInt(rx.getString(3));
                    if(mk<=10){
                  int a=Integer.parseInt(JOptionPane.showInputDialog("Peces pescados: "));                   
                    for(int i=1;i<=a;i++){
                     java.sql.ResultSet rxx=cx.buscarpeces(JOptionPane.showInputDialog("Codigo del pez: "));
                     if(rxx.next()){
                            String gh=rxx.getString(4);        
                         if(gh.equals("3")){
                             JOptionPane.showMessageDialog(null, "Pez Ilegal Pesca");
                             multas++;
                         }else{
                            int jss=Integer.parseInt(JOptionPane.showInputDialog("Peces pescados: "));
                            if(rxx.getInt(3)<=jss){
                                JOptionPane.showMessageDialog(null, "cantidad ilegal Pesca");
                                multas++;
                            }else{
                                 JOptionPane.showMessageDialog(null, "Buena Pesca");
                            }
                         }
                     }
                               
                    }
                    int ko=rx.getInt(3);
                    int totalm=ko+multas;
                   if(multas>=1){
                    cx.buscarbarcosmul(rx.getString(1), rx.getString(2),totalm);
                    }
                   //cx.modificar(rx.getString(1), rx.getString(2), totalm);
                    }else{
                        JOptionPane.showMessageDialog(null, "Esta barco tiene muchas multas para pescar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Barco no existe");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Bienvenida.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "No se puede salir esta temporada");
                break;
            case "5":
                {
            try {
                multas=0;
                JOptionPane.showMessageDialog(null, "1. No alimentar a los animales\n" +
"2. Si obtiene otra animal que no sea un pez, devolverlo al aguan inmediatamente \n" +
"3. Rocas, fósiles, y corales reportarlos ante el personal autorizado \n" +
"4. No llevar entes de contaminación como: plásticos, vidrios, cartón si es necesario llevar algún tipo de alimento guardo en este tipo de cosas, por favor no botarlo en el mar, llevar a casa");
                java.sql.ResultSet rx=cx.buscarbajos(Integer.parseInt(JOptionPane.showInputDialog("Codigo barco: ")));
                if(rx.next()){
                    int mk=Integer.parseInt(rx.getString(3));
                    if(mk<=10){
                  int a=Integer.parseInt(JOptionPane.showInputDialog("Peces pescados: "));                   
                    for(int i=1;i<=a;i++){
                     java.sql.ResultSet rxx=cx.buscarpeces(JOptionPane.showInputDialog("Codigo del pez: "));
                     if(rxx.next()){
                            String gh=rxx.getString(4);        
                         if(gh.equals("3")){
                             JOptionPane.showMessageDialog(null, "Pez Ilegal Pesca");
                             multas++;
                         }else{
                            int jss=Integer.parseInt(JOptionPane.showInputDialog("Peces pescados: "));
                            if(rxx.getInt(3)<=jss){
                                JOptionPane.showMessageDialog(null, "cantidad ilegal Pesca");
                                multas++;
                            }else{
                                 JOptionPane.showMessageDialog(null, "Buena Pesca");
                            }
                         }
                     }
                               
                    }
                    int ko=rx.getInt(3);
                    int totalm=ko+multas;
                    if(multas>=1){
                    cx.buscarbarcosmul(rx.getString(1), rx.getString(2),totalm);
                    }
                   //cx.modificar(rx.getString(1), rx.getString(2), totalm);
                    }else{
                        JOptionPane.showMessageDialog(null, "Esta barco tiene muchas multas para pescar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Barco no existe");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Bienvenida.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR");
        }
              
    }//GEN-LAST:event_btnopen4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cx.GenerarPDF();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cx.GenerarPDF2();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnopen1;
    private javax.swing.JButton btnopen2;
    private javax.swing.JButton btnopen3;
    private javax.swing.JButton btnopen4;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }

    }






}
