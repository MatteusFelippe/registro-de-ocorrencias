/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.bd.sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
import br.edu.ifnmg.bd.sistema.entity.Pessoa;
import static br.edu.ifnmg.bd.sistema.gui.TelaAdicionarPessoaOcorrencia.cbVisualizarPessoa;
import static br.edu.ifnmg.bd.sistema.gui.TelaInserirIngresso.cbAdicionarEspectador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author annaj
 */
public class PessoaDao {

    public List<Pessoa> read() {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Pessoa> pessoas = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("SELECT * FROM pessoa");
            rs = pst.executeQuery();
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setCpf(rs.getString("cpf"));
                pessoa.setTipopessoa(rs.getString("tipopessoa"));
                pessoa.setDatanascimento(rs.getString("datanascimento"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCep(rs.getString("cep"));
                pessoa.setBairro(rs.getString("bairro"));
                pessoa.setNumero(rs.getString("numero"));
                pessoa.setRua(rs.getString("rua"));
                pessoas.add(pessoa);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return pessoas;
    }
    
    public List<Pessoa> readListar(String NumeroOcorrencia) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        PreparedStatement pst2 = null;
        ResultSet rs2 = null;

        List<Pessoa> pessoas = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("SELECT * FROM ocorrenciapessoa where numeroocorrencia=?");
            pst.setString(1, NumeroOcorrencia);
            rs = pst.executeQuery();
            while (rs.next()) {
                
                pst2 = conexao.prepareStatement("SELECT * FROM pessoa where cpf=?");
                pst2.setString(1, rs.getString("cpfpessoa"));
                rs2 = pst2.executeQuery();
                while (rs2.next()) {
                    Pessoa pessoa = new Pessoa();
                    pessoa.setCpf(rs2.getString("cpf"));
                    pessoa.setTipopessoa(rs2.getString("tipopessoa"));
                    pessoa.setDatanascimento(rs2.getString("datanascimento"));
                    pessoa.setNome(rs2.getString("nome"));
                    pessoa.setCep(rs2.getString("cep"));
                    pessoa.setBairro(rs2.getString("bairro"));
                    pessoa.setNumero(rs2.getString("numero"));
                    pessoa.setRua(rs2.getString("rua"));
                    pessoas.add(pessoa);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return pessoas;
    }
    
    public List<Pessoa> readEspectador() {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Pessoa> pessoas = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("SELECT * FROM pessoa where tipopessoa='Espectador'");
            rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setCpf(rs.getString("cpf"));
                pessoa.setTipopessoa(rs.getString("tipopessoa"));
                pessoa.setDatanascimento(rs.getString("datanascimento"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCep(rs.getString("cep"));
                pessoa.setBairro(rs.getString("bairro"));
                pessoa.setNumero(rs.getString("numero"));
                pessoa.setRua(rs.getString("rua"));
                pessoas.add(pessoa);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return pessoas;
    }

    public void adicionar(Pessoa p) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        PreparedStatement pst2 = null;
        String sql = "INSERT INTO pessoa(cpf,tipopessoa,datanascimento,nome,cep,bairro,numero, rua) VALUES (?,?,?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, p.getCpf());
            pst.setString(2, p.getTipopessoa());
            pst.setString(3, p.getDatanascimento());
            pst.setString(4, p.getNome());
            pst.setString(5, p.getCep());
            pst.setString(6, p.getBairro());
            pst.setString(7, p.getNumero());
            pst.setString(8, p.getRua());
            int adicionado = pst.executeUpdate();
            if(p.getTipopessoa().equals("Espectador")){
                pst2 = conexao.prepareStatement("insert into espectador(cpfpessoa, codigo) values (?,(select max(codigo)+1 from Espectador))");
                pst2.setString(1, p.getCpf());
                pst2.executeUpdate();
            }

            if (adicionado > 0) {
                if(br.edu.ifnmg.bd.sistema.gui.TelaAdicionarPessoaOcorrencia.cbVisualizarPessoa!=null){
                    cbVisualizarPessoa.addItem(p);
                }
                if(br.edu.ifnmg.bd.sistema.gui.TelaInserirIngresso.cbAdicionarEspectador!=null){
                    cbAdicionarEspectador.addItem(p);
                }
                JOptionPane.showMessageDialog(null, "Usuario adicionado com sucesso");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
