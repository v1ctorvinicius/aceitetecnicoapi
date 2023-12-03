package com.example.aceitetecnico.pedidodeatracacao.adapters.out;

import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;
import com.example.aceitetecnico.pedidodeatracacao.application.ports.in.CadastrarPedidoDeAtracacaoInputPort;
import com.example.aceitetecnico.pedidodeatracacao.application.ports.out.CadastrarPedidoDeAtracacaoOutputPort;
import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoEntity;
import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoJpaRepositoryAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CadastrarPedidoDeAtracacaoOutputAdapter implements CadastrarPedidoDeAtracacaoOutputPort {

    private final PedidoDeAtracacaoJpaRepositoryAdapter jpaAdapter;

    @Override
    public PedidoDeAtracacaoEntity run(PedidoDeAtracacao pedidoDeAtracacao) {
        PedidoDeAtracacaoEntity novo = PedidoDeAtracacaoEntity.from(pedidoDeAtracacao);
        return jpaAdapter.save(novo);
    }
}
