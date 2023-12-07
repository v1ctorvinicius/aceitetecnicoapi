package com.example.aceitetecnico.navio.application.core.usecases;

import com.example.aceitetecnico.navio.application.core.domain.Navio;
import com.example.aceitetecnico.navio.application.ports.in.BuscarNavioPeloIDInputPort;
import com.example.aceitetecnico.navio.application.ports.out.BuscarNavioPeloIDOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BuscarNavioPeloIDUC implements BuscarNavioPeloIDInputPort {

    private final BuscarNavioPeloIDOutputPort outputPort;

    @Override
    public Navio run(Long id) {
        return outputPort.run(id);
    }
}



