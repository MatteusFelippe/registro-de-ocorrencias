package br.edu.ifnmg.bd.sistema.entity;

/**
 *
 * @author annaj
 */
public class Ocorrencia{
    private String numero;
    private String data;
    private String descricao;
    private String CpfProfissionalSeg;
    private String longitude;
    private String latitude;
    private String CpfPessoa;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public Ocorrencia(String numero, String data, String descricao, String CpfProfissionalSeg, String longitude, String latitude, String CpfPessoa) {
        this.numero = numero;
        this.data = data;
        this.descricao = descricao;
        this.CpfProfissionalSeg = CpfProfissionalSeg;
        this.longitude = longitude;
        this.latitude = latitude;
        this.CpfPessoa = CpfPessoa;
    }
    
    public Ocorrencia() {
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCpfProfissionalSeg() {
        return CpfProfissionalSeg;
    }

    public void setCpfProfissionalSeg(String CpfProfissionalSeg) {
        this.CpfProfissionalSeg = CpfProfissionalSeg;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCpfPessoa() {
        return CpfPessoa;
    }

    public void setCpfPessoa(String CpfPessoa) {
        this.CpfPessoa = CpfPessoa;
    }
    //</editor-fold>
    
    @Override
    public String toString() {
        return "Numero da ocorrência=" + numero;
    }
}
