package com.example.aceitetecnico.pedidodeatracacao.application.core.usecases;

import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;
import com.example.aceitetecnico.pedidodeatracacao.application.ports.in.ListarPedidosDeAtracacaoInputPort;
import com.example.aceitetecnico.pedidodeatracacao.application.ports.out.ListarPedidosDeAtracacaoOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarPedidosDeAtracacaoUC implements ListarPedidosDeAtracacaoInputPort {

    private final ListarPedidosDeAtracacaoOutputPort outputPort;


    @Override
    public List<PedidoDeAtracacao> run() {
        List<PedidoDeAtracacao> pedidos = outputPort.run().stream().map(PedidoDeAtracacao::from).toList();
        return pedidos;
    }
}
