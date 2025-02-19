package br.edu.ifnmg.bd.sistema.gui;

import br.edu.ifnmg.bd.sistema.dao.OcorrenciaDao;
import br.edu.ifnmg.bd.sistema.dao.OcorrenciaPessoaDao;
import br.edu.ifnmg.bd.sistema.dao.PessoaDao;
import br.edu.ifnmg.bd.sistema.entity.Ocorrencia;
import br.edu.ifnmg.bd.sistema.entity.OcorrenciaPessoa;
import br.edu.ifnmg.bd.sistema.entity.Pessoa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TelaAdicionarPessoaOcorrencia extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdicionarPessoaOcorrencia
     */
    public TelaAdicionarPessoaOcorrencia() {
        initComponents();
        PessoaDao daoPessoa = new PessoaDao();
        for (Pessoa p : daoPessoa.read()) {
            cbVisualizarPessoa.addItem(p);
        }
        OcorrenciaDao daoOcorrencia = new OcorrenciaDao();
        for (Ocorrencia o : daoOcorrencia.read()) {
            cbNumeroOcorrencia.addItem(o);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbVisualizarPessoa = new javax.swing.JComboBox<>();
        btnNovaPessoa = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbNumeroOcorrencia = new javax.swing.JComboBox<>();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Adicionar Pessoas em Ocorrências:");

        btnNovaPessoa.setText("Cadastrar Pessoa");
        btnNovaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPessoaActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        jLabel2.setText("Visualizar Informações da Pessoa:");

        jLabel3.setText("Selecione a pessoa:");

        jLabel4.setText("Seleciona o Número da Ocorrência:");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVisualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbNumeroOcorrencia, javax.swing.GroupLayout.Alignment.LEADING, 0, 374, Short.MAX_VALUE)
                                    .addComponent(cbVisualizarPessoa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnNovaPessoa))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnAdicionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVisualizarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovaPessoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnVisualizar))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbNumeroOcorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnAdicionar)
                .addGap(32, 32, 32))
        );

        setSize(new java.awt.Dimension(585, 366));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPessoaActionPerformed
        // TODO add your handling code here:
        TelaAdicionarPessoa tela = new TelaAdicionarPessoa();
        tela.setVisible(true);
    }//GEN-LAST:event_btnNovaPessoaActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        Pessoa p = (Pessoa) cbVisualizarPessoa.getSelectedItem();
        TelaSelecionarPessoa selecionarPessoa = new TelaSelecionarPessoa();
        selecionarPessoa.setVisible(true);
        selecionarPessoa.lbCpf.setText(p.getCpf());
        selecionarPessoa.lbNome.setText(p.getNome());
        selecionarPessoa.lbTipo.setText(p.getTipopessoa());
        if (p.getDatanascimento() == null) {
            selecionarPessoa.lbNascimento.setText(p.getDatanascimento());
        } else {
            try {
                Date data = formato.parse(p.getDatanascimento());
                selecionarPessoa.lbNascimento.setText(formato2.format(data));
            } catch (ParseException ex) {
                Logger.getLogger(TelaAdicionarPessoaOcorrencia.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

        selecionarPessoa.lbCep.setText(p.getCep());
        selecionarPessoa.lbBairro.setText(p.getBairro());
        selecionarPessoa.lbNumero.setText(p.getNumero());
        selecionarPessoa.lbRua.setText(p.getRua());
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        Pessoa p = (Pessoa) cbVisualizarPessoa.getSelectedItem();
        Ocorrencia o = (Ocorrencia) cbNumeroOcorrencia.getSelectedItem();
        OcorrenciaPessoa op = new OcorrenciaPessoa();
        op.setCpfpessoa(p.getCpf());
        op.setNumeroocorrencia(o.getNumero());
        new OcorrenciaPessoaDao().adicionar(op);
    }//GEN-LAST:event_btnAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdicionarPessoaOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarPessoaOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarPessoaOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarPessoaOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdicionarPessoaOcorrencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnNovaPessoa;
    private javax.swing.JButton btnVisualizar;
    public static javax.swing.JComboBox<Object> cbNumeroOcorrencia;
    public static javax.swing.JComboBox<Object> cbVisualizarPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
