package com.example.aceitetecnico.pedidodeatracacao.application.core.domain;

import com.example.aceitetecnico.documentos.application.core.domain.Documentos;
import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@Builder
public class PedidoDeAtracacao {
    private Long id;
    //    private AgenteMaritimo agenteMaritimo;
    //    private Navio navio;
    //    private OperadorPortuario operadorPortuario;
    private Boolean aceito;
    private Boolean revisado;
    private Boolean cancelado;
    private Documentos documentos;
    private LocalDate data;

    //TODO: Implementar
    public void validar() {
    }

    public static PedidoDeAtracacao from(PedidoDeAtracacaoEntity pedidoDeAtracacaoEntity) {
        return PedidoDeAtracacao.builder()
                .id(pedidoDeAtracacaoEntity.getId())
                .aceito(pedidoDeAtracacaoEntity.getAceito())
                .revisado(pedidoDeAtracacaoEntity.getRevisado())
                .cancelado(pedidoDeAtracacaoEntity.getCancelado())
                .data(pedidoDeAtracacaoEntity.getData())
                .build();
    }
}

