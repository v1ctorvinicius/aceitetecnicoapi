package com.example.aceitetecnico.navio.adapters.in;

import com.example.aceitetecnico.navio.application.core.domain.Navio;
import com.example.aceitetecnico.navio.application.ports.in.BuscarNavioPeloIDInputPort;
import com.example.aceitetecnico.navio.application.ports.in.ListarNaviosInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/navios")
@RequiredArgsConstructor
public class NavioWebRestAdapter {

    private final ListarNaviosInputPort listarNaviosInputPort;
    private final BuscarNavioPeloIDInputPort buscarNavioPeloIDInputPort;



    @GetMapping
    public List<Navio> findAll() {
        return listarNaviosInputPort.run();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Navio> findById(@PathVariable Long id) {
        return ResponseEntity.ok(buscarNavioPeloIDInputPort.run(id));
    }

}
