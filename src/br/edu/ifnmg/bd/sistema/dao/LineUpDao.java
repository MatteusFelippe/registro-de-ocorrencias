/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.bd.sistema.dao;

import br.edu.ifnmg.bd.sistema.entity.LineUp;
import br.edu.ifnmg.bd.sistema.entity.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author annaj
 */
public class LineUpDao {
    public List<LineUp> read() {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<LineUp> lineups = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("SELECT * FROM lineup");
            rs = pst.executeQuery();
            while (rs.next()) {
                LineUp lineup = new LineUp();
                lineup.setCapacidade(rs.getString("capacidade"));
                lineup.setData(rs.getString("data"));
                lineups.add(lineup);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lineups;
    }
}
