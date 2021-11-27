
package Interfaces_adm;

import Interfaces.cadastro_Clientes;

public class tela_Menu extends javax.swing.JFrame {
    
    cadastro_Clientes   telaCliCadastro     = new cadastro_Clientes();
    tela_Cli_Consultar  telaCliConsultar    = new tela_Cli_Consultar();
    tela_Cli_Atualizar  telaCliAtualizar    = new tela_Cli_Atualizar();
    tela_Cli_Deletar    telaCliDeletar      = new tela_Cli_Deletar();
    tela_Forn_Cadastrar telaFornCadastrar   = new tela_Forn_Cadastrar();
    tela_Forn_Consultar telaFornConsultar   = new tela_Forn_Consultar();
    tela_Forn_Atualizar telaFornAtualizar   = new tela_Forn_Atualizar();
    tela_Forn_Deletar   telaFornDeletar     = new tela_Forn_Deletar();
    tela_Prod_Cadastrar telaProdCadastrar   = new tela_Prod_Cadastrar();
    tela_Prod_Consultar telaProdConsultar   = new tela_Prod_Consultar();
    tela_Prod_Atualizar telaProdAtualizar   = new tela_Prod_Atualizar();
    
    public tela_Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBranco = new javax.swing.JPanel();
        painelClientes = new javax.swing.JPanel();
        cadastrarCliButton1 = new javax.swing.JButton();
        consultarCliButton1 = new javax.swing.JButton();
        atualizarCliButton1 = new javax.swing.JButton();
        deletarCliButton1 = new javax.swing.JButton();
        clientesLabel = new javax.swing.JLabel();
        painelFornecedores = new javax.swing.JPanel();
        fornecedoresLabel = new javax.swing.JLabel();
        cadastrarFornButton2 = new javax.swing.JButton();
        consultarFornButton2 = new javax.swing.JButton();
        atualizarFornButton2 = new javax.swing.JButton();
        deletarFornButton2 = new javax.swing.JButton();
        painelProdutos = new javax.swing.JPanel();
        cadastrarProdButton = new javax.swing.JButton();
        consultarProdButton = new javax.swing.JButton();
        atualizarProdButton = new javax.swing.JButton();
        deletarProdButton = new javax.swing.JButton();
        catalogoProdButton = new javax.swing.JButton();
        produtosLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));

        painelClientes.setBackground(new java.awt.Color(255, 255, 255));
        painelClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelClientes.setPreferredSize(new java.awt.Dimension(159, 402));

        cadastrarCliButton1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cadastrarCliButton1.setText("Cadastrar");
        cadastrarCliButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCliButton1ActionPerformed(evt);
            }
        });

        consultarCliButton1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        consultarCliButton1.setText("Consultar");
        consultarCliButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCliButton1ActionPerformed(evt);
            }
        });

        atualizarCliButton1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        atualizarCliButton1.setText("Atualizar");
        atualizarCliButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarCliButton1ActionPerformed(evt);
            }
        });

        deletarCliButton1.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        deletarCliButton1.setText("Deletar");
        deletarCliButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarCliButton1ActionPerformed(evt);
            }
        });

        clientesLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        clientesLabel.setForeground(new java.awt.Color(0, 0, 0));
        clientesLabel.setText("CLIENTES");

        javax.swing.GroupLayout painelClientesLayout = new javax.swing.GroupLayout(painelClientes);
        painelClientes.setLayout(painelClientesLayout);
        painelClientesLayout.setHorizontalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atualizarCliButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consultarCliButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(cadastrarCliButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deletarCliButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClientesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clientesLabel)
                .addGap(55, 55, 55))
        );
        painelClientesLayout.setVerticalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientesLabel)
                .addGap(18, 18, 18)
                .addComponent(cadastrarCliButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultarCliButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atualizarCliButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletarCliButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        painelFornecedores.setBackground(new java.awt.Color(255, 255, 255));
        painelFornecedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelFornecedores.setPreferredSize(new java.awt.Dimension(159, 402));

        fornecedoresLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        fornecedoresLabel.setForeground(new java.awt.Color(0, 0, 0));
        fornecedoresLabel.setText("FORNECEDORES");

        cadastrarFornButton2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cadastrarFornButton2.setText("Cadastrar");
        cadastrarFornButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFornButton2ActionPerformed(evt);
            }
        });

        consultarFornButton2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        consultarFornButton2.setText("Consultar");
        consultarFornButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFornButton2ActionPerformed(evt);
            }
        });

        atualizarFornButton2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        atualizarFornButton2.setText("Atualizar");
        atualizarFornButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarFornButton2ActionPerformed(evt);
            }
        });

        deletarFornButton2.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        deletarFornButton2.setText("Deletar");
        deletarFornButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarFornButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFornecedoresLayout = new javax.swing.GroupLayout(painelFornecedores);
        painelFornecedores.setLayout(painelFornecedoresLayout);
        painelFornecedoresLayout.setHorizontalGroup(
            painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFornecedoresLayout.createSequentialGroup()
                .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFornecedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atualizarFornButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelFornecedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cadastrarFornButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelFornecedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(consultarFornButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                    .addGroup(painelFornecedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deletarFornButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFornecedoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fornecedoresLabel)
                .addGap(36, 36, 36))
        );
        painelFornecedoresLayout.setVerticalGroup(
            painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFornecedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fornecedoresLabel)
                .addGap(18, 18, 18)
                .addComponent(cadastrarFornButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultarFornButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atualizarFornButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletarFornButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        painelProdutos.setBackground(new java.awt.Color(255, 255, 255));
        painelProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelProdutos.setPreferredSize(new java.awt.Dimension(159, 402));

        cadastrarProdButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        cadastrarProdButton.setText("Cadastrar");
        cadastrarProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdButtonActionPerformed(evt);
            }
        });

        consultarProdButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        consultarProdButton.setText("Consultar");
        consultarProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarProdButtonActionPerformed(evt);
            }
        });

        atualizarProdButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        atualizarProdButton.setText("Atualizar");
        atualizarProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarProdButtonActionPerformed(evt);
            }
        });

        deletarProdButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        deletarProdButton.setText("Deletar");

        catalogoProdButton.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        catalogoProdButton.setText("Catalogo");
        catalogoProdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogoProdButtonActionPerformed(evt);
            }
        });

        produtosLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        produtosLabel.setForeground(new java.awt.Color(0, 0, 0));
        produtosLabel.setText("PRODUTOS");

        javax.swing.GroupLayout painelProdutosLayout = new javax.swing.GroupLayout(painelProdutos);
        painelProdutos.setLayout(painelProdutosLayout);
        painelProdutosLayout.setHorizontalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(catalogoProdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletarProdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atualizarProdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultarProdButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(cadastrarProdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelProdutosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(produtosLabel)
                .addGap(50, 50, 50))
        );
        painelProdutosLayout.setVerticalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtosLabel)
                .addGap(18, 18, 18)
                .addComponent(cadastrarProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultarProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atualizarProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletarProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(catalogoProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(painelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(painelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(painelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarCliButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCliButton1ActionPerformed
        /*this.dispose();*/ telaCliCadastro.setVisible(true);
    }//GEN-LAST:event_cadastrarCliButton1ActionPerformed

    private void consultarCliButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCliButton1ActionPerformed
        telaCliConsultar.setVisible(true);
    }//GEN-LAST:event_consultarCliButton1ActionPerformed

    private void atualizarCliButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarCliButton1ActionPerformed
        telaCliAtualizar.setVisible(true);
    }//GEN-LAST:event_atualizarCliButton1ActionPerformed

    private void deletarCliButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarCliButton1ActionPerformed
        telaCliDeletar.setVisible(true);
    }//GEN-LAST:event_deletarCliButton1ActionPerformed

    private void cadastrarFornButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFornButton2ActionPerformed
        telaFornCadastrar.setVisible(true);
    }//GEN-LAST:event_cadastrarFornButton2ActionPerformed

    private void consultarFornButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFornButton2ActionPerformed
        telaFornConsultar.setVisible(true);
    }//GEN-LAST:event_consultarFornButton2ActionPerformed

    private void atualizarFornButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarFornButton2ActionPerformed
        telaFornAtualizar.setVisible(true);
    }//GEN-LAST:event_atualizarFornButton2ActionPerformed

    private void deletarFornButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarFornButton2ActionPerformed
        telaFornDeletar.setVisible(true);
    }//GEN-LAST:event_deletarFornButton2ActionPerformed

    private void cadastrarProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdButtonActionPerformed
        telaProdCadastrar.setVisible(true);
    }//GEN-LAST:event_cadastrarProdButtonActionPerformed

    private void consultarProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarProdButtonActionPerformed
        telaProdConsultar.setVisible(true);
    }//GEN-LAST:event_consultarProdButtonActionPerformed

    private void atualizarProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarProdButtonActionPerformed
        telaProdAtualizar.setVisible(true);
    }//GEN-LAST:event_atualizarProdButtonActionPerformed

    private void catalogoProdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogoProdButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catalogoProdButtonActionPerformed

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
            java.util.logging.Logger.getLogger(tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarCliButton1;
    private javax.swing.JButton atualizarFornButton2;
    private javax.swing.JButton atualizarProdButton;
    private javax.swing.JButton cadastrarCliButton1;
    private javax.swing.JButton cadastrarFornButton2;
    private javax.swing.JButton cadastrarProdButton;
    private javax.swing.JButton catalogoProdButton;
    private javax.swing.JLabel clientesLabel;
    private javax.swing.JButton consultarCliButton1;
    private javax.swing.JButton consultarFornButton2;
    private javax.swing.JButton consultarProdButton;
    private javax.swing.JButton deletarCliButton1;
    private javax.swing.JButton deletarFornButton2;
    private javax.swing.JButton deletarProdButton;
    private javax.swing.JLabel fornecedoresLabel;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelClientes;
    private javax.swing.JPanel painelFornecedores;
    private javax.swing.JPanel painelProdutos;
    private javax.swing.JLabel produtosLabel;
    // End of variables declaration//GEN-END:variables
}
