/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.poo.pizzaria;

import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;

/**
 *
 * @author everaldo
 */
public class PizzariaFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public PizzariaFrame() {
        pedido = new Pedido();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotoesTipoMassa = new javax.swing.ButtonGroup();
        grupoBotoesTamanhoPizza = new javax.swing.ButtonGroup();
        tipoMassaPainel = new javax.swing.JPanel();
        massaNormalRadioButton = new javax.swing.JRadioButton();
        massaSemGlutenRadioButton = new javax.swing.JRadioButton();
        coberturasPainel = new javax.swing.JPanel();
        atumCheckBox = new javax.swing.JCheckBox();
        calabresaCheckBox = new javax.swing.JCheckBox();
        frangoCheckBox = new javax.swing.JCheckBox();
        manjericaoCheckbox = new javax.swing.JCheckBox();
        mussarelaCheckBox = new javax.swing.JCheckBox();
        tomatesCheckBox = new javax.swing.JCheckBox();
        resumoPedidoPainel = new javax.swing.JPanel();
        resumoPedidoScrollPanel = new javax.swing.JScrollPane();
        resumoPedidoTextArea = new javax.swing.JTextArea();
        tamanhoPainel = new javax.swing.JPanel();
        tamanhoPequenoRadioButton = new javax.swing.JRadioButton();
        tamanhoMedioRadioButton = new javax.swing.JRadioButton();
        tamanhoGrandeRadioButton = new javax.swing.JRadioButton();
        tamanhoGiganteRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzaria");

        tipoMassaPainel.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha o Tipo da Massa"));

