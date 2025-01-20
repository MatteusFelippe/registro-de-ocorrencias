/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.bd.sistema.dao;

import br.edu.ifnmg.bd.sistema.entity.Pessoa;
import br.edu.ifnmg.bd.sistema.entity.Show;
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
public class ShowDao {
    public List<Show> readListar(String Data) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy"); 

        List<Show> shows = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("SELECT * FROM show where datalineup=?");
            Date data = formato.parse(Data); 
            pst.setString(1, formato2.format(data));
            rs = pst.executeQuery();
            while (rs.next()) {
                Show show = new Show();
                show.setDataLineUp(Data);
                show.setHoraInicio(rs.getString("horainicio"));
                show.setNomeLocal(rs.getString("nomelocal"));
                shows.add(show);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return shows;
    }
}
