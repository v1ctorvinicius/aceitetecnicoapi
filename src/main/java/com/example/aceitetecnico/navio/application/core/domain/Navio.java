package com.example.aceitetecnico.navio.application.core.domain;

import com.example.aceitetecnico.navio.database.NavioEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Navio {
    private Long id;
    private String codNavio;
    private String nome;
    private String bandeira;
    //    private TipoAfretamento tipo;
    private double comprimento;
    private double largura;
    private double cargaMax;
    private Boolean emOperacao;
    private String planoDeAmarracao;
    // private Afretamento afretamento;
    // private Berco bercoAtual;
    private Long idTemplate;

    public static Navio from(NavioEntity entity) {
        return Navio.builder()
                .id(entity.getId())
                .codNavio(entity.getCodNavio())
                .nome(entity.getNome())
                .bandeira(entity.getBandeira())
                .comprimento(entity.getComprimento())
                .largura(entity.getLargura())
                .cargaMax(entity.getCargaMax())
                .emOperacao(entity.getEmOperacao())
                .planoDeAmarracao(entity.getPlanoDeAmarracao())
                .idTemplate(entity.getIdTemplate())
                .build();

    }
}

