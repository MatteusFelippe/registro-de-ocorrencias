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
public class RelatorioBanda {
    private String nome;
    private String nomelocal;
    private String site;

    public RelatorioBanda() {
    }

    public RelatorioBanda(String nome, String nomelocal, String site) {
        this.nome = nome;
        this.nomelocal = nomelocal;
        this.site = site;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomelocal() {
        return nomelocal;
    }

    public void setNomelocal(String nomelocal) {
        this.nomelocal = nomelocal;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nNome do Local: " + nomelocal + "\nSite: " + site + "\n\n";
    }
    
    
}
