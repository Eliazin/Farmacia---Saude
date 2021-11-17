
package Interfaces_adm;

import Banco_de_dados.mySql;
import Objetos.Fornecedor;
import javax.swing.JOptionPane;

public class tela_Forn_Cadastrar extends javax.swing.JFrame {

    mySql conectar = new mySql();
    Fornecedor novoFornecedor = new Fornecedor();
    
    public tela_Forn_Cadastrar() {
        initComponents();
    }
    
    public boolean checkCampoVazio () {
        boolean campoVazio = true;
        
        if (this.fornecedorInput.getText().equals("") || 
            this.cnpjInput.getText().equals("  .   .   /    -  ")) {
            campoVazio = false;
        }
        
        return campoVazio;
    }
    
    private void cadastraFornecedor(Fornecedor novoFornecedor){
        this.conectar.conectaBanco(); 
        
        novoFornecedor.setNomeForn(fornecedorInput.getText());
        novoFornecedor.setNomeFant(nomeFantInput.getText());
        novoFornecedor.setEmail(emailInput.getText());
        novoFornecedor.setCnpj(cnpjInput.getText());
        novoFornecedor.setInscEst(inscEstInput.getText());
        novoFornecedor.setCelular(celularInput.getText());
        novoFornecedor.setTelefone(telefoneInput.getText());
        novoFornecedor.setEndereco(enderecoInput.getText());
        novoFornecedor.setNumero(numeroInput.getText());
        novoFornecedor.setBairro(bairroInput.getText());
        novoFornecedor.setCidade(cidadeInput.getText());
        novoFornecedor.setUf(ufInput.getText());
        novoFornecedor.setCep(cepInput.getText());
        
        try {
                        
            this.conectar.insertSQL("INSERT INTO fornecedores ("
                    + "nomeforn,"
                    + "nomefant,"
                    + "email,"
                    + "cnpj,"
                    + "insc_est,"
                    + "celular,"
                    + "telefone,"
                    + "endereco,"
                    + "numero,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep"
                + ") VALUES ("
                    + "'" + novoFornecedor.getNomeForn()+ "',"
                    + "'" + novoFornecedor.getNomeFant()+ "',"
                    + "'" + novoFornecedor.getEmail() + "',"
                    + "'" + novoFornecedor.getCnpj()+ "',"
                    + "'" + novoFornecedor.getInscEst()+ "',"
                    + "'" + novoFornecedor.getCelular()+ "',"
                    + "'" + novoFornecedor.getTelefone()+ "',"
                    + "'" + novoFornecedor.getEndereco()+ "',"
                    + "'" + novoFornecedor.getNumero()+ "',"
                    + "'" + novoFornecedor.getBairro()+ "',"
                    + "'" + novoFornecedor.getCidade()+ "',"
                    + "'" + novoFornecedor.getUf()+ "',"
                    + "'" + novoFornecedor.getCep()+ "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar fornecedor " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar fornecedor");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso");
            novoFornecedor.limpaFornecedor();
            //limparCamposCadastro();
        }                
    }
    
    private void limparCamposCadastro(){
        fornecedorInput.setText("");
        nomeFantInput.setText("");
        emailInput.setText("");
        cnpjInput.setText("");
        inscEstInput.setText("");
        celularInput.setText("");
        telefoneInput.setText("");
        enderecoInput.setText("");
        numeroInput.setText("");
        bairroInput.setText("");
        cidadeInput.setText("");
        ufInput.setText("");
        cepInput.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        fonecedorLabel = new javax.swing.JLabel();
        fornecedorInput = new javax.swing.JTextField();
        nomeFantLabel = new javax.swing.JLabel();
        nomeFantInput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        cnpjLabel = new javax.swing.JLabel();
        cnpjInput = new javax.swing.JFormattedTextField();
        inscEstLabel = new javax.swing.JLabel();
        inscEstInput = new javax.swing.JTextField();
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
        salvarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();

        setTitle("CADASTRO DE FORNECEDORES");
        setResizable(false);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));

        fonecedorLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        fonecedorLabel.setForeground(new java.awt.Color(0, 0, 0));
        fonecedorLabel.setText("Fornecedor:");

        fornecedorInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        nomeFantLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeFantLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeFantLabel.setText("Nome Fantasia:");

        nomeFantInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("E-mail:");

        emailInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        cnpjLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cnpjLabel.setForeground(new java.awt.Color(0, 0, 0));
        cnpjLabel.setText("CNPJ:");

        try {
            cnpjInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        inscEstLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        inscEstLabel.setForeground(new java.awt.Color(0, 0, 0));
        inscEstLabel.setText("Inscrição Estadual:");

        inscEstInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

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

        salvarButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        salvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        salvarButton.setText("SALVAR");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
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

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fonecedorLabel)
                    .addComponent(fornecedorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(nomeFantLabel)
                        .addGap(254, 254, 254)
                        .addComponent(emailLabel))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(nomeFantInput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(cnpjLabel)
                        .addGap(307, 307, 307)
                        .addComponent(inscEstLabel))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(celularLabel)
                        .addGap(298, 298, 298)
                        .addComponent(telefoneLabel))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(enderecoLabel)
                        .addGap(284, 284, 284)
                        .addComponent(numeroLabel)
                        .addGap(30, 30, 30)
                        .addComponent(bairroLabel))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(enderecoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(cidadeLabel)
                        .addGap(299, 299, 299)
                        .addComponent(ufLabel)
                        .addGap(61, 61, 61)
                        .addComponent(cepLabel))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(cidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(ufInput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cepInput))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cnpjInput)
                            .addComponent(celularInput, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inscEstInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(fonecedorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(fornecedorInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeFantLabel)
                    .addComponent(emailLabel))
                .addGap(6, 6, 6)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeFantInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cnpjLabel)
                    .addComponent(inscEstLabel))
                .addGap(6, 6, 6)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscEstInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpjInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(celularLabel)
                    .addComponent(telefoneLabel))
                .addGap(6, 6, 6)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enderecoLabel)
                    .addComponent(numeroLabel)
                    .addComponent(bairroLabel))
                .addGap(6, 6, 6)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enderecoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cidadeLabel)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ufLabel)
                            .addComponent(cepLabel))))
                .addGap(4, 4, 4)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ufInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cepInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed

        if (checkCampoVazio()) {
            cadastraFornecedor(novoFornecedor);
        } else {
            JOptionPane.showMessageDialog(null, "Os campos: Fornecedor\nCNPJ\nSão obrigatorios!");
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        limparCamposCadastro();
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
            java.util.logging.Logger.getLogger(tela_Forn_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Forn_Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField inscEstInput;
    private javax.swing.JLabel inscEstLabel;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField nomeFantInput;
    private javax.swing.JLabel nomeFantLabel;
    private javax.swing.JTextField numeroInput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTextField telefoneInput;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField ufInput;
    private javax.swing.JLabel ufLabel;
    // End of variables declaration//GEN-END:variables
}
