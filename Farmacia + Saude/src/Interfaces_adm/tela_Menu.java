
package Interfaces_adm;

import Interfaces.cadastro_Clientes;

public class tela_Menu extends javax.swing.JFrame {
    
    cadastro_Clientes   telaCliCadastro     = new cadastro_Clientes();
    tela_Cli_Consultar  telaCliConsultar    = new tela_Cli_Consultar();
    tela_Cli_Atualizar  telaCliAtualizar    = new tela_Cli_Atualizar();
    tela_Cli_Deletar    telaCliDeletar      = new tela_Cli_Deletar();
    
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
        cadastrarProdButton2 = new javax.swing.JButton();
        consultarProdButton2 = new javax.swing.JButton();
        atualizarProdButton2 = new javax.swing.JButton();
        deletarProdButton2 = new javax.swing.JButton();
        painelProdutos = new javax.swing.JPanel();
        cadastrarProdButton = new javax.swing.JButton();
        consultarProdButton = new javax.swing.JButton();
        atualizarProdButton = new javax.swing.JButton();
        deletarProdButton = new javax.swing.JButton();
        catalogoProdButton = new javax.swing.JButton();
        produtosLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        painelBranco.setBackground(new java.awt.Color(255, 255, 255));
        painelBranco.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        painelClientes.setBackground(new java.awt.Color(255, 255, 255));
        painelClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelClientes.setPreferredSize(new java.awt.Dimension(159, 402));

        cadastrarCliButton1.setText("Cadastrar");
        cadastrarCliButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCliButton1ActionPerformed(evt);
            }
        });

        consultarCliButton1.setText("Consultar");
        consultarCliButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCliButton1ActionPerformed(evt);
            }
        });

        atualizarCliButton1.setText("Atualizar");
        atualizarCliButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarCliButton1ActionPerformed(evt);
            }
        });

        deletarCliButton1.setText("Deletar");
        deletarCliButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarCliButton1ActionPerformed(evt);
            }
        });

        clientesLabel.setText("CLIENTES");

        javax.swing.GroupLayout painelClientesLayout = new javax.swing.GroupLayout(painelClientes);
        painelClientes.setLayout(painelClientesLayout);
        painelClientesLayout.setHorizontalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(clientesLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atualizarCliButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consultarCliButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarCliButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                    .addGroup(painelClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deletarCliButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelClientesLayout.setVerticalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientesLabel)
                .addGap(30, 30, 30)
                .addComponent(cadastrarCliButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultarCliButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atualizarCliButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletarCliButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelFornecedores.setBackground(new java.awt.Color(255, 255, 255));
        painelFornecedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelFornecedores.setPreferredSize(new java.awt.Dimension(159, 402));

        fornecedoresLabel.setText("FORNECEDORES");

        cadastrarProdButton2.setText("Cadastrar");

        consultarProdButton2.setText("Consultar");

        atualizarProdButton2.setText("Atualizar");

        deletarProdButton2.setText("Deletar");

        javax.swing.GroupLayout painelFornecedoresLayout = new javax.swing.GroupLayout(painelFornecedores);
        painelFornecedores.setLayout(painelFornecedoresLayout);
        painelFornecedoresLayout.setHorizontalGroup(
            painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFornecedoresLayout.createSequentialGroup()
                .addGroup(painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFornecedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atualizarProdButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelFornecedoresLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(fornecedoresLabel)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(painelFornecedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cadastrarProdButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelFornecedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(consultarProdButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelFornecedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deletarProdButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelFornecedoresLayout.setVerticalGroup(
            painelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFornecedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fornecedoresLabel)
                .addGap(31, 31, 31)
                .addComponent(cadastrarProdButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultarProdButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atualizarProdButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletarProdButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelProdutos.setBackground(new java.awt.Color(255, 255, 255));
        painelProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelProdutos.setPreferredSize(new java.awt.Dimension(159, 402));

        cadastrarProdButton.setText("Cadastrar");

        consultarProdButton.setText("Consultar");

        atualizarProdButton.setText("Atualizar");

        deletarProdButton.setText("Deletar");

        catalogoProdButton.setText("Catalogo");

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
                    .addComponent(consultarProdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarProdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(painelProdutosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(produtosLabel)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        painelProdutosLayout.setVerticalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtosLabel)
                .addGap(31, 31, 31)
                .addComponent(cadastrarProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultarProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atualizarProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletarProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(catalogoProdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelBrancoLayout = new javax.swing.GroupLayout(painelBranco);
        painelBranco.setLayout(painelBrancoLayout);
        painelBrancoLayout.setHorizontalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(painelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(painelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(painelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        painelBrancoLayout.setVerticalGroup(
            painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBrancoLayout.createSequentialGroup()
                        .addComponent(painelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(painelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
    private javax.swing.JButton atualizarProdButton;
    private javax.swing.JButton atualizarProdButton2;
    private javax.swing.JButton cadastrarCliButton1;
    private javax.swing.JButton cadastrarProdButton;
    private javax.swing.JButton cadastrarProdButton2;
    private javax.swing.JButton catalogoProdButton;
    private javax.swing.JLabel clientesLabel;
    private javax.swing.JButton consultarCliButton1;
    private javax.swing.JButton consultarProdButton;
    private javax.swing.JButton consultarProdButton2;
    private javax.swing.JButton deletarCliButton1;
    private javax.swing.JButton deletarProdButton;
    private javax.swing.JButton deletarProdButton2;
    private javax.swing.JLabel fornecedoresLabel;
    private javax.swing.JPanel painelBranco;
    private javax.swing.JPanel painelClientes;
    private javax.swing.JPanel painelFornecedores;
    private javax.swing.JPanel painelProdutos;
    private javax.swing.JLabel produtosLabel;
    // End of variables declaration//GEN-END:variables
}
