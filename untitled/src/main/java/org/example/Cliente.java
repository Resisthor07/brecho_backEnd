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



}
