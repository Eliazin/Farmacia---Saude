package Farmacia;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icone = new javax.swing.JLabel();
        painelAzul = new javax.swing.JPanel();
        usuarioLabel = new javax.swing.JLabel();
        Txt_Login = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        Txt_Senha = new javax.swing.JPasswordField();
        Btn_Login = new javax.swing.JButton();
        iconeMod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/teste.jpg"))); // NOI18N

        painelAzul.setBackground(new java.awt.Color(56, 182, 255));
        painelAzul.setPreferredSize(new java.awt.Dimension(359, 471));

        usuarioLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        usuarioLabel.setText("Usuario:");

        Txt_Login.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Txt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_LoginActionPerformed(evt);
            }
        });

        senhaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        senhaLabel.setText("Senha:");

        Txt_Senha.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Txt_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_SenhaActionPerformed(evt);
            }
        });

        Btn_Login.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        Btn_Login.setText("Login");
        Btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LoginActionPerformed(evt);
            }
        });

        iconeMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/FarmaBranco.png"))); // NOI18N

        javax.swing.GroupLayout painelAzulLayout = new javax.swing.GroupLayout(painelAzul);
        painelAzul.setLayout(painelAzulLayout);
        painelAzulLayout.setHorizontalGroup(
            painelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAzulLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuarioLabel)
                    .addComponent(senhaLabel)
                    .addComponent(Txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Login)
                    .addComponent(Txt_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAzulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconeMod)
                .addGap(46, 46, 46))
        );
        painelAzulLayout.setVerticalGroup(
            painelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAzulLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(iconeMod, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Btn_Login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(icone, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LoginActionPerformed
        if(Txt_Login.getText().equals("admin") &&Txt_Senha.getText().equals("12345")){
            JOptionPane.showMessageDialog(null,"Bem vindo Admin");

        }else{

            JOptionPane.showMessageDialog(null,"Senha Incorreta.");
        }
    }//GEN-LAST:event_Btn_LoginActionPerformed

    private void Txt_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_SenhaActionPerformed

    private void Txt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    Login login = new Login();
    login.setVisible(true);
    
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Login;
    private javax.swing.JTextField Txt_Login;
    private javax.swing.JPasswordField Txt_Senha;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel iconeMod;
    private javax.swing.JPanel painelAzul;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
