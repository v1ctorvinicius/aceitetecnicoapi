package com.example.aceitetecnico.pedidodeatracacao.application.ports.out;

import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoEntity;

import java.util.List;

public interface ListarPedidosDeAtracacaoOutputPort {
    List<PedidoDeAtracacaoEntity> run();
}
