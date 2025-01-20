package br.edu.ifnmg.bd.sistema.entity;

import br.edu.ifnmg.bd.sistema.dao.*;

/**
 *
 * @author annaj
 */
public class RelatorioLineUp {
    private String data;
    private String capacidade;
    private String qntIngresso;
    private String media;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public RelatorioLineUp() {
    }

    public RelatorioLineUp(String data, String capacidade, String qntIngresso, String media) {
        this.data = data;
        this.capacidade = capacidade;
        this.qntIngresso = qntIngresso;
        this.media = media;
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

    public String getQntIngresso() {
        return qntIngresso;
    }

    public void setQntIngresso(String qntIngresso) {
        this.qntIngresso = qntIngresso;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
    
    //</editor-fold>

    @Override
    public String toString() {
        return "Data=: " + data + "\nCapacidade: " + capacidade + "\nQuatidade de Ingresso: " + qntIngresso + "\nMedia: " + media + "\n\n";
    }
    
    
}
