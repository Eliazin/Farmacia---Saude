
package Interfaces_adm;

import Banco_de_dados.mySql;
import Objetos.Produto;
import javax.swing.JOptionPane;

public class tela_Prod_Deletar extends javax.swing.JFrame {

    mySql conectar = new mySql();
    Produto produto = new Produto();
    
    public tela_Prod_Deletar() {
        initComponents();
    }
    
    private void deletarProduto(Produto produto){
        this.conectar.conectaBanco();
        
        String consultaDescricao = this.descricaoInput.getText(); 
        
        try {            
            this.conectar.updateSQL(
                "DELETE FROM produtos "
                + " WHERE "
                    + "descricao = '" + consultaDescricao + "'"
                + ";"            
            );
            
        } catch (Exception e) {
            System.out.println("Erro ao deletar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao deletar produto");
        }finally{
            this.conectar.fechaBanco();
            limparCampos();
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso");            
        }     
    }
    
    private void consultarProduto(Produto produto){
        this.conectar.conectaBanco();
        
        String consultaDescricao = this.descricaoInput.getText();
                
        try {
            this.conectar.executarSQL(
                   "SELECT "              
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
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " descricao = '" + consultaDescricao + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){
                produto.setTipo(this.conectar.getResultSet().getString(1));
                produto.setFornecedor(this.conectar.getResultSet().getString(2));
                produto.setQtdeEstoqueMin(this.conectar.getResultSet().getInt(3));
                produto.setQtdeEstoque(this.conectar.getResultSet().getInt(4));
                produto.setDataFab(this.conectar.getResultSet().getString(5));
                produto.setDataVenc(this.conectar.getResultSet().getString(6));
                produto.setPrecoCusto(this.conectar.getResultSet().getFloat(7));
                produto.setPrecoVenda(this.conectar.getResultSet().getFloat(8));
                produto.setIcms(this.conectar.getResultSet().getFloat(9));
                produto.setLucro(this.conectar.getResultSet().getFloat(10));
                produto.setObservacao(this.conectar.getResultSet().getString(11));
           }
            
           if(produto.getDescricao().equals("")){
                JOptionPane.showMessageDialog(null, "Produto não encontrado!"); /*ERRO*/
           }
           
        } catch (Exception e) {            
            System.out.println("Erro ao buscar produto " +  e.getMessage()); /*ERRO*/
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto");
            
        }finally{
            tipoOutPut.setText(produto.getTipo());
            fornecedorOutput.setText(produto.getFornecedor());
            qtdeEstoqueMinOutput.setText(String.valueOf(produto.getQtdeEstoqueMin()));
            qtdeEstoqueOutput.setText(String.valueOf(produto.getQtdeEstoque()));
            dataFabOutput.setText(produto.getDataFab());
            dataVencOutput.setText(produto.getDataVenc());
            precoCustoOutput.setText(String.valueOf(produto.getPrecoCusto()));
            precoVendaOutput.setText(String.valueOf(produto.getPrecoVenda()));
            icmsOutput.setText(String.valueOf(produto.getIcms()));
            lucroOutput.setText(String.valueOf(produto.getLucro()));
            observacaoOutput.setText(produto.getObservacao());
            this.conectar.fechaBanco();   
            produto.limpaProduto();
        }               
    }
    
    private void limparCampos(){
        descricaoInput.setText("");
        tipoOutPut.setText("");
        fornecedorOutput.setText("");
        qtdeEstoqueMinOutput.setText("");
        qtdeEstoqueOutput.setText("");
        dataFabOutput.setText("");
        dataVencOutput.setText("");
        precoCustoOutput.setText("");
        precoVendaOutput.setText("");
        icmsOutput.setText("");
        lucroOutput.setText("");
        observacaoOutput.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        painelPrincipal = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        descricaoInput = new javax.swing.JTextField();
        deletarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        painelOutput = new javax.swing.JPanel();
        tipoLabel = new javax.swing.JLabel();
        tipoOutPut = new javax.swing.JTextField();
        fornecedorLabel = new javax.swing.JLabel();
        fornecedorOutput = new javax.swing.JTextField();
        qtdeEstoqueMinLabel = new javax.swing.JLabel();
        qtdeEstoqueMinOutput = new javax.swing.JTextField();
        qtdeEstoqueLabel = new javax.swing.JLabel();
        qtdeEstoqueOutput = new javax.swing.JTextField();
        dataFabLabel = new javax.swing.JLabel();
        dataFabOutput = new javax.swing.JFormattedTextField();
        dataVencLabel = new javax.swing.JLabel();
        dataVencOutput = new javax.swing.JFormattedTextField();
        precoCustoLabel = new javax.swing.JLabel();
        precoCustoOutput = new javax.swing.JTextField();
        precoVendaLabel = new javax.swing.JLabel();
        precoVendaOutput = new javax.swing.JTextField();
        icmsLabel = new javax.swing.JLabel();
        icmsOutput = new javax.swing.JTextField();
        lucroLabel = new javax.swing.JLabel();
        lucroOutput = new javax.swing.JTextField();
        rsCustoLabel = new javax.swing.JLabel();
        rsVendaLabel = new javax.swing.JLabel();
        rsIcmsLabel = new javax.swing.JLabel();
        rsLucroLabel = new javax.swing.JLabel();
        observacaoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacaoOutput = new javax.swing.JTextArea();
        procurarButton = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setTitle("DELETAR PRODUTOS");
        setResizable(false);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(0, 0));

        descricaoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        descricaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        descricaoLabel.setText("Descrição:");

        descricaoInput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N

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

        painelOutput.setBackground(new java.awt.Color(255, 255, 255));
        painelOutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tipoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        tipoLabel.setForeground(new java.awt.Color(0, 0, 0));
        tipoLabel.setText("Tipo:");

        tipoOutPut.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tipoOutPut.setEnabled(false);

        fornecedorLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        fornecedorLabel.setForeground(new java.awt.Color(0, 0, 0));
        fornecedorLabel.setText("Fornecedor:");

        fornecedorOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        fornecedorOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        fornecedorOutput.setEnabled(false);

        qtdeEstoqueMinLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        qtdeEstoqueMinLabel.setForeground(new java.awt.Color(0, 0, 0));
        qtdeEstoqueMinLabel.setText("Qtde. Estoque Min");

        qtdeEstoqueMinOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        qtdeEstoqueMinOutput.setEnabled(false);

        qtdeEstoqueLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        qtdeEstoqueLabel.setForeground(new java.awt.Color(0, 0, 0));
        qtdeEstoqueLabel.setText("Qtde. Estoque");

        qtdeEstoqueOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        qtdeEstoqueOutput.setEnabled(false);

        dataFabLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        dataFabLabel.setForeground(new java.awt.Color(0, 0, 0));
        dataFabLabel.setText("Data. Fabricação:");

