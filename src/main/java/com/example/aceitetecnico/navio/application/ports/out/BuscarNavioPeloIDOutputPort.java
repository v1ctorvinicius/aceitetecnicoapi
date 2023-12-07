package com.example.aceitetecnico.navio.application.ports.out;

import com.example.aceitetecnico.navio.application.core.domain.Navio;

public interface BuscarNavioPeloIDOutputPort {
    Navio run(Long id);
}
