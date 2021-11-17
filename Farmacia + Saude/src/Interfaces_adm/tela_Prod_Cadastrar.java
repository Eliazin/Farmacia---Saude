
package Interfaces_adm;

import Banco_de_dados.mySql;
import Objetos.Produto;
import javax.swing.JOptionPane;

public class tela_Prod_Cadastrar extends javax.swing.JFrame {

    mySql conectar = new mySql();
    Produto novoProduto = new Produto();
    
    public tela_Prod_Cadastrar() {
        initComponents();
    }
    
    public boolean checkCampoVazio () {
        boolean campoVazio = true;
        
        if (this.descricaoInput.getText().equals("") || 
            this.precoVendaInput.getText().equals("") ||
            this.precoCustoInput.getText().equals("") ||
            this.icmsInput.getText().equals("")) {
            campoVazio = false;
        }
        
        return campoVazio;
    }
    
    private void cadastraProduto(Produto novoProduto){
        this.conectar.conectaBanco(); 
        
        novoProduto.setDescricao(descricaoInput.getText());
        novoProduto.setTipo((String) tipoInput.getSelectedItem());
        novoProduto.setFornecedor(fornecedorInput.getText());
        novoProduto.setQtdeEstoqueMin(Integer.parseInt(qtdeEstoqueMinInput.getText()));
        novoProduto.setQtdeEstoque(Integer.parseInt(qtdeEstoqueInput.getText()));
        novoProduto.setDataFab(dataFabInput.getText());
        novoProduto.setDataVenc(dataVencInput.getText());
        novoProduto.setPrecoCusto(Integer.parseInt(precoCustoInput.getText()));
        novoProduto.setPrecoVenda(Integer.parseInt(precoVendaInput.getText()));
        novoProduto.setIcms(Integer.parseInt(icmsInput.getText()));
        novoProduto.setLucro(Integer.parseInt(lucroInput.getText()));
        novoProduto.setObservacao((String) observacaoInput.getToolTipText());
        
        try {
                        
            this.conectar.insertSQL("INSERT INTO produtos ("
                    + "descricao,"
                    + "tipo,"
                    + "fornecedor,"
                    + "qtd_estoque_min,"
                    + "qtde_estoque,"
                    + "data_fab,"
                    + "data_venc,"
                    + "preco_custo,"
                    + "preco_venda,"
                    + "icms,"
                    + "lucro,"
                    + "observacao"
                + ") VALUES ("
                    + "'" + novoProduto.getDescricao()+ "',"
                    + "'" + novoProduto.getTipo()+ "',"
                    + "'" + novoProduto.getFornecedor()+ "',"
                    + novoProduto.getQtdeEstoqueMin()+ ","
                    + novoProduto.getQtdeEstoque()+ ","
                    + "'" + novoProduto.getDataFab()+ "',"
                    + "'" + novoProduto.getDataVenc()+ "',"
                    + novoProduto.getPrecoCusto()+ ","
                    + novoProduto.getPrecoVenda()+ ","
                    + novoProduto.getIcms()+ ","
                    + novoProduto.getLucro() + ","
                    + "'" + novoProduto.getObservacao()+ "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
            novoProduto.limpaFornecedor();
            limparCamposCadastro();
        }                
    }
    
    private void limparCamposCadastro(){
        descricaoInput.setText("");
        fornecedorInput.setText("");
        qtdeEstoqueMinInput.setText("");
        qtdeEstoqueInput.setText("");
        dataFabInput.setText("");
        dataVencInput.setText("");
        precoCustoInput.setText("");
        precoVendaInput.setText("");
        icmsInput.setText("");
        lucroInput.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        descricaoInput = new javax.swing.JTextField();
        tipoLabel = new javax.swing.JLabel();
        tipoInput = new javax.swing.JComboBox<>();
        fornecedorLabel = new javax.swing.JLabel();
        fornecedorInput = new javax.swing.JTextField();
        qtdeEstoqueMinLabel = new javax.swing.JLabel();
        qtdeEstoqueMinInput = new javax.swing.JTextField();
        qtdeEstoqueLabel = new javax.swing.JLabel();
        qtdeEstoqueInput = new javax.swing.JTextField();
        dataFabLabel = new javax.swing.JLabel();
        dataFabInput = new javax.swing.JFormattedTextField();
        dataVencLabel = new javax.swing.JLabel();
        dataVencInput = new javax.swing.JFormattedTextField();
        precoCustoLabel = new javax.swing.JLabel();
        precoCustoInput = new javax.swing.JTextField();
        rsCustoLabel = new javax.swing.JLabel();
        precoVendaLabel = new javax.swing.JLabel();
        precoVendaInput = new javax.swing.JTextField();
        rsVendaLabel = new javax.swing.JLabel();
        icmsLabel = new javax.swing.JLabel();
        icmsInput = new javax.swing.JTextField();
        rsIcmsLabel = new javax.swing.JLabel();
        lucroLabel = new javax.swing.JLabel();
        lucroInput = new javax.swing.JTextField();
        rsLucroLabel = new javax.swing.JLabel();
        observacaoLabel = new javax.swing.JLabel();
        observacaoInput = new javax.swing.JScrollPane();
        txtEndereco = new javax.swing.JTextArea();
        salvarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();

        setTitle("CADASTRO DE PRODUTOS");
        setResizable(false);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));

        descricaoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        descricaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        descricaoLabel.setText("Descrição:");

        descricaoInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        tipoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        tipoLabel.setForeground(new java.awt.Color(0, 0, 0));
        tipoLabel.setText("Tipo:");

        tipoInput.setBackground(new java.awt.Color(255, 255, 255));
        tipoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antibioticos", "Cosmeticos", "Fraldas" }));

        fornecedorLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        fornecedorLabel.setForeground(new java.awt.Color(0, 0, 0));
        fornecedorLabel.setText("Fornecedor:");

        fornecedorInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        qtdeEstoqueMinLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        qtdeEstoqueMinLabel.setForeground(new java.awt.Color(0, 0, 0));
        qtdeEstoqueMinLabel.setText("Qtde. Estoque Min");

        qtdeEstoqueLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        qtdeEstoqueLabel.setForeground(new java.awt.Color(0, 0, 0));
        qtdeEstoqueLabel.setText("Qtde. Estoque");

        dataFabLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        dataFabLabel.setForeground(new java.awt.Color(0, 0, 0));
        dataFabLabel.setText("Data. Fabricação:");

        try {
            dataFabInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        dataVencLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        dataVencLabel.setForeground(new java.awt.Color(0, 0, 0));
        dataVencLabel.setText("Data. Vencimento:");

        try {
            dataVencInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        precoCustoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        precoCustoLabel.setForeground(new java.awt.Color(0, 0, 0));
        precoCustoLabel.setText("Preço Custo:");

        rsCustoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsCustoLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsCustoLabel.setText("R$: ");

        precoVendaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        precoVendaLabel.setForeground(new java.awt.Color(0, 0, 0));
        precoVendaLabel.setText("Preço Venda:");

        rsVendaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsVendaLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsVendaLabel.setText("R$: ");

        icmsLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        icmsLabel.setForeground(new java.awt.Color(0, 0, 0));
        icmsLabel.setText("ICMS:");

        icmsInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

        rsIcmsLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsIcmsLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsIcmsLabel.setText("R$: ");

        lucroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        lucroLabel.setForeground(new java.awt.Color(0, 0, 0));
        lucroLabel.setText("Lucro:");

        rsLucroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsLucroLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsLucroLabel.setText("R$: ");

        observacaoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        observacaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        observacaoLabel.setText("Observações:");

        txtEndereco.setColumns(20);
        txtEndereco.setRows(5);
        observacaoInput.setViewportView(txtEndereco);

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
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(rsCustoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precoCustoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rsVendaLabel))
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtdeEstoqueMinInput, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precoCustoLabel))
                                .addGap(18, 18, 18)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precoVendaLabel)
                                    .addComponent(qtdeEstoqueLabel)
                                    .addComponent(qtdeEstoqueInput, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                            .addComponent(tipoInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fornecedorInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(icmsLabel)
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(rsIcmsLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(icmsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(lucroLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(rsLucroLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lucroInput))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(dataFabLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(dataFabInput)
                                        .addGap(31, 31, 31)))
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(dataVencLabel)
                                        .addGap(36, 36, 36))
                                    .addComponent(dataVencInput)))))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoLabel)
                            .addComponent(descricaoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoLabel)
                                    .addComponent(qtdeEstoqueMinLabel))
                                .addGap(245, 245, 245)
                                .addComponent(fornecedorLabel))
                            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(precoVendaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelPrincipalLayout.createSequentialGroup()
                                    .addComponent(observacaoLabel)
                                    .addGap(217, 217, 217))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(observacaoInput)
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(descricaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(descricaoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLabel)
                    .addComponent(fornecedorLabel))
                .addGap(6, 6, 6)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fornecedorInput)
                    .addComponent(tipoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdeEstoqueMinLabel)
                    .addComponent(qtdeEstoqueLabel)
                    .addComponent(dataFabLabel)
                    .addComponent(dataVencLabel))
                .addGap(6, 6, 6)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdeEstoqueMinInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdeEstoqueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFabInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataVencInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoCustoLabel)
                    .addComponent(icmsLabel)
                    .addComponent(precoVendaLabel)
                    .addComponent(lucroLabel))
                .addGap(5, 5, 5)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icmsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsCustoLabel)
                    .addComponent(precoCustoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsVendaLabel)
                    .addComponent(precoVendaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsIcmsLabel)
                    .addComponent(rsLucroLabel)
                    .addComponent(lucroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(observacaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(observacaoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
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
            cadastraProduto(novoProduto);
        } else {
            JOptionPane.showMessageDialog(null, " Os campos:\n Descrição\n Preço. Venda"
                    + "\n Preço. Custo\n ICMS\n São obrigatorios!");
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
            java.util.logging.Logger.getLogger(tela_Prod_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Prod_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Prod_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Prod_Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Prod_Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField lucroInput;
    private javax.swing.JLabel lucroLabel;
    private javax.swing.JScrollPane observacaoInput;
    private javax.swing.JLabel observacaoLabel;
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
    private javax.swing.JButton salvarButton;
    private javax.swing.JComboBox<String> tipoInput;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JTextArea txtEndereco;
    // End of variables declaration//GEN-END:variables
}
