
package Interfaces;

import Banco_de_dados.mySql;
import Objetos.Cliente;
import javax.swing.JOptionPane;

public class cadastro_Clientes extends javax.swing.JFrame {
    
    mySql conectar = new mySql();
    Cliente novoCliente = new Cliente();
        
    public cadastro_Clientes() {
        initComponents();
    }
    
    
    public boolean checkCampoVazio () {
        boolean campoVazio = true;
        
        if (this.nomeUserInput.getText().equals("") || this.nomeInput.getText().equals("") || this.senhaInput.getText().equals("")) {
            campoVazio = false;
        }
        
        return campoVazio;
    }
    
    private void cadastraCliente(Cliente novoCliente){
        this.conectar.conectaBanco(); 
        
        novoCliente.setNomeUser(nomeUserInput.getText());
        novoCliente.setSenha((String)senhaInput.getText());
        novoCliente.setNome(nomeInput.getText());
        novoCliente.setEmail(emailInput.getText());
        novoCliente.setCpf(cpfInput.getText());
        novoCliente.setCelular(celularInput.getText());
        novoCliente.setRua(ruaInput.getText());
        novoCliente.setNumero(numeroInput.getText());
        novoCliente.setBairro(bairroInput.getText());
        novoCliente.setCep(cepInput.getText());
        /*novoCliente.setAdm(false);*/
        
        try {
                        
            this.conectar.insertSQL("INSERT INTO clientes ("
                    + "nomeuser,"
                    + "senha,"
                    + "nome,"
                    + "email,"
                    + "cpf,"
                    + "celular,"
                    + "rua,"
                    + "numero,"
                    + "bairro,"
                    + "cep,"
                    + "adm"
                + ") VALUES ("
                    + "'" + novoCliente.getNomeUser()+ "',"
                    + "'" + novoCliente.getSenha()+ "',"
                    + "'" + novoCliente.getNome() + "',"
                    + "'" + novoCliente.getEmail()+ "',"
                    + "'" + novoCliente.getCpf() + "',"
                    + "'" + novoCliente.getCelular()+ "',"
                    + "'" + novoCliente.getRua()+ "',"
                    + "'" + novoCliente.getNumero()+ "',"
                    + "'" + novoCliente.getBairro()+ "',"
                    + "'" + novoCliente.getCep()+ "',"
                    + "false"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
            novoCliente.limpaCliente();
            //limparCamposCadastro();
        }                
    }
    
    private void limparCamposCadastro(){
        nomeUserInput.setText("");
        senhaInput.setText("");
        nomeInput.setText("");
        emailInput.setText("");
        cpfInput.setText("");
        celularInput.setText("");
        ruaInput.setText("");
        numeroInput.setText("");
        bairroInput.setText("");
        cepInput.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBranco = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        cpfInput = new javax.swing.JFormattedTextField();
        emailLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        ruaLabel = new javax.swing.JLabel();
        ruaInput = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroInput = new javax.swing.JTextField();
        celularLabel = new javax.swing.JLabel();
        celularInput = new javax.swing.JFormattedTextField();
        cepLabel = new javax.swing.JLabel();
        cepInput = new javax.swing.JFormattedTextField();
        senhaLabel = new javax.swing.JLabel();
        senhaInput = new javax.swing.JPasswordField();
        nomeUserLabel = new javax.swing.JLabel();
        nomeUserInput = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroInput = new javax.swing.JTextField();
        painelBrancoButton = new javax.swing.JPanel();
        icone = new javax.swing.JLabel();
        limparButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();

        setResizable(false);

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));
        painelBranco.setForeground(new java.awt.Color(0, 0, 0));

        nomeLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeLabel.setText("Nome:");

        cpfLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cpfLabel.setForeground(new java.awt.Color(0, 0, 0));
        cpfLabel.setText("CPF:");

        try {
            cpfInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        emailLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("E-mail:");

        ruaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        ruaLabel.setForeground(new java.awt.Color(0, 0, 0));
        ruaLabel.setText("Rua:");

        ruaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaInputActionPerformed(evt);
            }
        });

        numeroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        numeroLabel.setForeground(new java.awt.Color(0, 0, 0));
        numeroLabel.setText("Numero:");

        celularLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        celularLabel.setForeground(new java.awt.Color(0, 0, 0));
        celularLabel.setText("Celular:");

        try {
            celularInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cepLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cepLabel.setForeground(new java.awt.Color(0, 0, 0));
        cepLabel.setText("CEP:");

        try {
            cepInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        senhaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        senhaLabel.setText("Senha:");

        nomeUserLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeUserLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeUserLabel.setText("Nome de Usuario:");

        nomeUserInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        bairroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        bairroLabel.setForeground(new java.awt.Color(0, 0, 0));
        bairroLabel.setText("Bairro:");

        bairroInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        painelBrancoButton.setBackground(new java.awt.Color(255, 255, 255));

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farmacia_Logo.png"))); // NOI18N

        limparButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar.png"))); // NOI18N
        limparButton.setText("LIMPAR");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        salvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        salvarButton.setText("SALVAR");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBrancoButtonLayout = new javax.swing.GroupLayout(painelBrancoButton);
        painelBrancoButton.setLayout(painelBrancoButtonLayout);
        painelBrancoButtonLayout.setHorizontalGroup(
            painelBrancoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(icone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelBrancoButtonLayout.setVerticalGroup(
            painelBrancoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoButtonLayout.createSequentialGroup()
                .addGroup(painelBrancoButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBrancoButtonLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelBrancoButtonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(icone)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBrancoButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nomeInput, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomeUserInput))
                            .addComponent(nomeUserLabel))
                        .addGap(18, 18, 18)
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfInput)
                            .addGroup(painelBrancoLayout.createSequentialGroup()
                                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(senhaLabel)
                                    .addComponent(cpfLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(senhaInput)))
                    .addComponent(ruaLabel)
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addComponent(ruaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelBrancoLayout.createSequentialGroup()
                                .addComponent(numeroLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cepInput)))
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celularLabel)
                            .addComponent(cepLabel)))
                    .addComponent(bairroLabel)
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBrancoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelBrancoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel)
                    .addComponent(nomeUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addComponent(cpfLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(celularLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ruaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cepLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLabel)
                    .addComponent(bairroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBrancoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed

        limparCamposCadastro();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        
        if (checkCampoVazio()) {
            cadastraCliente(novoCliente);
        } else {
            JOptionPane.showMessageDialog(null, "Os campos: Nome de Usuario\nNome\nSenha\nSão obrigatorios!");
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void ruaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaInputActionPerformed
        
    }//GEN-LAST:event_ruaInputActionPerformed

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
            java.util.logging.Logger.getLogger(cadastro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro_Clientes().setVisible(true);
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
    private javax.swing.JFormattedTextField cpfInput;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel icone;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeUserInput;
    private javax.swing.JLabel nomeUserLabel;
    private javax.swing.JTextField numeroInput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelBrancoButton;
    private javax.swing.JTextField ruaInput;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JButton salvarButton;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
