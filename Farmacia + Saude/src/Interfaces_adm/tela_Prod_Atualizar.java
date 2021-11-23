
package Interfaces_adm;

import Banco_de_dados.mySql;
import Objetos.Produto;
import javax.swing.JOptionPane;

public class tela_Prod_Atualizar extends javax.swing.JFrame {

    mySql conectar = new mySql();
    Produto produto = new Produto();
    
    public tela_Prod_Atualizar() {
        initComponents();
    }
    
    public void atualizarProduto(Produto produto){
        this.conectar.conectaBanco();
        
        String consultaDescricao = this.descricaoInput.getText();
        
        try {
            this.conectar.updateSQL(
                "UPDATE produtos SET "                    
                    + "tipo = '" + tipoInput.getSelectedItem() + "',"
                    + "fornecedor = '" + fornecedorInput.getText() + "',"
                    + "qtd_estoque_min = '" + converterInt(qtdeEstoqueMinInput.getText()) + "',"
                    + "qtde_estoque = '" + converterInt(qtdeEstoqueInput.getText()) + "',"
                    + "data_fab = '" + dataFabInput.getText() + "',"
                    + "data_venc = '" + dataVencInput.getText() + "',"
                    + "preco_custo = '" + precoCustoInput.getText() + "',"
                    + "preco_venda = '" + precoVendaInput.getText() + "',"
                    + "icms = '" + icmsInput.getText() + "',"
                    + "observacao = '" + observacaoInput.getText() + "'"
                + " WHERE "
                    + "descricao = '" + consultaDescricao + "'"
                + ";"
            );
        }catch(Exception e){
            System.out.println("Erro ao atualizar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto");
        }finally{
            this.conectar.fechaBanco();
            limparCampos();
            produto.limpaProduto();
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso");
        }
    }
    
    public boolean checkCampoVazio () {
        boolean campoVazio = true;
        
        if (this.dataFabInput.getText().equals("    -  -  ") || 
            this.dataVencInput.getText().equals("    -  -  ") ||
            this.precoVendaInput.getText().equals("") ||
            this.precoCustoInput.getText().equals("") ||
            this.icmsInput.getText().equals("")) {
            campoVazio = false;
        }
        
        return campoVazio;
    }
    
    private int converterInt(String valor){
        if(!valor.equals("")){
            return Integer.parseInt(valor);
        }
        
        return 0;
    }
    
