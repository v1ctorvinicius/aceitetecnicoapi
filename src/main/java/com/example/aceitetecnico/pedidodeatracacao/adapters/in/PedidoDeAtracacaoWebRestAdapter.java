package com.example.aceitetecnico.pedidodeatracacao.adapters.in;

import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;
import com.example.aceitetecnico.pedidodeatracacao.application.ports.in.CadastrarPedidoDeAtracacaoInputPort;
import com.example.aceitetecnico.pedidodeatracacao.application.ports.in.ListarPedidosDeAtracacaoInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos-de-atracacao")
@RequiredArgsConstructor
public class PedidoDeAtracacaoWebRestAdapter {

    private final ListarPedidosDeAtracacaoInputPort listarPedidosDeAtracacaoInputPort;
    private final CadastrarPedidoDeAtracacaoInputPort cadastrarPedidoDeAtracacaoInputPort;

    @GetMapping
    public List<PedidoDeAtracacao> findAll() {
        return listarPedidosDeAtracacaoInputPort.run();
    }

    @PostMapping
    public ResponseEntity<PedidoDeAtracacao> save(@RequestBody PedidoDeAtracacao pedidoDeAtracacao) {
        return ResponseEntity.ok().body(cadastrarPedidoDeAtracacaoInputPort.run(pedidoDeAtracacao));
    }


}
