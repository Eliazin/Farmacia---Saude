/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;


/**
 *
 * @author Macrr
 */
public class Cliente {
    
    //atributos
    private String nomeUser = "";
    private String senha = "";
    private String nome = "";
    private String cpf = "";
    private String email = "";
    private String celular = "";
    private String rua = "";
    private String cep = "";
    private String bairro = "";
    private String numero = "";
    private boolean adm;
    
    //GET e SET

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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
    
    public void setAdm(String cep) {
        this.adm = adm;
    }

    public boolean getAdm() {
        return adm;
    }
    
    
    public void limpaCliente(){
        
       nomeUser = "";
       senha = "";
       nome = "";
       cpf = "";
       email = "";
       celular = "";
       rua = "";
       cep = "";
       bairro = "";
       numero = "";
    }   
    
}
