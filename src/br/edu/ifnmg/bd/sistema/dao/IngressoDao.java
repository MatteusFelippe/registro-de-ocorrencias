package br.edu.ifnmg.bd.sistema.dao;

import br.edu.ifnmg.bd.sistema.entity.Ingresso;
import br.edu.ifnmg.bd.sistema.entity.Ocorrencia;
import br.edu.ifnmg.bd.sistema.entity.Pessoa;
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
public class IngressoDao {

    public void adicionar(Ingresso i) {
        Connection conexao = ConexaoBd.getConexao();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        PreparedStatement pst = null;
        PreparedStatement pst2 = null;
        ResultSet rs = null;
        try {
            pst = conexao.prepareStatement("SELECT Max(numero)+1 FROM ingresso");
            rs = pst.executeQuery();
            while (rs.next()) {
                try {
                    pst2 = conexao.prepareStatement("INSERT INTO ingresso(numero,valor,datalineupentrada,horaentrada,cpfespectador,pertencedatalineup) VALUES (?,?,?,?,?,?)");
                    pst2.setString(1, rs.getString("Max(numero)+1"));
                    pst2.setString(2, i.getValor());
                    if (i.getDataLineupEntrada().isEmpty()) {
                        pst2.setString(3, i.getDataLineupEntrada());
                    } else {
                        Date Novadata = formato.parse(i.getDataLineupEntrada());
                        pst2.setString(3, formato2.format(Novadata));
                    }
                    pst2.setString(4, i.getHoraEntrada());
                    pst2.setString(5, i.getCpfespectador());
                    if (i.getPertencedatalineup().isEmpty()) {
                        pst2.setString(3, i.getPertencedatalineup());
                    } else {
                        Date Novadata = formato.parse(i.getPertencedatalineup());
                        pst2.setString(3, formato2.format(Novadata));
                    }
                    Date Novadata = formato.parse(i.getPertencedatalineup());
                    pst2.setString(6, formato2.format(Novadata));
                    int adicionado = pst2.executeUpdate();
                    if (adicionado > 0) {
                        JOptionPane.showMessageDialog(null, "Ingresso adicionado com sucesso");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public List<Ingresso> read() {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Ingresso> ingressos = new ArrayList<>();
        try {
            pst = conexao.prepareStatement("SELECT * FROM ingresso");
            rs = pst.executeQuery();
            while (rs.next()) {
                Ingresso ingresso = new Ingresso();
                ingresso.setCpfespectador(rs.getString("cpfespectador"));
                ingresso.setDataLineupEntrada(rs.getString("datalineupentrada"));
                ingresso.setHoraEntrada(rs.getString("horaentrada"));
                ingresso.setNumero(rs.getString("numero"));
                ingresso.setPertencedatalineup(rs.getString("pertencedatalineup"));
                ingresso.setValor(rs.getString("valor"));
                ingressos.add(ingresso);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ingressos;
    }

    public Ingresso consultar(Ingresso i) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Ingresso ingresso = new Ingresso();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            pst = conexao.prepareStatement("SELECT * FROM ingresso WHERE numero =?");
            pst.setString(1, i.getNumero());
            rs = pst.executeQuery();
            if (rs.next()) {
                ingresso.setNumero(rs.getString("numero"));
                if ((rs.getString("datalineupentrada")) == null) {
                    ingresso.setDataLineupEntrada(rs.getString("datalineupentrada"));
                } else {
                    Date data = formato.parse(rs.getString("datalineupentrada"));
                    ingresso.setDataLineupEntrada(formato2.format(data));
                }
                ingresso.setPertencedatalineup(rs.getString("pertencedatalineup"));
                ingresso.setCpfespectador(rs.getString("cpfespectador"));
                ingresso.setHoraEntrada(rs.getString("horaentrada"));
                ingresso.setValor(rs.getString("valor"));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ingresso;
    }

    public void atualizar(Ingresso i) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            pst = conexao.prepareStatement("UPDATE ingresso set valor=?,datalineupentrada=?,horaentrada=?,cpfespectador=?,pertencedatalineup=? where numero=?");
            pst.setString(1, i.getValor());
            if (i.getDataLineupEntrada().isEmpty()) {
                pst.setString(2, i.getDataLineupEntrada());
            } else {
                Date data = formato.parse(i.getDataLineupEntrada());
                pst.setString(2, formato2.format(data));
            }
            
            pst.setString(3, i.getHoraEntrada());
            pst.setString(4, i.getCpfespectador());
            Date data = formato.parse(i.getPertencedatalineup());
            pst.setString(5, formato2.format(data));
            pst.setString(6, i.getNumero());
            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Dados do usuario alterados com sucesso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    public void excluir(Ingresso i) {
        Connection conexao = ConexaoBd.getConexao();
        PreparedStatement pst = null;
        try {
            pst = conexao.prepareStatement("delete from ingresso where numero=?");
            pst.setString(1, i.getNumero());
            int apagado = pst.executeUpdate();
            if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario removido com sucesso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
