package com.example.aceitetecnico.navio.adapters.in;

import com.example.aceitetecnico.navio.application.core.domain.Navio;
import com.example.aceitetecnico.navio.application.ports.in.ListarNaviosInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/navios")
@RequiredArgsConstructor
public class NavioWebRestAdapter {

    private final ListarNaviosInputPort listarNaviosInputPort;
    @GetMapping
    public List<Navio> findAll() {
        return listarNaviosInputPort.run();
    }

}
