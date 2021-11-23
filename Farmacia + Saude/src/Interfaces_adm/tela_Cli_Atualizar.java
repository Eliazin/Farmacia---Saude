package Interfaces_adm;

import Banco_de_dados.mySql;
import Objetos.Cliente;
import javax.swing.JOptionPane;

public class tela_Cli_Atualizar extends javax.swing.JFrame {

    mySql conectar = new mySql();
    Cliente cliente = new Cliente();
    
    public void atualizarCliente(Cliente cliente){
        this.conectar.conectaBanco();
        
        String consultaCpf = this.cpfInput.getText();
        
        try {
            this.conectar.updateSQL(
                "UPDATE clientes SET "                    
                    + "nome = '" + nomeInput.getText() + "',"
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
            this.nomeInput.getText().equals("")) {
            campoVazio = false;
        }
        
        return campoVazio;
    }
    
    private void limparCampos(){
        cpfInput.setText("");
        nomeUserInput.setText("");
        nomeInput.setText("");
        emailInput.setText("");
        celularInput.setText("");
        ruaInput.setText("");
        numeroInput.setText("");
        bairroInput.setText("");
        cepInput.setText("");
    }
    
    public tela_Cli_Atualizar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBranco = new javax.swing.JPanel();
        cpfLabel = new javax.swing.JLabel();
        atualizarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        cpfInput = new javax.swing.JFormattedTextField();
        dadosPainel = new javax.swing.JPanel();
        nomeUserLabel = new javax.swing.JLabel();
        nomeUserInput = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        celularLabel = new javax.swing.JLabel();
        celularInput = new javax.swing.JFormattedTextField();
        ruaLabel = new javax.swing.JLabel();
        ruaInput = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroInput = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroInput = new javax.swing.JTextField();
        cepLabel = new javax.swing.JLabel();
        cepInput = new javax.swing.JFormattedTextField();

        setTitle("ATUALIZAR CLIENTE");

        panelBranco.setBackground(new java.awt.Color(255, 255, 255));

        cpfLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cpfLabel.setForeground(new java.awt.Color(0, 0, 0));
        cpfLabel.setText("CPF");

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

        try {
            cpfInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        dadosPainel.setBackground(new java.awt.Color(255, 255, 255));
        dadosPainel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        nomeUserLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeUserLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeUserLabel.setText("Nome de Usuario: ");

        nomeUserInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeUserInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        nomeLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeLabel.setText("Nome: ");

        nomeInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        emailLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("E-mail: ");

        emailInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        emailInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        celularLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        celularLabel.setForeground(new java.awt.Color(0, 0, 0));
        celularLabel.setText("Celular: ");

        try {
            celularInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        celularInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        ruaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        ruaLabel.setForeground(new java.awt.Color(0, 0, 0));
        ruaLabel.setText("Rua: ");

        ruaInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        ruaInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        bairroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        bairroLabel.setForeground(new java.awt.Color(0, 0, 0));
        bairroLabel.setText("Bairro: ");

        bairroInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        bairroInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        numeroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        numeroLabel.setForeground(new java.awt.Color(0, 0, 0));
        numeroLabel.setText("Número:");

        numeroInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        numeroInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        cepLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cepLabel.setForeground(new java.awt.Color(0, 0, 0));
        cepLabel.setText("CEP: ");

        try {
            cepInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepInput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);

        javax.swing.GroupLayout dadosPainelLayout = new javax.swing.GroupLayout(dadosPainel);
        dadosPainel.setLayout(dadosPainelLayout);
        dadosPainelLayout.setHorizontalGroup(
            dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(numeroInput, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addComponent(emailInput)
                        .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomeInput)
                        .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ruaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ruaInput))
                    .addComponent(numeroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cepLabel)
                    .addComponent(bairroLabel)
                    .addComponent(nomeUserLabel)
                    .addComponent(celularLabel)
                    .addComponent(celularInput, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(bairroInput)
                    .addComponent(cepInput)
                    .addComponent(nomeUserInput))
                .addContainerGap())
        );
        dadosPainelLayout.setVerticalGroup(
            dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeUserLabel)
                    .addComponent(nomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(celularLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaLabel)
                    .addComponent(bairroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLabel)
                    .addComponent(cepLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBrancoLayout = new javax.swing.GroupLayout(panelBranco);
        panelBranco.setLayout(panelBrancoLayout);
        panelBrancoLayout.setHorizontalGroup(
            panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadosPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(cpfLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBrancoLayout.setVerticalGroup(
            panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfLabel))
                .addGap(18, 18, 18)
                .addComponent(dadosPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limparButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(atualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
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
            JOptionPane.showMessageDialog(null, "Os campos: Nome de Usuario\nNome\nSão obrigatorios!");
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
            java.util.logging.Logger.getLogger(tela_Cli_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Cli_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Cli_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Cli_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Cli_Atualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField bairroInput;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField celularInput;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JFormattedTextField cepInput;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JFormattedTextField cpfInput;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JPanel dadosPainel;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeUserInput;
    private javax.swing.JLabel nomeUserLabel;
    private javax.swing.JTextField numeroInput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JPanel panelBranco;
    private javax.swing.JTextField ruaInput;
    private javax.swing.JLabel ruaLabel;
    // End of variables declaration//GEN-END:variables
}
