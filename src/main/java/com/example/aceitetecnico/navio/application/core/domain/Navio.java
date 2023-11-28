package com.example.aceitetecnico.navio.application.core.domain;

import lombok.Data;

@Data
public class Navio {
    private String codNavio;
    private String nome;
    private String bandeira;
    private TipoAfretamento tipo;
    private double comprimento;
    private double largura;
    private double cargaMax;
    private Boolean emOperacao;
    private String planoDeAmarracao;
    // private Afretamento afretamento;
    // private Berco bercoAtual;
}

enum TipoAfretamento {
    CG,
    CNTR,
    GL,
    GS,
    GLP,
    GSM
}
