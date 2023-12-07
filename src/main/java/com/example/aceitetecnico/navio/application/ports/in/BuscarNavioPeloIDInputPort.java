package com.example.aceitetecnico.navio.application.ports.in;

import com.example.aceitetecnico.navio.application.core.domain.Navio;

public interface BuscarNavioPeloIDInputPort {
    Navio run(Long id);
}
