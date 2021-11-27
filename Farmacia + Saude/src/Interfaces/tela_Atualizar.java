package Interfaces;

import Banco_de_dados.mySql;
import Objetos.Cliente;
import javax.swing.JOptionPane;

public class tela_Atualizar extends javax.swing.JFrame {

    mySql conectar = new mySql();
    Cliente cliente = new Cliente();
    
    public void atualizarCliente(Cliente cliente){
        this.conectar.conectaBanco();
        
        String consultaCpf = this.cpfInput.getText();
        
        try {
            this.conectar.updateSQL(
                "UPDATE clientes SET "                    
                    + "nome = '" + nomeInput.getText() + "',"
                    + "senha = '" + senhaInput.getText() + "',"
                    + "nomeuser = '" + nomeUserInput.getText() + "',"
                    + "email = '" + emailInput.getText() + "',"
                    + "celular = '" + celularInput.getText() + "',"
                    + "rua = '" + ruaInput.getText() + "',"
                    + "bairro = '" + bairroInput.getText() + "',"
                    + "numero = '" + numeroInput.getText() + "',"
                    + "cep = '" + cepInput.getText() + "'"
                + " WHERE "
                    + "cpf = '" + consultaCpf + "'"
                + ";"
            );
        }catch(Exception e){
            System.out.println("Erro ao atualizar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente");
        }finally{
            this.conectar.fechaBanco();
            limparCampos();
            cliente.limpaCliente();
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso");
        }
    }
    
    public boolean checkCampoVazio () {
        boolean campoVazio = true;
        
        if (this.nomeUserInput.getText().equals("") || 
            this.nomeInput.getText().equals("") || this.senhaInput.getText().equals("")){
            campoVazio = false;
        }
        
        return campoVazio;
    }
    
    private void limparCampos(){
        cpfInput.setText("");
        nomeUserInput.setText("");
        senhaInput.setText("");
        nomeInput.setText("");
        emailInput.setText("");
        celularInput.setText("");
        ruaInput.setText("");
        numeroInput.setText("");
        bairroInput.setText("");
        cepInput.setText("");
    }
    
    public tela_Atualizar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBranco = new javax.swing.JPanel();
        cpfLabel = new javax.swing.JLabel();
        cpfInput = new javax.swing.JFormattedTextField();
        dadosPainel2 = new javax.swing.JPanel();
        nomeUserLabel2 = new javax.swing.JLabel();
        nomeUserInput = new javax.swing.JTextField();
        nomeLabel2 = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        senhaInput = new javax.swing.JTextField();
        emailLabel2 = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        celularLabel2 = new javax.swing.JLabel();
        celularInput = new javax.swing.JFormattedTextField();
        ruaLabel2 = new javax.swing.JLabel();
        ruaInput = new javax.swing.JTextField();
        bairroLabel2 = new javax.swing.JLabel();
        bairroInput = new javax.swing.JTextField();
        numeroLabel2 = new javax.swing.JLabel();
        numeroInput = new javax.swing.JTextField();
        cepLabel2 = new javax.swing.JLabel();
        cepInput = new javax.swing.JFormattedTextField();
        atualizarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();

        setTitle("ATUALIZAR CLIENTE");

        panelBranco.setBackground(new java.awt.Color(255, 255, 255));

        cpfLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cpfLabel.setForeground(new java.awt.Color(0, 0, 0));
        cpfLabel.setText("CPF");

