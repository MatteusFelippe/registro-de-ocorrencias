
package br.edu.ifnmg.bd.sistema.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author annaj
 */
public class LineUp {
    private String data;
    private String capacidade;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public LineUp(String data, String capacidade) {
        this.data = data;
        this.capacidade = capacidade;
    }

    public LineUp() {
    }
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
    
    //</editor-fold>
    
    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy"); 
        Date Novadata = null; 
        try {
            Novadata = formato.parse(data);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return "Data Line-Up: " + formato2.format(Novadata);
    }
}
