package com.example.aceitetecnico.navio.adapters.out;

import com.example.aceitetecnico.navio.application.core.domain.Navio;
import com.example.aceitetecnico.navio.application.ports.out.BuscarNavioPeloIDOutputPort;
import com.example.aceitetecnico.navio.database.NavioJpaRepositoryAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class buscarNavioPeloIDOutputAdapter implements BuscarNavioPeloIDOutputPort  {

    private final NavioJpaRepositoryAdapter navioJpaRepositoryAdapter;
    @Override
    public Navio run(Long id) {
        return navioJpaRepositoryAdapter.findById(id).map(Navio::from).orElse(null);
    }
}
