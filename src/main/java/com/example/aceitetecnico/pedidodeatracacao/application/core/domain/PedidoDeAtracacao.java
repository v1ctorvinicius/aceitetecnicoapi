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
    private Long navioId;
    //    private OperadorPortuario operadorPortuario;
    private Boolean aceito;
    private Boolean revisado;
    private Boolean cancelado;
    private Documentos documentos;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    //TODO: Implementar
    public void validar() {
    }

    public static PedidoDeAtracacao from(PedidoDeAtracacaoEntity pedidoDeAtracacaoEntity) {
        return PedidoDeAtracacao.builder()
                .id(pedidoDeAtracacaoEntity.getId())
                .navioId(pedidoDeAtracacaoEntity.getNavioId())
                .aceito(pedidoDeAtracacaoEntity.getAceito())
                .revisado(pedidoDeAtracacaoEntity.getRevisado())
                .cancelado(pedidoDeAtracacaoEntity.getCancelado())
                .dataInicio(pedidoDeAtracacaoEntity.getDataInicio())
                .dataFim(pedidoDeAtracacaoEntity.getDataFim())
                .build();
    }
}

