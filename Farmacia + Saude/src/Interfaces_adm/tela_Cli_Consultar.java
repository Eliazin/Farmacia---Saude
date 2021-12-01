
package Interfaces_adm;

import Banco_de_dados.mySql;
import Objetos.Cliente;
import javax.swing.JOptionPane;

public class tela_Cli_Consultar extends javax.swing.JFrame {
    
    mySql conectar = new mySql();
    Cliente cliente = new Cliente();
    
    private void consultarCliente(Cliente cliente){
        this.conectar.conectaBanco();
        
        String consultaCpf = this.cpfInput.getText();
                
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "nome,"                    
                    + "nomeuser,"
                    + "email,"
                    + "celular,"
                    + "rua,"
                    + "bairro,"
                    + "numero,"
                    + "cep"
                 + " FROM"
                     + " clientes"
                 + " WHERE"
                     + " cpf = '" + consultaCpf + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                cliente.setNome(this.conectar.getResultSet().getString(1));
                cliente.setNomeUser(this.conectar.getResultSet().getString(2));
                cliente.setEmail(this.conectar.getResultSet().getString(3));
                cliente.setCelular(this.conectar.getResultSet().getString(4));
                cliente.setRua(this.conectar.getResultSet().getString(5));
                cliente.setBairro(this.conectar.getResultSet().getString(6));
                cliente.setNumero(this.conectar.getResultSet().getString(7));
                cliente.setCep(this.conectar.getResultSet().getString(8));
           }
            
           if(cliente.getNome().equals("")){
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
           }
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente");
            
        }finally{
            nomeOutput.setText(cliente.getNome());
            nomeUserOutput.setText(cliente.getNomeUser());
            emailOutput.setText(cliente.getEmail());
            celularOutput.setText(cliente.getCelular());
            ruaOutput.setText(cliente.getRua());
            bairroOutput.setText(cliente.getBairro());
            numeroOutput.setText(cliente.getNumero());
            cepOutput.setText(cliente.getCep());
            this.conectar.fechaBanco();   
            cliente.limpaCliente();
        }               
    }
    
    private void limparCamposConsulta(){
        cpfInput.setText("");
        nomeUserOutput.setText("");
        nomeOutput.setText("");
        emailOutput.setText("");
        celularOutput.setText("");
        ruaOutput.setText("");
        numeroOutput.setText("");
        bairroOutput.setText("");
        cepOutput.setText("");
    }

    public tela_Cli_Consultar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBranco = new javax.swing.JPanel();
        cpfLabel = new javax.swing.JLabel();
        consultarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        cpfInput = new javax.swing.JFormattedTextField();
        dadosPainel = new javax.swing.JPanel();
        nomeUserLabel = new javax.swing.JLabel();
        nomeUserOutput = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeOutput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailOutput = new javax.swing.JTextField();
        celularLabel = new javax.swing.JLabel();
        celularOutput = new javax.swing.JFormattedTextField();
        ruaLabel = new javax.swing.JLabel();
        ruaOutput = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroOutput = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroOutput = new javax.swing.JTextField();
        cepLabel = new javax.swing.JLabel();
        cepOutput = new javax.swing.JFormattedTextField();

        setTitle("CONSULTAR CLIENTE");
        setResizable(false);

        panelBranco.setBackground(new java.awt.Color(255, 255, 255));

        cpfLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cpfLabel.setForeground(new java.awt.Color(0, 0, 0));
        cpfLabel.setText("CPF");

        consultarButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        consultarButton.setText("CONSULTAR");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        limparButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        limparButton.setText("LIMPAR");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        cpfInput.setForeground(new java.awt.Color(0, 0, 0));
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

        nomeUserOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeUserOutput.setForeground(new java.awt.Color(0, 0, 0));
        nomeUserOutput.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nomeUserOutput.setEnabled(false);

        nomeLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeLabel.setText("Nome: ");

        nomeOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeOutput.setForeground(new java.awt.Color(0, 0, 0));
        nomeOutput.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nomeOutput.setEnabled(false);

        emailLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("E-mail: ");

        emailOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        emailOutput.setForeground(new java.awt.Color(0, 0, 0));
        emailOutput.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        emailOutput.setEnabled(false);

        celularLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        celularLabel.setForeground(new java.awt.Color(0, 0, 0));
        celularLabel.setText("Celular: ");

        celularOutput.setForeground(new java.awt.Color(0, 0, 0));
        try {
            celularOutput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        celularOutput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);
        celularOutput.setEnabled(false);

        ruaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        ruaLabel.setForeground(new java.awt.Color(0, 0, 0));
        ruaLabel.setText("Rua: ");

        ruaOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        ruaOutput.setForeground(new java.awt.Color(0, 0, 0));
        ruaOutput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);
        ruaOutput.setEnabled(false);

        bairroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        bairroLabel.setForeground(new java.awt.Color(0, 0, 0));
        bairroLabel.setText("Bairro: ");

        bairroOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        bairroOutput.setForeground(new java.awt.Color(0, 0, 0));
        bairroOutput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);
        bairroOutput.setEnabled(false);

        numeroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        numeroLabel.setForeground(new java.awt.Color(0, 0, 0));
        numeroLabel.setText("Número:");

        numeroOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        numeroOutput.setForeground(new java.awt.Color(0, 0, 0));
        numeroOutput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);
        numeroOutput.setEnabled(false);

        cepLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cepLabel.setForeground(new java.awt.Color(0, 0, 0));
        cepLabel.setText("CEP: ");

        cepOutput.setForeground(new java.awt.Color(0, 0, 0));
        try {
            cepOutput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepOutput.setDisabledTextColor(java.awt.SystemColor.textInactiveText);
        cepOutput.setEnabled(false);

        javax.swing.GroupLayout dadosPainelLayout = new javax.swing.GroupLayout(dadosPainel);
        dadosPainel.setLayout(dadosPainelLayout);
        dadosPainelLayout.setHorizontalGroup(
            dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(numeroOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addComponent(emailOutput)
                        .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomeOutput)
                        .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ruaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ruaOutput))
                    .addComponent(numeroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cepLabel)
                    .addComponent(bairroLabel)
                    .addComponent(nomeUserLabel)
                    .addComponent(celularLabel)
                    .addComponent(celularOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(bairroOutput)
                    .addComponent(cepOutput)
                    .addComponent(nomeUserOutput))
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
                    .addComponent(nomeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUserOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(celularLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celularOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaLabel)
                    .addComponent(bairroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLabel)
                    .addComponent(cepLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBrancoLayout = new javax.swing.GroupLayout(panelBranco);
        panelBranco.setLayout(panelBrancoLayout);
        panelBrancoLayout.setHorizontalGroup(
            panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dadosPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBrancoLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(cpfLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        panelBrancoLayout.setVerticalGroup(
            panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBrancoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfLabel))
                .addGap(21, 21, 21)
                .addComponent(dadosPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limparButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(consultarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        limparCamposConsulta();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        consultarCliente(cliente);
    }//GEN-LAST:event_consultarButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(tela_Cli_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Cli_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Cli_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Cli_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Cli_Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JTextField bairroOutput;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JFormattedTextField celularOutput;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JFormattedTextField cepOutput;
    private javax.swing.JButton consultarButton;
    private javax.swing.JFormattedTextField cpfInput;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JPanel dadosPainel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailOutput;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeOutput;
    private javax.swing.JLabel nomeUserLabel;
    private javax.swing.JTextField nomeUserOutput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroOutput;
    private javax.swing.JPanel panelBranco;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JTextField ruaOutput;
    // End of variables declaration//GEN-END:variables
}
