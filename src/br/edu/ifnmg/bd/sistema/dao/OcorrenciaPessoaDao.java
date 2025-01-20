/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.bd.sistema.dao;

import br.edu.ifnmg.bd.sistema.entity.OcorrenciaPessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author annaj
 */
public class OcorrenciaPessoaDao {
    public void adicionar(OcorrenciaPessoa op) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        String sql = "INSERT INTO ocorrenciapessoa(cpfpessoa,numeroocorrencia) VALUES (?,?)";
        try { 
            pst = conexao.prepareStatement(sql);
            pst.setString(1, op.getCpfpessoa());
            pst.setString(2, op.getNumeroocorrencia());
            int adicionado = pst.executeUpdate();

            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Ocorrencia adicionada com sucesso");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
