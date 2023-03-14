package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entitty {
    protected Long id;
    protected LocalDateTime criacao;
    protected LocalDateTime edicao;
    protected boolean ativo;

    public Entitty(Long id, LocalDateTime criacao, LocalDate edicao, boolean ativo){
        this.id = id;
        this.criacao = criacao;
        this.edicao = edicao;
        this.ativo = ativo;
    }

    publi

}
