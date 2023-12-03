package com.example.aceitetecnico.pedidodeatracacao.application.core.usecases;

import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;
import com.example.aceitetecnico.pedidodeatracacao.application.ports.in.CadastrarPedidoDeAtracacaoInputPort;
import com.example.aceitetecnico.pedidodeatracacao.application.ports.out.CadastrarPedidoDeAtracacaoOutputPort;
import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CadastrarPedidoDeAtracacaoUC implements CadastrarPedidoDeAtracacaoInputPort {

    private final CadastrarPedidoDeAtracacaoOutputPort outputPort;

    @Override
    public PedidoDeAtracacao run(PedidoDeAtracacao pedidoDeAtracacao) {
        PedidoDeAtracacaoEntity novo = outputPort.run(pedidoDeAtracacao);
        return PedidoDeAtracacao.from(novo);
    }
}
