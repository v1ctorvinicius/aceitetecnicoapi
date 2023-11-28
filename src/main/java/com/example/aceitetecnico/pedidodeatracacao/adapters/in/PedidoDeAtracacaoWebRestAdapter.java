package com.example.aceitetecnico.pedidodeatracacao.adapters.in;

import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;
import com.example.aceitetecnico.pedidodeatracacao.application.ports.in.ListarPedidosDeAtracacaoInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedido-de-atracacao")
@RequiredArgsConstructor
public class PedidoDeAtracacaoWebRestAdapter {


    private final ListarPedidosDeAtracacaoInputPort listarPedidosDeAtracacaoInputPort;

    @GetMapping
    public List<PedidoDeAtracacao> findAll() {
        return listarPedidosDeAtracacaoInputPort.run();
    }
}