        try {
            cpfInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        dadosPainel2.setBackground(new java.awt.Color(255, 255, 255));
        dadosPainel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        nomeUserLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeUserLabel2.setForeground(new java.awt.Color(0, 0, 0));
        nomeUserLabel2.setText("Nome de Usuario: ");

        nomeUserInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeUserInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        nomeLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeLabel2.setForeground(new java.awt.Color(0, 0, 0));
        nomeLabel2.setText("Nome: ");

        nomeInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        senhaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        senhaLabel.setText("Senha: ");

        senhaInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        senhaInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        emailLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        emailLabel2.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel2.setText("E-mail: ");

        emailInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        emailInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        celularLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        celularLabel2.setForeground(new java.awt.Color(0, 0, 0));
        celularLabel2.setText("Celular: ");

        try {
            celularInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        celularInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        ruaLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        ruaLabel2.setForeground(new java.awt.Color(0, 0, 0));
        ruaLabel2.setText("Rua: ");

        ruaInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        ruaInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        bairroLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        bairroLabel2.setForeground(new java.awt.Color(0, 0, 0));
        bairroLabel2.setText("Bairro: ");

        bairroInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        bairroInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        numeroLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        numeroLabel2.setForeground(new java.awt.Color(0, 0, 0));
        numeroLabel2.setText("Número:");

        numeroInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        numeroInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        cepLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cepLabel2.setForeground(new java.awt.Color(0, 0, 0));
        cepLabel2.setText("CEP: ");

        try {
            cepInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        javax.swing.GroupLayout dadosPainel2Layout = new javax.swing.GroupLayout(dadosPainel2);
        dadosPainel2.setLayout(dadosPainel2Layout);
        dadosPainel2Layout.setHorizontalGroup(
            dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPainel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPainel2Layout.createSequentialGroup()
                        .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomeLabel2)
                                .addComponent(nomeInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(bairroLabel2)
                                .addComponent(bairroInput))
                            .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(celularLabel2)
                                .addComponent(celularInput, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ruaInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numeroLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ruaLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(senhaLabel)
                                .addComponent(senhaInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPainel2Layout.createSequentialGroup()
                        .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosPainel2Layout.createSequentialGroup()
                                .addComponent(nomeUserLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE))
                            .addGroup(dadosPainel2Layout.createSequentialGroup()
                                .addComponent(nomeUserInput)
                                .addGap(48, 48, 48)))
                        .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(emailLabel2))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPainel2Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cepLabel2)
                    .addComponent(cepInput, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(173, 173, 173))
        );
        dadosPainel2Layout.setVerticalGroup(
            dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPainel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPainel2Layout.createSequentialGroup()
                        .addComponent(nomeLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPainel2Layout.createSequentialGroup()
                        .addComponent(senhaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dadosPainel2Layout.createSequentialGroup()
                        .addComponent(emailLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPainel2Layout.createSequentialGroup()
                        .addComponent(nomeUserLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPainel2Layout.createSequentialGroup()
                        .addComponent(ruaLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ruaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPainel2Layout.createSequentialGroup()
                        .addComponent(celularLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(dadosPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPainel2Layout.createSequentialGroup()
                        .addComponent(numeroLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosPainel2Layout.createSequentialGroup()
                        .addComponent(bairroLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cepLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cepInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        atualizarButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        atualizarButton.setText("ATUALIZAR");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        limparButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        limparButton.setText("LIMPAR");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBrancoLayout = new javax.swing.GroupLayout(panelBranco);
        panelBranco.setLayout(panelBrancoLayout);
        panelBrancoLayout.setHorizontalGroup(
            panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(cpfLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosPainel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        panelBrancoLayout.setVerticalGroup(
            panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dadosPainel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limparButton, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(atualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        limparCampos();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        if (checkCampoVazio()) {
            atualizarCliente(cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Os campos: Nome de Usuario\nNome\nSenha\nSão obrigatorios!");
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(tela_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Atualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField bairroInput;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JLabel bairroLabel1;
    private javax.swing.JLabel bairroLabel2;
    private javax.swing.JTextField bairroOutput;
    private javax.swing.JTextField bairroOutput1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField celularInput;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JLabel celularLabel1;
    private javax.swing.JLabel celularLabel2;
    private javax.swing.JFormattedTextField celularOutput;
    private javax.swing.JFormattedTextField celularOutput1;
    private javax.swing.JFormattedTextField cepInput;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JLabel cepLabel1;
    private javax.swing.JLabel cepLabel2;
    private javax.swing.JFormattedTextField cepOutput;
    private javax.swing.JFormattedTextField cepOutput1;
    private javax.swing.JFormattedTextField cpfInput;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JPanel dadosPainel;
    private javax.swing.JPanel dadosPainel1;
    private javax.swing.JPanel dadosPainel2;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JTextField emailOutput;
    private javax.swing.JTextField emailOutput1;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nomeLabel1;
    private javax.swing.JLabel nomeLabel2;
    private javax.swing.JTextField nomeOutput;
    private javax.swing.JTextField nomeOutput1;
    private javax.swing.JTextField nomeUserInput;
    private javax.swing.JLabel nomeUserLabel;
    private javax.swing.JLabel nomeUserLabel1;
    private javax.swing.JLabel nomeUserLabel2;
    private javax.swing.JTextField nomeUserOutput;
    private javax.swing.JTextField nomeUserOutput1;
    private javax.swing.JTextField numeroInput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JLabel numeroLabel1;
    private javax.swing.JLabel numeroLabel2;
    private javax.swing.JTextField numeroOutput;
    private javax.swing.JTextField numeroOutput1;
    private javax.swing.JPanel panelBranco;
    private javax.swing.JTextField ruaInput;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JLabel ruaLabel1;
    private javax.swing.JLabel ruaLabel2;
    private javax.swing.JTextField ruaOutput;
    private javax.swing.JTextField ruaOutput1;
    private javax.swing.JTextField senhaInput;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