        try {
            dataFabOutput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataFabOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        dataFabOutput.setEnabled(false);

        dataVencLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        dataVencLabel.setForeground(new java.awt.Color(0, 0, 0));
        dataVencLabel.setText("Data. Vencimento:");

        try {
            dataVencOutput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataVencOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        dataVencOutput.setEnabled(false);

        precoCustoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        precoCustoLabel.setForeground(new java.awt.Color(0, 0, 0));
        precoCustoLabel.setText("Preço Custo:");

        precoCustoOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        precoCustoOutput.setEnabled(false);

        precoVendaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        precoVendaLabel.setForeground(new java.awt.Color(0, 0, 0));
        precoVendaLabel.setText("Preço Venda:");

        precoVendaOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        precoVendaOutput.setEnabled(false);

        icmsLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        icmsLabel.setForeground(new java.awt.Color(0, 0, 0));
        icmsLabel.setText("ICMS:");

        icmsOutput.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        icmsOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        icmsOutput.setEnabled(false);

        lucroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        lucroLabel.setForeground(new java.awt.Color(0, 0, 0));
        lucroLabel.setText("Lucro:");

        lucroOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lucroOutput.setEnabled(false);

        rsCustoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsCustoLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsCustoLabel.setText("R$: ");

        rsVendaLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsVendaLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsVendaLabel.setText("R$: ");

        rsIcmsLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsIcmsLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsIcmsLabel.setText("R$: ");

        rsLucroLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        rsLucroLabel.setForeground(new java.awt.Color(0, 0, 0));
        rsLucroLabel.setText("R$: ");

        observacaoLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        observacaoLabel.setForeground(new java.awt.Color(0, 0, 0));
        observacaoLabel.setText("Observações:");

        observacaoOutput.setColumns(20);
        observacaoOutput.setRows(5);
        observacaoOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        observacaoOutput.setEnabled(false);
        jScrollPane1.setViewportView(observacaoOutput);

        javax.swing.GroupLayout painelOutputLayout = new javax.swing.GroupLayout(painelOutput);
        painelOutput.setLayout(painelOutputLayout);
        painelOutputLayout.setHorizontalGroup(
            painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelOutputLayout.createSequentialGroup()
                        .addComponent(rsVendaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataVencLabel)
                            .addComponent(dataVencOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelOutputLayout.createSequentialGroup()
                        .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painelOutputLayout.createSequentialGroup()
                                .addComponent(tipoLabel)
                                .addGap(250, 250, 250))
                            .addComponent(tipoOutPut)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelOutputLayout.createSequentialGroup()
                                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(precoCustoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(qtdeEstoqueOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(qtdeEstoqueLabel)
                                        .addComponent(precoVendaLabel)))
                                .addGap(30, 30, 30)
                                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelOutputLayout.createSequentialGroup()
                                        .addComponent(rsCustoLabel)
                                        .addGap(6, 6, 6)
                                        .addComponent(precoVendaOutput))
                                    .addComponent(precoCustoLabel)
                                    .addComponent(qtdeEstoqueMinLabel)
                                    .addComponent(qtdeEstoqueMinOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelOutputLayout.createSequentialGroup()
                                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(icmsLabel)
                                    .addGroup(painelOutputLayout.createSequentialGroup()
                                        .addComponent(rsIcmsLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(icmsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelOutputLayout.createSequentialGroup()
                                        .addComponent(rsLucroLabel)
                                        .addGap(7, 7, 7)
                                        .addComponent(lucroOutput))
                                    .addComponent(lucroLabel)))
                            .addGroup(painelOutputLayout.createSequentialGroup()
                                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataFabLabel)
                                    .addComponent(dataFabOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fornecedorOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fornecedorLabel))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelOutputLayout.createSequentialGroup()
                        .addComponent(observacaoLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelOutputLayout.setVerticalGroup(
            painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLabel)
                    .addComponent(fornecedorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorOutput)
                    .addComponent(tipoOutPut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdeEstoqueMinLabel)
                    .addComponent(qtdeEstoqueLabel)
                    .addComponent(dataFabLabel)
                    .addComponent(dataVencLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdeEstoqueMinOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdeEstoqueOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFabOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataVencOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoCustoLabel)
                    .addComponent(precoVendaLabel)
                    .addComponent(icmsLabel)
                    .addComponent(lucroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rsCustoLabel)
                    .addComponent(precoCustoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsVendaLabel)
                    .addComponent(rsIcmsLabel)
                    .addComponent(icmsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsLucroLabel)
                    .addComponent(lucroOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoVendaOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(observacaoLabel)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        procurarButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        procurarButton.setText("Procurar");
        procurarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(descricaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(procurarButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(deletarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(descricaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descricaoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(procurarButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void deletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonActionPerformed
        deletarProduto(produto);
    }//GEN-LAST:event_deletarButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        limparCampos();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void procurarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarButtonActionPerformed
        consultarProduto(produto);
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
            java.util.logging.Logger.getLogger(tela_Prod_Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Prod_Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Prod_Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Prod_Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new tela_Prod_Deletar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dataFabLabel;
    private javax.swing.JFormattedTextField dataFabOutput;
    private javax.swing.JLabel dataVencLabel;
    private javax.swing.JFormattedTextField dataVencOutput;
    private javax.swing.JButton deletarButton;
    private javax.swing.JTextField descricaoInput;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JLabel fornecedorLabel;
    private javax.swing.JTextField fornecedorOutput;
    private javax.swing.JLabel icmsLabel;
    private javax.swing.JTextField icmsOutput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel lucroLabel;
    private javax.swing.JTextField lucroOutput;
    private javax.swing.JLabel observacaoLabel;
    private javax.swing.JTextArea observacaoOutput;
    private javax.swing.JPanel painelOutput;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JLabel precoCustoLabel;
    private javax.swing.JTextField precoCustoOutput;
    private javax.swing.JLabel precoVendaLabel;
    private javax.swing.JTextField precoVendaOutput;
    private javax.swing.JButton procurarButton;
    private javax.swing.JLabel qtdeEstoqueLabel;
    private javax.swing.JLabel qtdeEstoqueMinLabel;
    private javax.swing.JTextField qtdeEstoqueMinOutput;
    private javax.swing.JTextField qtdeEstoqueOutput;
    private javax.swing.JLabel rsCustoLabel;
    private javax.swing.JLabel rsIcmsLabel;
    private javax.swing.JLabel rsLucroLabel;
    private javax.swing.JLabel rsVendaLabel;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JTextField tipoOutPut;
    // End of variables declaration//GEN-END:variables
}
