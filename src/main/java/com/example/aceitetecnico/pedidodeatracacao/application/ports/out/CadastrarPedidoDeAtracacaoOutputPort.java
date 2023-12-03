package com.example.aceitetecnico.pedidodeatracacao.application.ports.out;

import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;
import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoEntity;

public interface CadastrarPedidoDeAtracacaoOutputPort {
    PedidoDeAtracacaoEntity run(PedidoDeAtracacao pedidoDeAtracacaoEntity);
}
