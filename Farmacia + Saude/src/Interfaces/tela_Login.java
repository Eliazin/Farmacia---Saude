package Interfaces;

import Interfaces_adm.tela_Menu;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class tela_Login extends javax.swing.JFrame {
    
    cadastro_Clientes cadastro = new cadastro_Clientes();
    tela_Menu menu = new tela_Menu();
    
    public tela_Login() {
        initComponents();
    }
    
    String login, senha;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBranco = new javax.swing.JPanel();
        icone = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        usuarioInput = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        senhaInput = new javax.swing.JPasswordField();
        painelBrancoButoes = new javax.swing.JPanel();
        cadastroButton = new javax.swing.JButton();
        entrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farmacia_Logo.png"))); // NOI18N

        usuarioLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        usuarioLabel.setText("Usuario:");

        usuarioInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        usuarioInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioInputActionPerformed(evt);
            }
        });

        senhaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        senhaLabel.setText("Senha:");

        senhaInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        painelBrancoButoes.setBackground(new java.awt.Color(255, 255, 255));

        cadastroButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cadastroButton.setText("Cadastre - se");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });

        entrarButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBrancoButoesLayout = new javax.swing.GroupLayout(painelBrancoButoes);
        painelBrancoButoes.setLayout(painelBrancoButoesLayout);
        painelBrancoButoesLayout.setHorizontalGroup(
            painelBrancoButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoButoesLayout.createSequentialGroup()
                .addComponent(cadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelBrancoButoesLayout.setVerticalGroup(
            painelBrancoButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoButoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBrancoButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroButton)
                    .addComponent(entrarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBrancoLayout.createSequentialGroup()
                        .addComponent(icone)
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBrancoLayout.createSequentialGroup()
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuarioLabel)
                            .addComponent(usuarioInput, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(senhaInput)
                            .addComponent(painelBrancoButoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(195, 195, 195))))
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(icone)
                .addGap(39, 39, 39)
                .addComponent(usuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelBrancoButoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
       
       login = usuarioInput.getText();
       senha = senhaInput.getText();
       
       switch(login) {
           
           case "roberto":
               
               if(senha.equals("1234")) {
                   JOptionPane.showMessageDialog(null, login + ", seja bem vindo à Farmácia + Saúde!");
               } else {
                   JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos!!");
               }break;
               
           case "admin":
               
               if(senha.equals("admin")) {
                   this.dispose(); menu.setVisible(true);
               } else {
                   JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos!!");
               }break;
               
           default:
               
               JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos."); break;
       }
       
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        cadastro.setVisible(true);
    }//GEN-LAST:event_cadastroButtonActionPerformed

    private void usuarioInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioInputActionPerformed

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
            java.util.logging.Logger.getLogger(tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tela_Login telaLogin = new tela_Login();
                telaLogin.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel icone;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelBrancoButoes;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JTextField usuarioInput;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
