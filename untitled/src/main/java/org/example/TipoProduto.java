package org.example;

public class TipoProduto {
    private String genero;
    private String tipoProduto;
    private String estacao;

    public String getGenero(){
        return genero;
    }

    public String getTipoProduto(){
        return tipoProduto;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setGenero (String genero){
        this.genero = genero;
    }

    public void setTipoProduto(String tipoProduto){
        this.tipoProduto = tipoProduto;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }



}
