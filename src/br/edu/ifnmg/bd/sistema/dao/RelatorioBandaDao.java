/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.bd.sistema.dao;

import br.edu.ifnmg.bd.sistema.entity.RelatorioBanda;
import br.edu.ifnmg.bd.sistema.entity.RelatorioLineUp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author annaj
 */
public class RelatorioBandaDao {
    public List<RelatorioBanda> procurar(String data) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy"); 
        List<RelatorioBanda> relatorios = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("select nome,nomelocalshow,site from banda where datalineupshow=? order by nome");
            Date date = formato.parse(data); 
            pst.setString(1, formato2.format(date));
            rs = pst.executeQuery();
            while (rs.next()) {
                RelatorioBanda relatorio = new RelatorioBanda();
                relatorio.setNome(rs.getString("nome"));
                relatorio.setNomelocal(rs.getString("nomelocalshow"));
                relatorio.setSite(rs.getString("site"));
                relatorios.add(relatorio);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return relatorios;
    }
    
}
