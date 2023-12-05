package com.example.aceitetecnico.navio.adapters.out;


import com.example.aceitetecnico.navio.application.core.domain.Navio;
import com.example.aceitetecnico.navio.application.ports.out.ListarNaviosOutputPort;
import com.example.aceitetecnico.navio.database.NavioJpaRepositoryAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarNaviosOutputAdapter implements ListarNaviosOutputPort {

    private final NavioJpaRepositoryAdapter navioJpaRepositoryAdapter;
    @Override
    public List<Navio> run() {
        return navioJpaRepositoryAdapter.findAll().stream().map(Navio::from).toList();
    }
}
