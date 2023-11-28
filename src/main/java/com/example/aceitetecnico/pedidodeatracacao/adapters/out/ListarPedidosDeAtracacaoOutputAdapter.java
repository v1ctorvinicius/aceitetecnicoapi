package com.example.aceitetecnico.pedidodeatracacao.adapters.out;

import com.example.aceitetecnico.pedidodeatracacao.application.ports.out.ListarPedidosDeAtracacaoOutputPort;
import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoEntity;
import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoJpaRepositoryAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ListarPedidosDeAtracacaoOutputAdapter implements ListarPedidosDeAtracacaoOutputPort {

    private final PedidoDeAtracacaoJpaRepositoryAdapter pedidoDeAtracacaoJpaRepositoryAdapter;

    @Override
    public List<PedidoDeAtracacaoEntity> run() {
        return pedidoDeAtracacaoJpaRepositoryAdapter.findAll();
    }
}
