
package Interfaces_adm;

import Banco_de_dados.mySql;
import Objetos.Fornecedor;
import javax.swing.JOptionPane;

public class tela_Forn_Consultar extends javax.swing.JFrame {

    mySql conectar = new mySql();
    Fornecedor fornecedor = new Fornecedor();
    
    public tela_Forn_Consultar() {
        initComponents();
    }
    
    private void consultarFornecedor(Fornecedor cliente){
        this.conectar.conectaBanco();
        
        String consultaCnpj = this.cnpjInput.getText();
                
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "nomeforn,"                    
                    + "nomefant,"
                    + "email,"
                    + "insc_est,"
                    + "celular,"
                    + "telefone,"
                    + "endereco,"
                    + "numero,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep"
                 + " FROM"
                     + " fornecedores"
                 + " WHERE"
                     + " cnpj = '" + consultaCnpj + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                fornecedor.setNomeForn(this.conectar.getResultSet().getString(1));
                fornecedor.setNomeFant(this.conectar.getResultSet().getString(2));
                fornecedor.setEmail(this.conectar.getResultSet().getString(3));
                fornecedor.setInscEst(this.conectar.getResultSet().getString(4));
                fornecedor.setCelular(this.conectar.getResultSet().getString(5));
                fornecedor.setTelefone(this.conectar.getResultSet().getString(6));
                fornecedor.setEndereco(this.conectar.getResultSet().getString(7));
                fornecedor.setNumero(this.conectar.getResultSet().getString(8));
                fornecedor.setBairro(this.conectar.getResultSet().getString(9));
                fornecedor.setCidade(this.conectar.getResultSet().getString(10));
                fornecedor.setUf(this.conectar.getResultSet().getString(11));
                fornecedor.setCep(this.conectar.getResultSet().getString(12));
           }
            
