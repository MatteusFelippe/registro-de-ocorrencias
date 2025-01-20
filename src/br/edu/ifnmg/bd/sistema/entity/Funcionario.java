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
public class Funcionario{
    private String cpfpessoa;
    private Double numeroregistro;
    private String tipofuncionario;
    private String cargo;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public Funcionario(String cpfpessoa, Double numeroregistro, String tipofuncionario, String cargo) {
        this.cpfpessoa = cpfpessoa;
        this.numeroregistro = numeroregistro;
        this.tipofuncionario = tipofuncionario;
        this.cargo = cargo;
    }

    public Funcionario() {
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public String getCpfpessoa() {
        return cpfpessoa;
    }

    public void setCpfpessoa(String cpfpessoa) {
        this.cpfpessoa = cpfpessoa;
    }

    public Double getNumeroRegistro() {
        return numeroregistro;
    }

    public void setNumeroRegistro(Double numeroregistro) {
        this.numeroregistro = numeroregistro;
    }

    public String getTipofuncionario() {
        return tipofuncionario;
    }

    public void setTipofuncionario(String tipofuncionario) {
        this.tipofuncionario = tipofuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //</editor-fold>
}
