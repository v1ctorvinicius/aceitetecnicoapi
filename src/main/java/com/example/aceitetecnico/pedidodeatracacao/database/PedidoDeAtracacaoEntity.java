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
//    private Navio navio;
//    private OperadorPortuario operadorPortuario;
    private Boolean aceito;
    private Boolean revisado;
    private Boolean cancelado;
    //    private Documentos documentos;
    private LocalDate data;

    public static PedidoDeAtracacaoEntity from(PedidoDeAtracacao pedidoDeAtracacao) {
        return PedidoDeAtracacaoEntity.builder().aceito(pedidoDeAtracacao.getAceito()).revisado(pedidoDeAtracacao.getRevisado()).cancelado(pedidoDeAtracacao.getCancelado()).data(pedidoDeAtracacao.getData()).build();
    }
}
