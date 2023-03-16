package org.example;

public class Produto {
    private String codigo;
    private String nome;
    private TipoProduto tipo;
    private String cor;
    private String tamanho;
    private List imagens;
    private List imagemPrincipal;
    private String descricao;
    private String marca;
    private boolean disponibilidade;
    private int quantidade;

    public Produto() {
    }

    public Produto(String codigo, String nome, TipoProduto tipo, String cor,
                   String tamanho, List imagens, List imagemPrincipal, String descricao,
                   String marca, boolean disponibilidade, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.imagens = imagens;
        this.imagemPrincipal = imagemPrincipal;
        this.descricao = descricao;
        this.marca = marca;
        this.disponibilidade = disponibilidade;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public List getImagens() {
        return imagens;
    }

    public void setImagens(List imagens) {
        this.imagens = imagens;
    }

    public List getImagemPrincipal() {
        return imagemPrincipal;
    }

    public void setImagemPrincipal(List imagemPrincipal) {
        this.imagemPrincipal = imagemPrincipal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