           if(fornecedor.getNomeForn().equals("")){
                JOptionPane.showMessageDialog(null, "Fornecedor não encontrado!");
           }
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar fornecedor " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar fornecedor");
            
        }finally{
            fornecedorOutput.setText(fornecedor.getNomeForn());
            nomeFantOutput.setText(fornecedor.getNomeForn());
            emailOutput.setText(cliente.getEmail());
            inscEstadualOutput.setText(fornecedor.getInscEst());
            celularOutput.setText(cliente.getCelular());
            telefoneOutput.setText(fornecedor.getTelefone());
            enderecoOutput.setText(fornecedor.getEndereco());
            numeroOutput.setText(cliente.getNumero());
            bairroOutput.setText(cliente.getBairro());
            cidadeOutput.setText(cliente.getCidade());
            ufOutput.setText(cliente.getUf());
            cepOutput.setText(cliente.getCep());
            this.conectar.fechaBanco();   
            fornecedor.limpaFornecedor();
        }               
    }
    
    private void limparCampos(){
        fornecedorOutput.setText("");
        nomeFantOutput.setText("");
        emailOutput.setText("");
        cnpjInput.setText("");
        inscEstadualOutput.setText("");
        celularOutput.setText("");
        telefoneOutput.setText("");
        enderecoOutput.setText("");
        numeroOutput.setText("");
        bairroOutput.setText("");
        cidadeOutput.setText("");
        ufOutput.setText("");
        cepOutput.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        consultarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        cnpjLabel = new javax.swing.JLabel();
        cnpjInput = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        fonecedorLabel = new javax.swing.JLabel();
        fornecedorOutput = new javax.swing.JTextField();
        nomeFantLabel = new javax.swing.JLabel();
        nomeFantOutput = new javax.swing.JTextField();
        inscEstadualLabel = new javax.swing.JLabel();
        inscEstadualOutput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailOutput = new javax.swing.JTextField();
        celularLabel = new javax.swing.JLabel();
        celularOutput = new javax.swing.JFormattedTextField();
        telefoneLabel = new javax.swing.JLabel();
        telefoneOutput = new javax.swing.JTextField();
        enderecoLabel = new javax.swing.JLabel();
        enderecoOutput = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroOutput = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroOutput = new javax.swing.JTextField();
        cidadeLabel = new javax.swing.JLabel();
        cidadeOutput = new javax.swing.JTextField();
        ufLabel = new javax.swing.JLabel();
        ufOutput = new javax.swing.JTextField();
        cepLabel = new javax.swing.JLabel();
        cepOutput = new javax.swing.JFormattedTextField();

        setTitle("CONSULTA DE FORNECEDORES");
        setResizable(false);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));

        consultarButton.setText("CONSULTAR");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        limparButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        limparButton.setText("LIMPAR");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        cnpjLabel.setText("CNPJ:");

        try {
            cnpjInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fonecedorLabel.setText("Fornecedor:");

        fornecedorOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fornecedorOutput.setEnabled(false);

        nomeFantLabel.setText("Nome Fantasia:");

        nomeFantOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nomeFantOutput.setEnabled(false);

        inscEstadualLabel.setText("Inscrição Estadual:");

        inscEstadualOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        inscEstadualOutput.setEnabled(false);

        emailLabel.setText("E-mail:");

        emailOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        emailOutput.setEnabled(false);

        celularLabel.setText("Celular:");

        try {
            celularOutput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        celularOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        celularOutput.setEnabled(false);

        telefoneLabel.setText("Telefone:");

        telefoneOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        telefoneOutput.setEnabled(false);

        enderecoLabel.setText("Endereço:");

        enderecoOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        enderecoOutput.setEnabled(false);

        numeroLabel.setText("Numero:");

        numeroOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        numeroOutput.setEnabled(false);

        bairroLabel.setText("Bairro:");

        bairroOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        bairroOutput.setEnabled(false);

        cidadeLabel.setText("Cidade:");

        cidadeOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cidadeOutput.setEnabled(false);

        ufLabel.setText("UF:");

        ufOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ufOutput.setEnabled(false);

        cepLabel.setText("CEP:");

        try {
            cepOutput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cepOutput.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(celularOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telefoneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fornecedorOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fonecedorLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeFantLabel)
                                    .addComponent(nomeFantOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inscEstadualLabel)
                                    .addComponent(inscEstadualOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celularLabel))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneLabel)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailOutput)
                                        .addComponent(emailLabel))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enderecoLabel)
                                    .addComponent(enderecoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadeLabel)
                                    .addComponent(cidadeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(numeroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bairroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ufLabel)
                                                .addGap(61, 61, 61)
                                                .addComponent(cepLabel))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(numeroLabel)
                                                .addGap(30, 30, 30)
                                                .addComponent(bairroLabel)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ufOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cepOutput)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fonecedorLabel)
                    .addComponent(nomeFantLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeFantOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscEstadualLabel)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscEstadualOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularLabel)
                    .addComponent(telefoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enderecoLabel)
                        .addComponent(bairroLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeLabel)
                    .addComponent(ufLabel)
                    .addComponent(cepLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(cnpjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cnpjInput)
                .addGap(174, 174, 174))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpjInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        consultarFornecedor(fornecedor);
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        limparCampos();
    }//GEN-LAST:event_limparButtonActionPerformed

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
            java.util.logging.Logger.getLogger(tela_Forn_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Forn_Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JTextField bairroOutput;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JFormattedTextField celularOutput;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JFormattedTextField cepOutput;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField cidadeOutput;
    private javax.swing.JFormattedTextField cnpjInput;
    private javax.swing.JLabel cnpjLabel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailOutput;
    private javax.swing.JLabel enderecoLabel;
    private javax.swing.JTextField enderecoOutput;
    private javax.swing.JLabel fonecedorLabel;
    private javax.swing.JTextField fornecedorOutput;
    private javax.swing.JLabel inscEstadualLabel;
    private javax.swing.JTextField inscEstadualOutput;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel nomeFantLabel;
    private javax.swing.JTextField nomeFantOutput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroOutput;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField telefoneOutput;
    private javax.swing.JLabel ufLabel;
    private javax.swing.JTextField ufOutput;
    // End of variables declaration//GEN-END:variables
}
