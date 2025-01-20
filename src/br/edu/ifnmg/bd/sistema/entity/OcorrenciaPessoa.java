/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.bd.sistema.entity;

/**
 *
 * @author annaj
 */
public class OcorrenciaPessoa {
    private String numeroocorrencia;
    private String cpfpessoa;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public OcorrenciaPessoa(String numeroocorrencia, String cpfpessoa) {
        this.numeroocorrencia = numeroocorrencia;
        this.cpfpessoa = cpfpessoa;
    }

    
    public OcorrenciaPessoa() {
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNumeroocorrencia() {
        return numeroocorrencia;
    }

    public void setNumeroocorrencia(String numeroocorrencia) {
        this.numeroocorrencia = numeroocorrencia;
    }

    public String getCpfpessoa() {
        return cpfpessoa;
    }

    public void setCpfpessoa(String cpfpessoa) {
        this.cpfpessoa = cpfpessoa;
    }
    //</editor-fold>
}
