
package br.edu.ifnmg.bd.sistema.entity;

/**
 *
 * @author annaj
 */
public class Ingresso {
    private String numero;
    private String valor;
    private String dataLineupEntrada;
    private String horaEntrada;
    private String cpfespectador;
    private String pertencedatalineup;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public Ingresso(String numero, String valor, String dataLineupEntrada, String horaEntrada, String cpfespectador, String pertencedatalineup) {
        this.numero = numero;
        this.valor = valor;
        this.dataLineupEntrada = dataLineupEntrada;
        this.horaEntrada = horaEntrada;
        this.cpfespectador = cpfespectador;
        this.pertencedatalineup = pertencedatalineup;
    }
    
    public Ingresso() {
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDataLineupEntrada() {
        return dataLineupEntrada;
    }

    public void setDataLineupEntrada(String dataLineupEntrada) {
        this.dataLineupEntrada = dataLineupEntrada;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getCpfespectador() {
        return cpfespectador;
    }

    public void setCpfespectador(String cpfespectador) {
        this.cpfespectador = cpfespectador;
    }

    public String getPertencedatalineup() {
        return pertencedatalineup;
    }

    public void setPertencedatalineup(String pertencedatalineup) {
        this.pertencedatalineup = pertencedatalineup;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Numero: " + numero;
    }
    
    
}