    private void limparCampos(){
        descricaoInput.setText("");
        fornecedorInput.setText("");
        qtdeEstoqueMinInput.setText("");
        qtdeEstoqueInput.setText("");
        dataFabInput.setText("");
        dataVencInput.setText("");
        precoVendaInput.setText("");
        precoCustoInput.setText("");
        icmsInput.setText("");
        lucroOutput.setText("");
        observacaoInput.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        painelPrincipal = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        descricaoInput = new javax.swing.JTextField();
        atualizarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        painelInput = new javax.swing.JPanel();
        tipoLabel = new javax.swing.JLabel();
        tipoInput = new javax.swing.JComboBox<>();
        fornecedorLabel = new javax.swing.JLabel();
        fornecedorInput = new javax.swing.JTextField();
        qtdeEstoqueLabel = new javax.swing.JLabel();
        qtdeEstoqueInput = new javax.swing.JTextField();
        qtdeEstoqueMinLabel = new javax.swing.JLabel();
        qtdeEstoqueMinInput = new javax.swing.JTextField();
        dataFabLabel = new javax.swing.JLabel();
        dataFabInput = new javax.swing.JFormattedTextField();
        dataVencLabel = new javax.swing.JLabel();
        dataVencInput = new javax.swing.JFormattedTextField();
        precoVendaLabel = new javax.swing.JLabel();
        precoVendaInput = new javax.swing.JTextField();
        precoCustoLabel = new javax.swing.JLabel();
        precoCustoInput = new javax.swing.JTextField();
        icmsLabel = new javax.swing.JLabel();
        icmsInput = new javax.swing.JTextField();
        lucroLabel = new javax.swing.JLabel();
        lucroOutput = new javax.swing.JTextField();
        rsVendaLabel = new javax.swing.JLabel();
        rsCustoLabel = new javax.swing.JLabel();
        rsIcmsLabel = new javax.swing.JLabel();
        rsLucroLabel = new javax.swing.JLabel();
        observacaoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacaoInput = new javax.swing.JTextArea();

        jToolBar1.setRollover(true);

        setTitle("ATUALIZAÇÃO DE PRODUTOS");
        setResizable(false);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));

        descricaoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        descricaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        descricaoLabel.setText("Descrição:");

        descricaoInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

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

        painelInput.setBackground(new java.awt.Color(255, 255, 255));
        painelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tipoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        tipoLabel.setForeground(new java.awt.Color(0, 0, 0));
        tipoLabel.setText("Tipo:");

        tipoInput.setBackground(new java.awt.Color(255, 255, 255));
        tipoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antibioticos", "Cosmeticos", "Fraldas" }));

        fornecedorLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        fornecedorLabel.setForeground(new java.awt.Color(0, 0, 0));
        fornecedorLabel.setText("Fornecedor:");

        fornecedorInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        fornecedorInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        qtdeEstoqueLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        qtdeEstoqueLabel.setForeground(new java.awt.Color(0, 0, 0));
        qtdeEstoqueLabel.setText("Qtde. Estoque");

        qtdeEstoqueInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        qtdeEstoqueMinLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        qtdeEstoqueMinLabel.setForeground(new java.awt.Color(0, 0, 0));
        qtdeEstoqueMinLabel.setText("Qtde. Estoque Min");

        qtdeEstoqueMinInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        dataFabLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        dataFabLabel.setForeground(new java.awt.Color(0, 0, 0));
        dataFabLabel.setText("Data. Fabricação:");

        try {
            dataFabInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataFabInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        dataVencLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        dataVencLabel.setForeground(new java.awt.Color(0, 0, 0));
        dataVencLabel.setText("Data. Vencimento:");

        try {
            dataVencInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataVencInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        precoVendaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        precoVendaLabel.setForeground(new java.awt.Color(0, 0, 0));
        precoVendaLabel.setText("Preço Venda:");

        precoVendaInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        precoCustoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        precoCustoLabel.setForeground(new java.awt.Color(0, 0, 0));
        precoCustoLabel.setText("Preço Custo:");

        precoCustoInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        icmsLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        icmsLabel.setForeground(new java.awt.Color(0, 0, 0));
        icmsLabel.setText("ICMS:");

        icmsInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        icmsInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        lucroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        lucroLabel.setForeground(new java.awt.Color(0, 0, 0));
        lucroLabel.setText("Lucro:");

        lucroOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lucroOutput.setEnabled(false);

        rsVendaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsVendaLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsVendaLabel.setText("R$: ");

        rsCustoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsCustoLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsCustoLabel.setText("R$: ");

        rsIcmsLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsIcmsLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsIcmsLabel.setText("R$: ");

        rsLucroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsLucroLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsLucroLabel.setText("R$: ");

        observacaoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        observacaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        observacaoLabel.setText("Observações:");

        observacaoInput.setColumns(20);
        observacaoInput.setRows(5);
        observacaoInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(observacaoInput);

        javax.swing.GroupLayout painelInputLayout = new javax.swing.GroupLayout(painelInput);
        painelInput.setLayout(painelInputLayout);
        painelInputLayout.setHorizontalGroup(
            painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelInputLayout.createSequentialGroup()
                        .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rsVendaLabel)
                            .addComponent(qtdeEstoqueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataVencLabel)
                            .addComponent(dataVencInput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelInputLayout.createSequentialGroup()
                        .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelInputLayout.createSequentialGroup()
                                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(precoVendaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(painelInputLayout.createSequentialGroup()
                                            .addComponent(precoVendaLabel)
                                            .addGap(58, 58, 58)))
                                    .addComponent(qtdeEstoqueInput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelInputLayout.createSequentialGroup()
                                        .addComponent(rsCustoLabel)
                                        .addGap(6, 6, 6)
                                        .addComponent(precoCustoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(precoCustoLabel)
                                    .addComponent(qtdeEstoqueMinLabel)
                                    .addComponent(qtdeEstoqueMinInput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tipoLabel)
                            .addComponent(tipoInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelInputLayout.createSequentialGroup()
                                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(icmsLabel)
                                    .addGroup(painelInputLayout.createSequentialGroup()
                                        .addComponent(rsIcmsLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(icmsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelInputLayout.createSequentialGroup()
                                        .addComponent(rsLucroLabel)
                                        .addGap(7, 7, 7)
                                        .addComponent(lucroOutput))
                                    .addComponent(lucroLabel)))
                            .addGroup(painelInputLayout.createSequentialGroup()
                                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataFabLabel)
                                    .addComponent(dataFabInput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fornecedorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fornecedorLabel))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelInputLayout.createSequentialGroup()
                        .addComponent(observacaoLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelInputLayout.setVerticalGroup(
            painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLabel)
                    .addComponent(fornecedorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorInput)
                    .addComponent(tipoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdeEstoqueLabel)
                    .addComponent(dataFabLabel)
                    .addComponent(dataVencLabel)
                    .addComponent(qtdeEstoqueMinLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataFabInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataVencInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdeEstoqueMinInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdeEstoqueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoCustoLabel)
                    .addComponent(precoVendaLabel)
                    .addComponent(icmsLabel)
                    .addComponent(lucroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rsCustoLabel)
                    .addComponent(precoVendaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsVendaLabel)
                    .addComponent(rsIcmsLabel)
                    .addComponent(icmsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsLucroLabel)
                    .addComponent(lucroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoCustoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(observacaoLabel)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(descricaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoInput))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(descricaoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
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
            atualizarProduto(produto);
        } else {
            JOptionPane.showMessageDialog(null, " Os campos: "
                                        + "\n Data. Fabricação\n Data. Vencimento\n Preço. Venda"
                                           + "\n Preço. Custo\n ICMS\n São obrigatorios!");
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
            java.util.logging.Logger.getLogger(tela_Prod_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Prod_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Prod_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Prod_Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new tela_Prod_Atualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JFormattedTextField dataFabInput;
    private javax.swing.JLabel dataFabLabel;
    private javax.swing.JFormattedTextField dataVencInput;
    private javax.swing.JLabel dataVencLabel;
    private javax.swing.JTextField descricaoInput;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField fornecedorInput;
    private javax.swing.JLabel fornecedorLabel;
    private javax.swing.JTextField icmsInput;
    private javax.swing.JLabel icmsLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel lucroLabel;
    private javax.swing.JTextField lucroOutput;
    private javax.swing.JTextArea observacaoInput;
    private javax.swing.JLabel observacaoLabel;
    private javax.swing.JPanel painelInput;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField precoCustoInput;
    private javax.swing.JLabel precoCustoLabel;
    private javax.swing.JTextField precoVendaInput;
    private javax.swing.JLabel precoVendaLabel;
    private javax.swing.JTextField qtdeEstoqueInput;
    private javax.swing.JLabel qtdeEstoqueLabel;
    private javax.swing.JTextField qtdeEstoqueMinInput;
    private javax.swing.JLabel qtdeEstoqueMinLabel;
    private javax.swing.JLabel rsCustoLabel;
    private javax.swing.JLabel rsIcmsLabel;
    private javax.swing.JLabel rsLucroLabel;
    private javax.swing.JLabel rsVendaLabel;
    private javax.swing.JComboBox<String> tipoInput;
    private javax.swing.JLabel tipoLabel;
    // End of variables declaration//GEN-END:variables
}
