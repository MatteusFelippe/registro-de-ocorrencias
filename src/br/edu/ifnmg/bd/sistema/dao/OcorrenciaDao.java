/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.bd.sistema.dao;

import br.edu.ifnmg.bd.sistema.entity.Ocorrencia;
import br.edu.ifnmg.bd.sistema.entity.Pessoa;
import br.edu.ifnmg.bd.sistema.gui.TelaLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author annaj
 */
public class OcorrenciaDao {

    public void adicionar(Ocorrencia o) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        String sql = "INSERT INTO ocorrencia(numero,data,descricao,cpfprofissionalseg,longitude,latitude) VALUES (?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, o.getNumero());
            pst.setString(2, o.getData());
            pst.setString(3, o.getDescricao());
            pst.setString(4, o.getCpfProfissionalSeg());
            pst.setString(5, o.getLongitude());
            pst.setString(6, o.getLatitude());
            int adicionado = pst.executeUpdate();

            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Ocorrencia adicionada com sucesso");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public List<Ocorrencia> read() {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Ocorrencia> ocorrencias = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("SELECT * FROM ocorrencia");
            rs = pst.executeQuery();
            while (rs.next()) {
                Ocorrencia ocorrencia = new Ocorrencia();
                ocorrencia.setNumero(rs.getString("numero"));
                ocorrencia.setData(rs.getString("data"));
                ocorrencia.setDescricao(rs.getString("descricao"));
                ocorrencia.setCpfProfissionalSeg(rs.getString("cpfprofissionalseg"));
                ocorrencia.setLongitude(rs.getString("longitude"));
                ocorrencia.setLatitude(rs.getString("latitude"));
                ocorrencias.add(ocorrencia);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ocorrencias;
    }

    public List<Ocorrencia> readAtualizar() {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Ocorrencia> ocorrencias = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("SELECT * FROM ocorrencia WHERE cpfprofissionalseg=?");
            pst.setString(1, TelaLogin.usuario);
            rs = pst.executeQuery();
            while (rs.next()) {
                Ocorrencia ocorrencia = new Ocorrencia();
                ocorrencia.setNumero(rs.getString("numero"));
                ocorrencia.setData(rs.getString("data"));
                ocorrencia.setDescricao(rs.getString("descricao"));
                ocorrencia.setCpfProfissionalSeg(rs.getString("cpfprofissionalseg"));
                ocorrencia.setLongitude(rs.getString("longitude"));
                ocorrencia.setLatitude(rs.getString("latitude"));
                ocorrencias.add(ocorrencia);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ocorrencias;
    }

    public void atualizar(Ocorrencia o) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conexao.prepareStatement("UPDATE ocorrencia set data=?,descricao=?,cpfprofissionalseg=?,longitude=?,latitude=? where numero=?");
            pst.setString(1, o.getData());
            pst.setString(2, o.getDescricao());
            pst.setString(3, o.getCpfProfissionalSeg());
            pst.setString(4, (o.getLongitude()).replace(".", ","));
            pst.setString(5, (o.getLatitude()).replace(".", ","));
            pst.setString(6, o.getNumero());
            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Dados do usuario alterados com sucesso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public Ocorrencia consultar(Ocorrencia o) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Ocorrencia ocorrencia = new Ocorrencia();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy"); 
        try {
            pst = conexao.prepareStatement("SELECT * FROM ocorrencia WHERE numero =?");
            pst.setString(1, o.getNumero());
            rs = pst.executeQuery();
            if(rs.next()) {
                ocorrencia.setNumero(rs.getString("numero"));
                if((rs.getString("data"))==null){
                    ocorrencia.setData(rs.getString("data"));
                }
                else{
                    Date data = formato.parse(rs.getString("data")); 
                    ocorrencia.setData(formato2.format(data));
                }
                ocorrencia.setDescricao(rs.getString("descricao"));
                ocorrencia.setCpfProfissionalSeg(rs.getString("cpfprofissionalseg"));
                ocorrencia.setLongitude(rs.getString("longitude"));
                ocorrencia.setLatitude(rs.getString("latitude"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ocorrencia;
    }
    public void excluir(Ocorrencia o) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        try {
            pst = conexao.prepareStatement("delete from ocorrencia where numero=?");
            pst.setString(1, o.getNumero());
            int apagado = pst.executeUpdate();
            if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario removido com sucesso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
