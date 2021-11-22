
package Objetos;


public class Produto {
    
    //Atributos 
    private String descricao;
    private String tipo;
    private String fornecedor;
    private int qtdeEstoqueMin;
    private int qtdeEstoque;
    private String dataFab;
    private String dataVenc;
    private float precoCusto;
    private float precoVenda;
    private float icms;
    private float lucro;
    private String observacao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQtdeEstoqueMin() {
        return qtdeEstoqueMin;
    }

    public void setQtdeEstoqueMin(int qtdeEstoqueMin) {
        this.qtdeEstoqueMin = qtdeEstoqueMin;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public String getDataFab() {
        return dataFab;
    }

    public void setDataFab(String dataFab) {
        this.dataFab = dataFab;
    }

    public String getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public float getIcms() {
        return icms;
    }

    public void setIcms(float icms) {
        this.icms = icms;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    public void limpaProduto(){
        
        descricao = "";
        tipo = "";
        fornecedor = "";
        qtdeEstoqueMin = 0;
        qtdeEstoque = 0;
        dataFab = "";
        dataVenc = "";
        precoCusto = 0;
        precoVenda = 0;
        icms = 0;
        lucro = 0;
        observacao = "";
        
    }
}
