package br.edu.ifnmg.bd.sistema.dao;

import br.edu.ifnmg.bd.sistema.entity.LineUp;
import br.edu.ifnmg.bd.sistema.entity.RelatorioLineUp;
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
public class RelatorioLineUpDao {
   public List<RelatorioLineUp> procurar() {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<RelatorioLineUp> relatorios = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("SELECT data,capacidade,SUM(numero),AVG(valor) from LINEUP,INGRESSO where data=pertencedatalineup group by data,capacidade");
            rs = pst.executeQuery();
            while (rs.next()) {
                RelatorioLineUp relatorio = new RelatorioLineUp();
                relatorio.setData(rs.getString("data"));
                relatorio.setCapacidade(rs.getString("capacidade"));
                relatorio.setMedia(rs.getString("AVG(valor)"));
                relatorio.setQntIngresso(rs.getString("SUM(numero)"));
                relatorios.add(relatorio);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return relatorios;
    }
}
