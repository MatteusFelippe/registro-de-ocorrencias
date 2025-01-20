package br.edu.ifnmg.bd.sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
import br.edu.ifnmg.bd.sistema.entity.Funcionario;
/**
 *
 * @author annaj
 */
public class FuncionarioDao {
    
    public Boolean logar(Funcionario f){
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try { //Pega o que foi digitado
            pst = conexao.prepareStatement("SELECT * FROM funcionario WHERE numeroregistro=? AND cpfpessoa=?");
            pst.setDouble(1, f.getNumeroRegistro());
            pst.setString(2, f.getCpfpessoa());
            //A linha abaixo executa a query
            rs = pst.executeQuery();
            if (rs.next()) {
                f.setTipofuncionario(rs.getString(3));
                return true;
            }
            else {
                JOptionPane.showMessageDialog(null, "usuário e/ou senha inválido(s)");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        return false;
        
    }

    
}
