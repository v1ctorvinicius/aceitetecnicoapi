package com.example.aceitetecnico.navio.database;

import com.example.aceitetecnico.navio.application.core.domain.Navio;
import com.example.aceitetecnico.template.application.core.domain.Template;
import com.example.aceitetecnico.template.database.TemplateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Navio")
public class NavioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codNavio")
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

    public static NavioEntity from(Navio navio){
        return NavioEntity.builder()
                .codNavio(navio.getCodNavio())
                .nome(navio.getNome())
                .bandeira(navio.getBandeira())
                .comprimento(navio.getComprimento())
                .largura(navio.getLargura())
                .cargaMax(navio.getCargaMax())
                .emOperacao(navio.getEmOperacao())
                .planoDeAmarracao(navio.getPlanoDeAmarracao())
                .idTemplate(navio.getIdTemplate())
                .build();

    }

}
