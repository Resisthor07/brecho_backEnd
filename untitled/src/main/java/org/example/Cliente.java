package org.example;

import java.security.PublicKey;
import java.time.LocalDateTime;

public class Cliente extends Entitty{
    private String nome;
    private String telefone;
    private String email;
    private TipoDeLogradouro tipoLogradouro;
    private String logradouro;
    private int numResidencia;
    private String bairro;
    private String pontoReferencia;

    public Cliente(Long id, LocalDateTime criacao, LocalDateTime edicao, boolean ativo, String nome, String telefone,
                   String email, TipoDeLogradouro tipoLogradouro, String logradouro, int numResidencia, String bairro,
                   String pontoReferencia){
        super(id, criacao, edicao, ativo);
        this.id = id;
        this.criacao = criacao;
        this.edicao = edicao;
        this.ativo = ativo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.numResidencia = numResidencia;
        this.bairro = bairro;
        this.pontoReferencia = pontoReferencia;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoDeLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoDeLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumResidencia() {
        return numResidencia;
    }

    public void setNumResidencia(int numResidencia) {
        this.numResidencia = numResidencia;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }



}
