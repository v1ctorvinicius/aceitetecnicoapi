package com.example.aceitetecnico.pedidodeatracacao.application.ports.in;

import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;

public interface CadastrarPedidoDeAtracacaoInputPort {
    PedidoDeAtracacao run(PedidoDeAtracacao pedidoDeAtracacao);
}
