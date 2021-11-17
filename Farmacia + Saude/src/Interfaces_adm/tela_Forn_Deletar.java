
package Interfaces_adm;

import Banco_de_dados.mySql;
import Objetos.Fornecedor;
import javax.swing.JOptionPane;

public class tela_Forn_Deletar extends javax.swing.JFrame {

    mySql conectar = new mySql();
    Fornecedor fornecedor = new Fornecedor();
    
    private void deletarFornecedor(Fornecedor fornecedor){
        this.conectar.conectaBanco();
        
        String consultaCnpj = this.cnpjInput.getText(); 
        
        try {            
            this.conectar.updateSQL(
                "DELETE FROM fornecedores "
                + " WHERE "
                    + "cnpj = '" + consultaCnpj + "'"
                + ";"            
            );
            
        } catch (Exception e) {
            System.out.println("Erro ao deletar fornecedor " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao deletar fornecedor");
        }finally{
            this.conectar.fechaBanco();
            limparCampos();
            JOptionPane.showMessageDialog(null, "Fornecedor deletado com sucesso");            
        }     
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
    
    public tela_Forn_Deletar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        deletarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        cnpjLabel = new javax.swing.JLabel();
        cnpjInput = new javax.swing.JFormattedTextField();
        procurarButton = new javax.swing.JButton();
        painelSec = new javax.swing.JPanel();
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

        setTitle("DELETAR FORNECEDORES");
        setResizable(false);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(654, 450));

        deletarButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        deletarButton.setText("DELETAR");
        deletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarButtonActionPerformed(evt);
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

        cnpjLabel.setForeground(new java.awt.Color(0, 0, 0));
        cnpjLabel.setText("CNPJ:");

        try {
            cnpjInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        procurarButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        procurarButton.setText("Procurar");
        procurarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarButtonActionPerformed(evt);
            }
        });

        painelSec.setBackground(new java.awt.Color(255, 255, 255));
        painelSec.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelSec.setForeground(new java.awt.Color(0, 0, 0));

        fonecedorLabel.setForeground(new java.awt.Color(0, 0, 0));
        fonecedorLabel.setText("Fornecedor:");

        fornecedorOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        fornecedorOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fornecedorOutput.setEnabled(false);

        nomeFantLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeFantLabel.setText("Nome Fantasia:");

        nomeFantOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        nomeFantOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nomeFantOutput.setEnabled(false);

        inscEstadualLabel.setForeground(new java.awt.Color(0, 0, 0));
        inscEstadualLabel.setText("Inscrição Estadual:");

        inscEstadualOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        inscEstadualOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        inscEstadualOutput.setEnabled(false);

        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("E-mail:");

        emailOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        emailOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        emailOutput.setEnabled(false);

        celularLabel.setForeground(new java.awt.Color(0, 0, 0));
        celularLabel.setText("Celular:");

        try {
            celularOutput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ##### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        celularOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        celularOutput.setEnabled(false);

        telefoneLabel.setForeground(new java.awt.Color(0, 0, 0));
        telefoneLabel.setText("Telefone:");

        telefoneOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        telefoneOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        telefoneOutput.setEnabled(false);

        enderecoLabel.setForeground(new java.awt.Color(0, 0, 0));
        enderecoLabel.setText("Endereço:");

        enderecoOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        enderecoOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        enderecoOutput.setEnabled(false);

        numeroLabel.setForeground(new java.awt.Color(0, 0, 0));
        numeroLabel.setText("Numero:");

        numeroOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        numeroOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        numeroOutput.setEnabled(false);

        bairroLabel.setForeground(new java.awt.Color(0, 0, 0));
        bairroLabel.setText("Bairro:");

        bairroOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        bairroOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        bairroOutput.setEnabled(false);

        cidadeLabel.setForeground(new java.awt.Color(0, 0, 0));
        cidadeLabel.setText("Cidade:");

        cidadeOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cidadeOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cidadeOutput.setEnabled(false);

        ufLabel.setForeground(new java.awt.Color(0, 0, 0));
        ufLabel.setText("UF:");

        ufOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        ufOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ufOutput.setEnabled(false);

        cepLabel.setForeground(new java.awt.Color(0, 0, 0));
        cepLabel.setText("CEP:");

        try {
            cepOutput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cepOutput.setEnabled(false);

        javax.swing.GroupLayout painelSecLayout = new javax.swing.GroupLayout(painelSec);
        painelSec.setLayout(painelSecLayout);
        painelSecLayout.setHorizontalGroup(
            painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSecLayout.createSequentialGroup()
                        .addComponent(celularOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telefoneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelSecLayout.createSequentialGroup()
                        .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelSecLayout.createSequentialGroup()
                                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fornecedorOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fonecedorLabel))
                                .addGap(18, 18, 18)
                                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeFantLabel)
                                    .addComponent(nomeFantOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelSecLayout.createSequentialGroup()
                                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inscEstadualLabel)
                                    .addComponent(inscEstadualOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celularLabel))
                                .addGap(32, 32, 32)
                                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneLabel)
                                    .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailOutput)
                                        .addComponent(emailLabel))))
                            .addGroup(painelSecLayout.createSequentialGroup()
                                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enderecoLabel)
                                    .addComponent(enderecoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadeLabel)
                                    .addComponent(cidadeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelSecLayout.createSequentialGroup()
                                        .addComponent(numeroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bairroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelSecLayout.createSequentialGroup()
                                        .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelSecLayout.createSequentialGroup()
                                                .addComponent(ufLabel)
                                                .addGap(61, 61, 61)
                                                .addComponent(cepLabel))
                                            .addGroup(painelSecLayout.createSequentialGroup()
                                                .addComponent(numeroLabel)
                                                .addGap(30, 30, 30)
                                                .addComponent(bairroLabel)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(painelSecLayout.createSequentialGroup()
                                        .addComponent(ufOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cepOutput)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSecLayout.setVerticalGroup(
            painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fonecedorLabel)
                    .addComponent(nomeFantLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeFantOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscEstadualLabel)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscEstadualOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularLabel)
                    .addComponent(telefoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroLabel)
                    .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enderecoLabel)
                        .addComponent(bairroLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeLabel)
                    .addComponent(ufLabel)
                    .addComponent(cepLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(deletarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(cnpjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cnpjInput)
                .addGap(18, 18, 18)
                .addComponent(procurarButton)
                .addGap(88, 88, 88))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cnpjInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cnpjLabel)
                        .addComponent(procurarButton)))
                .addGap(18, 18, 18)
                .addComponent(painelSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
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

    private void deletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonActionPerformed
        deletarFornecedor(fornecedor);
    }//GEN-LAST:event_deletarButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        limparCampos();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void procurarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarButtonActionPerformed
        consultarFornecedor(fornecedor);
    }//GEN-LAST:event_procurarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(tela_Forn_Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Forn_Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Forn_Deletar().setVisible(true);
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
    private javax.swing.JButton deletarButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailOutput;
    private javax.swing.JLabel enderecoLabel;
    private javax.swing.JTextField enderecoOutput;
    private javax.swing.JLabel fonecedorLabel;
    private javax.swing.JTextField fornecedorOutput;
    private javax.swing.JLabel inscEstadualLabel;
    private javax.swing.JTextField inscEstadualOutput;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel nomeFantLabel;
    private javax.swing.JTextField nomeFantOutput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroOutput;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSec;
    private javax.swing.JButton procurarButton;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField telefoneOutput;
    private javax.swing.JLabel ufLabel;
    private javax.swing.JTextField ufOutput;
    // End of variables declaration//GEN-END:variables
}
