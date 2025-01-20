package br.edu.ifnmg.bd.sistema.entity;

/**
 *
 * @author annaj
 */
public class Pessoa{
    private String cpf;
    private String tipopessoa;
    private String datanascimento;
    private String nome;
    private String cep;
    private String bairro;
    private String numero;
    private String rua;
    
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public Pessoa(String cpf, String tipopessoa, String datanascimento, String nome, String cep, String bairro, String numero, String rua) {
        this.cpf = cpf;
        this.tipopessoa = tipopessoa;
        this.datanascimento = datanascimento;
        this.nome = nome;
        this.cep = cep;
        this.bairro = bairro;
        this.numero = numero;
        this.rua = rua;
    }

    public Pessoa() {
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(String tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }
    
    public void setRua(String rua) {    
        this.rua = rua;
    }

    //</editor-fold>
    
    @Override
    public String toString() {
        return"CPF=" + cpf + ", NOME=" + nome;
    }
    
    
}
