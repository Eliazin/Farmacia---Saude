
package Interfaces_adm;

import Banco_de_dados.mySql;
import Objetos.Fornecedor;
import javax.swing.JOptionPane;

public class tela_Forn_Atualizar extends javax.swing.JFrame {

    mySql conectar = new mySql();
    Fornecedor fornecedor = new Fornecedor();
    
    public void atualizarFornecedor(Fornecedor fornecedor){
        this.conectar.conectaBanco();
        
        String consultaCnpj = this.cnpjInput.getText();
        
        try {
            this.conectar.updateSQL(
                "UPDATE fornecedores SET "                    
                    + "nomeforn = '" + fornecedorInput.getText() + "',"
                    + "nomefant = '" + nomeFantInput.getText() + "',"
                    + "insc_est = '" + inscEstadualInput.getText() + "',"
                    + "email = '" + emailInput.getText() + "',"
                    + "celular = '" + celularInput.getText() + "',"
                    + "telefone = '" + telefoneInput.getText() + "',"
                    + "endereco = '" + enderecoInput.getText() + "',"
                    + "numero = '" + numeroInput.getText() + "',"
                    + "bairro = '" + bairroInput.getText() + "',"
                    + "cidade = '" + cidadeInput.getText() + "',"
                    + "uf = '" + ufInput.getText() + "',"
                    + "cep = '" + cepInput.getText() + "'"
                + " WHERE "
                    + "cnpj = '" + consultaCnpj + "'"
                + ";"
            );
        }catch(Exception e){
            System.out.println("Erro ao atualizar fornecedor " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar fornecedor");
        }finally{
            this.conectar.fechaBanco();
            limparCampos();
            fornecedor.limpaFornecedor();
            JOptionPane.showMessageDialog(null, "Fornecedor atualizado com sucesso");
        }
    }
    
    public boolean checkCampoVazio () {
        boolean campoVazio = true;
        
        if (this.fornecedorInput.getText().equals("")) {
            campoVazio = false;
        }
        
        return campoVazio;
    }
    
    private void limparCampos(){
        fornecedorInput.setText("");
        nomeFantInput.setText("");
        emailInput.setText("");
        cnpjInput.setText("");
        inscEstadualInput.setText("");
        celularInput.setText("");
        telefoneInput.setText("");
        enderecoInput.setText("");
        numeroInput.setText("");
        bairroInput.setText("");
        cidadeInput.setText("");
        ufInput.setText("");
        cepInput.setText("");
    }
    
    public tela_Forn_Atualizar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        atualizarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        cnpjLabel = new javax.swing.JLabel();
        cnpjInput = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        fonecedorLabel = new javax.swing.JLabel();
        fornecedorInput = new javax.swing.JTextField();
        nomeFantLabel = new javax.swing.JLabel();
        nomeFantInput = new javax.swing.JTextField();
        inscEstadualLabel = new javax.swing.JLabel();
        inscEstadualInput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        celularLabel = new javax.swing.JLabel();
        celularInput = new javax.swing.JFormattedTextField();
        telefoneLabel = new javax.swing.JLabel();
        telefoneInput = new javax.swing.JTextField();
        enderecoLabel = new javax.swing.JLabel();
        enderecoInput = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroInput = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroInput = new javax.swing.JTextField();
        cidadeLabel = new javax.swing.JLabel();
        cidadeInput = new javax.swing.JTextField();
        ufLabel = new javax.swing.JLabel();
        ufInput = new javax.swing.JTextField();
        cepLabel = new javax.swing.JLabel();
        cepInput = new javax.swing.JFormattedTextField();

        setTitle("ATUALIZAR FORNECEDORES");
        setResizable(false);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));

        atualizarButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        atualizarButton.setText("ATUALIZAR");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        limparButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        limparButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        limparButton.setText("LIMPAR");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        cnpjLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cnpjLabel.setForeground(new java.awt.Color(0, 0, 0));
        cnpjLabel.setText("CNPJ:");

        try {
            cnpjInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fonecedorLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        fonecedorLabel.setForeground(new java.awt.Color(0, 0, 0));
        fonecedorLabel.setText("Fornecedor:");

        fornecedorInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        nomeFantLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeFantLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeFantLabel.setText("Nome Fantasia:");

        nomeFantInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        inscEstadualLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        inscEstadualLabel.setForeground(new java.awt.Color(0, 0, 0));
        inscEstadualLabel.setText("Inscrição Estadual:");

        inscEstadualInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("E-mail:");

        emailInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        celularLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        celularLabel.setForeground(new java.awt.Color(0, 0, 0));
        celularLabel.setText("Celular:");

        try {
            celularInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        telefoneLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        telefoneLabel.setForeground(new java.awt.Color(0, 0, 0));
        telefoneLabel.setText("Telefone:");

        telefoneInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        enderecoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        enderecoLabel.setForeground(new java.awt.Color(0, 0, 0));
        enderecoLabel.setText("Endereço:");

        enderecoInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        numeroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        numeroLabel.setForeground(new java.awt.Color(0, 0, 0));
        numeroLabel.setText("Numero:");

        numeroInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        bairroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        bairroLabel.setForeground(new java.awt.Color(0, 0, 0));
        bairroLabel.setText("Bairro:");

        bairroInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        cidadeLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cidadeLabel.setForeground(new java.awt.Color(0, 0, 0));
        cidadeLabel.setText("Cidade:");

        cidadeInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        ufLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        ufLabel.setForeground(new java.awt.Color(0, 0, 0));
        ufLabel.setText("UF:");

        ufInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        cepLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cepLabel.setForeground(new java.awt.Color(0, 0, 0));
        cepLabel.setText("CEP:");

        try {
            cepInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fornecedorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fonecedorLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeFantLabel)
                                    .addComponent(nomeFantInput, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inscEstadualLabel)
                                    .addComponent(inscEstadualInput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celularLabel))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneLabel)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailInput)
                                        .addComponent(emailLabel))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enderecoLabel)
                                    .addComponent(enderecoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadeLabel)
                                    .addComponent(cidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(ufInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cepInput)))))
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
                    .addComponent(fornecedorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeFantInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscEstadualLabel)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscEstadualInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularLabel)
                    .addComponent(telefoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enderecoLabel)
                        .addComponent(bairroLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeLabel)
                    .addComponent(ufLabel)
                    .addComponent(cepLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        if (checkCampoVazio()) {
            atualizarFornecedor(fornecedor);
        } else {
            JOptionPane.showMessageDialog(null, "O campo: Fornecedor\nÉ obrigatorio!");
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(tela_Forn_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Forn_Atualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField bairroInput;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JFormattedTextField celularInput;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JFormattedTextField cepInput;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cidadeInput;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JFormattedTextField cnpjInput;
    private javax.swing.JLabel cnpjLabel;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField enderecoInput;
    private javax.swing.JLabel enderecoLabel;
    private javax.swing.JLabel fonecedorLabel;
    private javax.swing.JTextField fornecedorInput;
    private javax.swing.JTextField inscEstadualInput;
    private javax.swing.JLabel inscEstadualLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField nomeFantInput;
    private javax.swing.JLabel nomeFantLabel;
    private javax.swing.JTextField numeroInput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField telefoneInput;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField ufInput;
    private javax.swing.JLabel ufLabel;
    // End of variables declaration//GEN-END:variables
}
