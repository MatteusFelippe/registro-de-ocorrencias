package br.edu.ifnmg.bd.sistema.entity;

/**
 *
 * @author annaj
 */
public class Show {
    private String nomeLocal;
    private String dataLineUp;
    private String horaInicio;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public Show(String nomeLocal, String dataLineUp, String horaInicio) {
        this.nomeLocal = nomeLocal;
        this.dataLineUp = dataLineUp;
        this.horaInicio = horaInicio;
    }
    
    public Show() {
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getDataLineUp() {
        return dataLineUp;
    }

    public void setDataLineUp(String dataLineUp) {
        this.dataLineUp = dataLineUp;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    //</editor-fold>

    @Override
    public String toString() {
        return "Nome do Local: " + nomeLocal + ", Hora de Inicio: " + horaInicio;
    }
    
}
