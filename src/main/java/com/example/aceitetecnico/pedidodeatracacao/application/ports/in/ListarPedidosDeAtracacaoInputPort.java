package com.example.aceitetecnico.pedidodeatracacao.application.ports.in;

import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;

import java.util.List;

public interface ListarPedidosDeAtracacaoInputPort {
    List<PedidoDeAtracacao> run();
}
