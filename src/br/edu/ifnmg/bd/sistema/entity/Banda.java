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
public class Banda {
    private String nome;
    private String historia;
    private String site;
    private String ordemapresentacao;
    private String nomelocalshow;
    private String datalineupshow;
    private String horainicioshow;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public Banda(String nome, String historia, String site, String ordemapresentacao, String nomelocalshow, String datalineupshow, String horainicioshow) {
        this.nome = nome;
        this.historia = historia;
        this.site = site;
        this.ordemapresentacao = ordemapresentacao;
        this.nomelocalshow = nomelocalshow;
        this.datalineupshow = datalineupshow;
        this.horainicioshow = horainicioshow;
    }
    
    public Banda() {
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getOrdemapresentacao() {
        return ordemapresentacao;
    }

    public void setOrdemapresentacao(String ordemapresentacao) {
        this.ordemapresentacao = ordemapresentacao;
    }

    public String getNomelocalshow() {
        return nomelocalshow;
    }

    public void setNomelocalshow(String nomelocalshow) {
        this.nomelocalshow = nomelocalshow;
    }

    public String getDatalineupshow() {
        return datalineupshow;
    }

    public void setDatalineupshow(String datalineupshow) {
        this.datalineupshow = datalineupshow;
    }

    public String getHorainicioshow() {
        return horainicioshow;
    }

    public void setHorainicioshow(String horainicioshow) {
        this.horainicioshow = horainicioshow;
    }
    
    //</editor-fold>

    @Override
    public String toString() {
        return "Nome da Banda: " + nome + ", Hora do Show: " + horainicioshow;
    }
    
    
}
