
package Objetos;

public class Fornecedor {
    
    //atributos
    private String nomeForn = "";
    private String nomeFant = "";
    private String email = "";
    private String cnpj = "";
    private String inscEst = "";
    private String celular = "";
    private String telefone = "";
    private String endereco = "";
    private String numero = "";
    private String bairro = "";
    private String cidade = "";
    private String uf = "";
    private String cep = "";
    
    //GET e SET

    public String getNomeForn() {
        return nomeForn;
    }

    public void setNomeForn(String nomeForn) {
        this.nomeForn = nomeForn;
    }

    public String getNomeFant() {
        return nomeFant;
    }

    public void setNomeFant(String nomeFant) {
        this.nomeFant = nomeFant;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEst() {
        return inscEst;
    }

    public void setInscEst(String inscEst) {
        this.inscEst = inscEst;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    
    public void limpaFornecedor(){
        
    nomeForn = "";
    nomeFant = "";
    email = "";
    cnpj = "";
    inscEst = "";
    celular = "";
    telefone = "";
    endereco = "";
    numero = "";
    bairro = "";
    cidade = "";
    uf = "";
    cep = "";
    }   
}
