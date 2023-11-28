package com.example.aceitetecnico.pedidodeatracacao.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@Builder
public class PedidoDeAtracacao {
//    private AgenteMaritimo agenteMaritimo;
//    private Navio navio;
//    private OperadorPortuario operadorPortuario;
    private Boolean aceito;
    private Boolean revisado;
    private Boolean cancelado;
//    private Documentos documentos;
    private LocalDate data;

    //TODO: Implementar
    public void validar() {

    }
}