        grupoBotoesTipoMassa.add(massaNormalRadioButton);
        massaNormalRadioButton.setMnemonic('n');
        massaNormalRadioButton.setText("Massa Normal");
        massaNormalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoMassaActionPerformed(evt);
            }
        });

        grupoBotoesTipoMassa.add(massaSemGlutenRadioButton);
        massaSemGlutenRadioButton.setMnemonic('s');
        massaSemGlutenRadioButton.setText("Massa sem glúten");
        massaSemGlutenRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoMassaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tipoMassaPainelLayout = new javax.swing.GroupLayout(tipoMassaPainel);
        tipoMassaPainel.setLayout(tipoMassaPainelLayout);
        tipoMassaPainelLayout.setHorizontalGroup(
            tipoMassaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoMassaPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(massaNormalRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(massaSemGlutenRadioButton)
                .addContainerGap())
        );
        tipoMassaPainelLayout.setVerticalGroup(
            tipoMassaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoMassaPainelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(tipoMassaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(massaNormalRadioButton)
                    .addComponent(massaSemGlutenRadioButton))
                .addContainerGap())
        );

        coberturasPainel.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha as Coberturas"));

        atumCheckBox.setMnemonic('a');
        atumCheckBox.setText("Atum");
        atumCheckBox.setActionCommand("atum");
        atumCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coberturaStateChanged(evt);
            }
        });

        calabresaCheckBox.setMnemonic('c');
        calabresaCheckBox.setText("Calabresa");
        calabresaCheckBox.setActionCommand("calabresa");
        calabresaCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coberturaStateChanged(evt);
            }
        });

        frangoCheckBox.setMnemonic('f');
        frangoCheckBox.setText("Frango");
        frangoCheckBox.setActionCommand("frango");
        frangoCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coberturaStateChanged(evt);
            }
        });

        manjericaoCheckbox.setMnemonic('j');
        manjericaoCheckbox.setText("Manjericão");
        manjericaoCheckbox.setActionCommand("manjericao");
        manjericaoCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coberturaStateChanged(evt);
            }
        });

        mussarelaCheckBox.setMnemonic('u');
        mussarelaCheckBox.setText("Mussarela");
        mussarelaCheckBox.setActionCommand("mussarela");
        mussarelaCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coberturaStateChanged(evt);
            }
        });

        tomatesCheckBox.setMnemonic('t');
        tomatesCheckBox.setText("Tomates");
        tomatesCheckBox.setActionCommand("tomates");
        tomatesCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coberturaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout coberturasPainelLayout = new javax.swing.GroupLayout(coberturasPainel);
        coberturasPainel.setLayout(coberturasPainelLayout);
        coberturasPainelLayout.setHorizontalGroup(
            coberturasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coberturasPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(coberturasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calabresaCheckBox)
                    .addComponent(atumCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(coberturasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manjericaoCheckbox)
                    .addComponent(frangoCheckBox))
                .addGap(13, 13, 13)
                .addGroup(coberturasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tomatesCheckBox)
                    .addComponent(mussarelaCheckBox)))
        );
        coberturasPainelLayout.setVerticalGroup(
            coberturasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coberturasPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(coberturasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atumCheckBox)
                    .addComponent(frangoCheckBox)
                    .addComponent(mussarelaCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(coberturasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calabresaCheckBox)
                    .addComponent(manjericaoCheckbox)
                    .addComponent(tomatesCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resumoPedidoPainel.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo do Pedido"));

        resumoPedidoTextArea.setColumns(20);
        resumoPedidoTextArea.setLineWrap(true);
        resumoPedidoTextArea.setRows(5);
        resumoPedidoScrollPanel.setViewportView(resumoPedidoTextArea);

        javax.swing.GroupLayout resumoPedidoPainelLayout = new javax.swing.GroupLayout(resumoPedidoPainel);
        resumoPedidoPainel.setLayout(resumoPedidoPainelLayout);
        resumoPedidoPainelLayout.setHorizontalGroup(
            resumoPedidoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resumoPedidoScrollPanel)
        );
        resumoPedidoPainelLayout.setVerticalGroup(
            resumoPedidoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resumoPedidoScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );

        tamanhoPainel.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha o Tamanho"));

        grupoBotoesTamanhoPizza.add(tamanhoPequenoRadioButton);
        tamanhoPequenoRadioButton.setMnemonic('p');
        tamanhoPequenoRadioButton.setText("Pequena");
        tamanhoPequenoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoPizzaActionPerformed(evt);
            }
        });

        grupoBotoesTamanhoPizza.add(tamanhoMedioRadioButton);
        tamanhoMedioRadioButton.setMnemonic('m');
        tamanhoMedioRadioButton.setText("Média");
        tamanhoMedioRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoPizzaActionPerformed(evt);
            }
        });

        grupoBotoesTamanhoPizza.add(tamanhoGrandeRadioButton);
        tamanhoGrandeRadioButton.setMnemonic('g');
        tamanhoGrandeRadioButton.setText("Grande");
        tamanhoGrandeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoPizzaActionPerformed(evt);
            }
        });

        grupoBotoesTamanhoPizza.add(tamanhoGiganteRadioButton);
        tamanhoGiganteRadioButton.setMnemonic('e');
        tamanhoGiganteRadioButton.setText("Gigante");
        tamanhoGiganteRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tamanhoPainelLayout = new javax.swing.GroupLayout(tamanhoPainel);
        tamanhoPainel.setLayout(tamanhoPainelLayout);
        tamanhoPainelLayout.setHorizontalGroup(
            tamanhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tamanhoPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tamanhoPequenoRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(tamanhoMedioRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tamanhoGrandeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tamanhoGiganteRadioButton)
                .addContainerGap())
        );
        tamanhoPainelLayout.setVerticalGroup(
            tamanhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tamanhoPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tamanhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanhoPequenoRadioButton)
                    .addComponent(tamanhoGrandeRadioButton)
                    .addComponent(tamanhoMedioRadioButton)
                    .addComponent(tamanhoGiganteRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tamanhoPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tipoMassaPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(coberturasPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(resumoPedidoPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tamanhoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoMassaPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coberturasPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resumoPedidoPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tamanhoPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoPizzaActionPerformed
        String tamanho = evt.getActionCommand();
        pedido.setTamanho(tamanho);
        atualizarPedido();
    }//GEN-LAST:event_tamanhoPizzaActionPerformed

    private void tipoMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoMassaActionPerformed
        String tipoMassa = evt.getActionCommand();
        pedido.setTipoMassa(tipoMassa);
        atualizarPedido();
    }//GEN-LAST:event_tipoMassaActionPerformed

    private void coberturaStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coberturaStateChanged
        String cobertura = ((JCheckBox)evt.getItem()).getText();
        if(evt.getStateChange() == ItemEvent.DESELECTED){
            pedido.removerCobertura(cobertura);
        }
        else if(evt.getStateChange() == ItemEvent.SELECTED){
            pedido.adicionarCobertura(cobertura);
        }
        atualizarPedido();
    }//GEN-LAST:event_coberturaStateChanged

    private void atualizarPedido(){
        if(pedido.getTamanho() == null ||
                pedido.getTipoMassa() == null ||
                pedido.getCoberturas().isEmpty()){
            resumoPedidoTextArea.setText("");
        }
        else{
            resumoPedidoTextArea.setText(pedido.toString());
        }
    }
    
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
            java.util.logging.Logger.getLogger(PizzariaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzariaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzariaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzariaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzariaFrame().setVisible(true);
            }
        });
    }
    
    private Pedido pedido;  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox atumCheckBox;
    private javax.swing.JCheckBox calabresaCheckBox;
    private javax.swing.JPanel coberturasPainel;
    private javax.swing.JCheckBox frangoCheckBox;
    private javax.swing.ButtonGroup grupoBotoesTamanhoPizza;
    private javax.swing.ButtonGroup grupoBotoesTipoMassa;
    private javax.swing.JCheckBox manjericaoCheckbox;
    private javax.swing.JRadioButton massaNormalRadioButton;
    private javax.swing.JRadioButton massaSemGlutenRadioButton;
    private javax.swing.JCheckBox mussarelaCheckBox;
    private javax.swing.JPanel resumoPedidoPainel;
    private javax.swing.JScrollPane resumoPedidoScrollPanel;
    private javax.swing.JTextArea resumoPedidoTextArea;
    private javax.swing.JRadioButton tamanhoGiganteRadioButton;
    private javax.swing.JRadioButton tamanhoGrandeRadioButton;
    private javax.swing.JRadioButton tamanhoMedioRadioButton;
    private javax.swing.JPanel tamanhoPainel;
    private javax.swing.JRadioButton tamanhoPequenoRadioButton;
    private javax.swing.JPanel tipoMassaPainel;
    private javax.swing.JCheckBox tomatesCheckBox;
    // End of variables declaration//GEN-END:variables
}
