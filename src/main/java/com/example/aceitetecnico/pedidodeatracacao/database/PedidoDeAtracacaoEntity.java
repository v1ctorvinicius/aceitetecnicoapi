package com.example.aceitetecnico.pedidodeatracacao.database;

import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pedidodeatracacao")
public class PedidoDeAtracacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //    private AgenteMaritimo agenteMaritimo;
    private Long navioId;
    //    private OperadorPortuario operadorPortuario;
    private Boolean aceito;
    private Boolean revisado;
    private Boolean cancelado;
    //    private Documentos documentos;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public static PedidoDeAtracacaoEntity from(PedidoDeAtracacao pedidoDeAtracacao) {
        return PedidoDeAtracacaoEntity.builder()
                .id(pedidoDeAtracacao.getId())
                .navioId(pedidoDeAtracacao.getNavioId())
                .aceito(pedidoDeAtracacao.getAceito())
                .revisado(pedidoDeAtracacao.getRevisado())
                .cancelado(pedidoDeAtracacao.getCancelado())
                .dataInicio(pedidoDeAtracacao.getDataInicio())
                .dataFim(pedidoDeAtracacao.getDataFim())
                .build();
    }
}
