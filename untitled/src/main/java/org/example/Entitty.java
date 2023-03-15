package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entitty {
    protected Long id;
    protected LocalDateTime criacao;
    protected LocalDateTime edicao;
    protected boolean ativo;

    public Entitty(Long id, LocalDateTime criacao, LocalDateTime edicao, boolean ativo){
        this.id = id;
        this.criacao = criacao;
        this.edicao = edicao;
        this.ativo = ativo;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setCriacao(LocalDateTime criacao){
        this.criacao=criacao;
    }

    public  void setEdicao(LocalDateTime edicao){
        this.edicao=edicao;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
    public Long getId(){
        return id;
    }
    public LocalDateTime getCriacao() {
        return criacao;
    }
    public LocalDateTime getEdicao(){
        return edicao;
    }
    public boolean getAtivo(){
        return ativo;
    }





}
