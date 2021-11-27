
package Interfaces;

import Interfaces_adm.*;
import Interfaces.cadastro_Clientes;

public class tela_Catalogo extends javax.swing.JFrame {
    
    /*cadastro_Clientes   telaCliCadastro     = new cadastro_Clientes();
    tela_Cli_Consultar  telaCliConsultar    = new tela_Cli_Consultar();
    tela_Cli_Atualizar  telaCliAtualizar    = new tela_Cli_Atualizar();
    tela_Cli_Deletar    telaCliDeletar      = new tela_Cli_Deletar();
    tela_Forn_Cadastrar telaFornCadastrar   = new tela_Forn_Cadastrar();
    tela_Forn_Consultar telaFornConsultar   = new tela_Forn_Consultar();
    tela_Forn_Atualizar telaFornAtualizar   = new tela_Forn_Atualizar();
    tela_Forn_Deletar   telaFornDeletar     = new tela_Forn_Deletar();
    tela_Prod_Cadastrar telaProdCadastrar   = new tela_Prod_Cadastrar();
    tela_Prod_Consultar telaProdConsultar   = new tela_Prod_Consultar();
    tela_Prod_Atualizar telaProdAtualizar   = new tela_Prod_Atualizar();*/
    
    public tela_Catalogo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        painelPrincipal = new javax.swing.JPanel();
        painelDorflex = new javax.swing.JPanel();
        imagemDorflex = new javax.swing.JLabel();
        descricaoDorflexLabel = new javax.swing.JLabel();
        precoDorflexLabel = new javax.swing.JLabel();
        comprarDorflexButton = new javax.swing.JButton();
        painelParacetamol = new javax.swing.JPanel();
        imagemParacetamol = new javax.swing.JLabel();
        descricaoParacetamolLabel = new javax.swing.JLabel();
        precoParacetamolLabel = new javax.swing.JLabel();
        comprarParacetamolButton = new javax.swing.JButton();
        painelBeneroc = new javax.swing.JPanel();
        imagemBeneroc = new javax.swing.JLabel();
        descricaoBenerocLabel = new javax.swing.JLabel();
        precoBenerocLabel = new javax.swing.JLabel();
        comprarBenerocButton = new javax.swing.JButton();
        painelRivotril = new javax.swing.JPanel();
        imagemRivotril = new javax.swing.JLabel();
        descricaoRivotrilLabel = new javax.swing.JLabel();
        precoRivotrilLabel = new javax.swing.JLabel();
        comprarRivotrilButton = new javax.swing.JButton();
        painelDoralgina = new javax.swing.JPanel();
        imagemDoralgina = new javax.swing.JLabel();
        descricaoDoralginaLabel = new javax.swing.JLabel();
        precoDoralginaLabel = new javax.swing.JLabel();
        comprarDoralginaButton = new javax.swing.JButton();
        painelDipirona = new javax.swing.JPanel();
        imagemDipirona = new javax.swing.JLabel();
        descricaoDipironaLabel = new javax.swing.JLabel();
        precoDipironaLabel = new javax.swing.JLabel();
        comprarDipironaButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("CATALOGO");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(651, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(651, 480));

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(651, 454));

        painelDorflex.setBackground(new java.awt.Color(255, 255, 255));
        painelDorflex.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelDorflex.setPreferredSize(new java.awt.Dimension(198, 209));

        imagemDorflex.setIcon(new javax.swing.ImageIcon("C:\\Users\\ryan_\\OneDrive\\Imagens\\Dorflex.jpg")); // NOI18N

        descricaoDorflexLabel.setText("Dorflex - 36 Comprimidos");

        precoDorflexLabel.setText("R$: 15,00");

        comprarDorflexButton.setText("COMPRAR");

        javax.swing.GroupLayout painelDorflexLayout = new javax.swing.GroupLayout(painelDorflex);
        painelDorflex.setLayout(painelDorflexLayout);
        painelDorflexLayout.setHorizontalGroup(
            painelDorflexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDorflexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDorflexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricaoDorflexLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagemDorflex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelDorflexLayout.createSequentialGroup()
                        .addComponent(precoDorflexLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comprarDorflexButton)))
                .addContainerGap())
        );
        painelDorflexLayout.setVerticalGroup(
            painelDorflexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDorflexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagemDorflex, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descricaoDorflexLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDorflexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precoDorflexLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comprarDorflexButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        painelParacetamol.setBackground(new java.awt.Color(255, 255, 255));
        painelParacetamol.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelParacetamol.setPreferredSize(new java.awt.Dimension(207, 209));

        imagemParacetamol.setIcon(new javax.swing.ImageIcon("C:\\Users\\ryan_\\OneDrive\\Imagens\\paracetamol.jpg")); // NOI18N

        descricaoParacetamolLabel.setText("Paracetamol 750 mg");

        precoParacetamolLabel.setText("R$ 16,49");

        comprarParacetamolButton.setText("COMPRAR");

        javax.swing.GroupLayout painelParacetamolLayout = new javax.swing.GroupLayout(painelParacetamol);
        painelParacetamol.setLayout(painelParacetamolLayout);
        painelParacetamolLayout.setHorizontalGroup(
            painelParacetamolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelParacetamolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelParacetamolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelParacetamolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelParacetamolLayout.createSequentialGroup()
                            .addComponent(precoParacetamolLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comprarParacetamolButton))
                        .addGroup(painelParacetamolLayout.createSequentialGroup()
                            .addComponent(descricaoParacetamolLabel)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelParacetamolLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imagemParacetamol, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelParacetamolLayout.setVerticalGroup(
            painelParacetamolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelParacetamolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagemParacetamol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descricaoParacetamolLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelParacetamolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precoParacetamolLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comprarParacetamolButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        painelBeneroc.setBackground(new java.awt.Color(255, 255, 255));
        painelBeneroc.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        imagemBeneroc.setIcon(new javax.swing.ImageIcon("C:\\Users\\ryan_\\OneDrive\\Imagens\\Beneroc.jpg")); // NOI18N

        descricaoBenerocLabel.setText("Beneroc 100 drageas");

        precoBenerocLabel.setText("R$: 59,00");

        comprarBenerocButton.setText("COMPRAR");

        javax.swing.GroupLayout painelBenerocLayout = new javax.swing.GroupLayout(painelBeneroc);
        painelBeneroc.setLayout(painelBenerocLayout);
        painelBenerocLayout.setHorizontalGroup(
            painelBenerocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBenerocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBenerocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBenerocLayout.createSequentialGroup()
                        .addComponent(descricaoBenerocLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelBenerocLayout.createSequentialGroup()
                        .addComponent(precoBenerocLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comprarBenerocButton))
                    .addComponent(imagemBeneroc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelBenerocLayout.setVerticalGroup(
            painelBenerocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBenerocLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(imagemBeneroc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descricaoBenerocLabel)
                .addGap(18, 18, 18)
                .addGroup(painelBenerocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(precoBenerocLabel)
                    .addComponent(comprarBenerocButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelRivotril.setBackground(new java.awt.Color(255, 255, 255));
        painelRivotril.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelRivotril.setPreferredSize(new java.awt.Dimension(198, 209));

        imagemRivotril.setIcon(new javax.swing.ImageIcon("C:\\Users\\ryan_\\OneDrive\\Imagens\\Rivotril.jpg")); // NOI18N

        descricaoRivotrilLabel.setText("Rivotril 30 Tablets");

        precoRivotrilLabel.setText("R$: 30,99");

        comprarRivotrilButton.setText("COMPRAR");

        javax.swing.GroupLayout painelRivotrilLayout = new javax.swing.GroupLayout(painelRivotril);
        painelRivotril.setLayout(painelRivotrilLayout);
        painelRivotrilLayout.setHorizontalGroup(
            painelRivotrilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRivotrilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRivotrilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRivotrilLayout.createSequentialGroup()
                        .addComponent(precoRivotrilLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comprarRivotrilButton))
                    .addGroup(painelRivotrilLayout.createSequentialGroup()
                        .addGroup(painelRivotrilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemRivotril)
                            .addComponent(descricaoRivotrilLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelRivotrilLayout.setVerticalGroup(
            painelRivotrilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRivotrilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagemRivotril)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoRivotrilLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelRivotrilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precoRivotrilLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comprarRivotrilButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        painelDoralgina.setBackground(new java.awt.Color(255, 255, 255));
        painelDoralgina.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelDoralgina.setPreferredSize(new java.awt.Dimension(207, 209));

        imagemDoralgina.setIcon(new javax.swing.ImageIcon("C:\\Users\\ryan_\\OneDrive\\Imagens\\doralgina.png")); // NOI18N

        descricaoDoralginaLabel.setText("Doralgina 20 Drageas");

        precoDoralginaLabel.setText("R$: 19,90");

        comprarDoralginaButton.setText("COMPRAR");

        javax.swing.GroupLayout painelDoralginaLayout = new javax.swing.GroupLayout(painelDoralgina);
        painelDoralgina.setLayout(painelDoralginaLayout);
        painelDoralginaLayout.setHorizontalGroup(
            painelDoralginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDoralginaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDoralginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemDoralgina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelDoralginaLayout.createSequentialGroup()
                        .addComponent(descricaoDoralginaLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelDoralginaLayout.createSequentialGroup()
                        .addComponent(precoDoralginaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comprarDoralginaButton)))
                .addContainerGap())
        );
        painelDoralginaLayout.setVerticalGroup(
            painelDoralginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDoralginaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagemDoralgina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoDoralginaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(painelDoralginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precoDoralginaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comprarDoralginaButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        painelDipirona.setBackground(new java.awt.Color(255, 255, 255));
        painelDipirona.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelDipirona.setPreferredSize(new java.awt.Dimension(198, 209));

        imagemDipirona.setIcon(new javax.swing.ImageIcon("C:\\Users\\ryan_\\OneDrive\\Imagens\\dipirona.jpg")); // NOI18N

        descricaoDipironaLabel.setText("Dipirona 10 Comprimidos");

        precoDipironaLabel.setText("RS: 8,99");

        comprarDipironaButton.setText("COMPRAR");

        javax.swing.GroupLayout painelDipironaLayout = new javax.swing.GroupLayout(painelDipirona);
        painelDipirona.setLayout(painelDipironaLayout);
        painelDipironaLayout.setHorizontalGroup(
            painelDipironaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDipironaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDipironaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDipironaLayout.createSequentialGroup()
                        .addComponent(precoDipironaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comprarDipironaButton))
                    .addGroup(painelDipironaLayout.createSequentialGroup()
                        .addGroup(painelDipironaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemDipirona)
                            .addComponent(descricaoDipironaLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelDipironaLayout.setVerticalGroup(
            painelDipironaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDipironaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDipironaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelDipironaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(comprarDipironaButton))
                    .addGroup(painelDipironaLayout.createSequentialGroup()
                        .addComponent(imagemDipirona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoDipironaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precoDipironaLabel)))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelDorflex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelRivotril, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelParacetamol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDoralgina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelBeneroc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDipirona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDorflex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBeneroc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelParacetamol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelRivotril, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDipirona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDoralgina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(tela_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprarBenerocButton;
    private javax.swing.JButton comprarDipironaButton;
    private javax.swing.JButton comprarDoralginaButton;
    private javax.swing.JButton comprarDorflexButton;
    private javax.swing.JButton comprarParacetamolButton;
    private javax.swing.JButton comprarRivotrilButton;
    private javax.swing.JLabel descricaoBenerocLabel;
    private javax.swing.JLabel descricaoDipironaLabel;
    private javax.swing.JLabel descricaoDoralginaLabel;
    private javax.swing.JLabel descricaoDorflexLabel;
    private javax.swing.JLabel descricaoParacetamolLabel;
    private javax.swing.JLabel descricaoRivotrilLabel;
    private javax.swing.JLabel imagemBeneroc;
    private javax.swing.JLabel imagemDipirona;
    private javax.swing.JLabel imagemDoralgina;
    private javax.swing.JLabel imagemDorflex;
    private javax.swing.JLabel imagemParacetamol;
    private javax.swing.JLabel imagemRivotril;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel painelBeneroc;
    private javax.swing.JPanel painelDipirona;
    private javax.swing.JPanel painelDoralgina;
    private javax.swing.JPanel painelDorflex;
    private javax.swing.JPanel painelParacetamol;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelRivotril;
    private javax.swing.JLabel precoBenerocLabel;
    private javax.swing.JLabel precoDipironaLabel;
    private javax.swing.JLabel precoDoralginaLabel;
    private javax.swing.JLabel precoDorflexLabel;
    private javax.swing.JLabel precoParacetamolLabel;
    private javax.swing.JLabel precoRivotrilLabel;
    // End of variables declaration//GEN-END:variables
}
