package com.example.aceitetecnico.navio.adapters.out;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import com.example.aceitetecnico.navio.application.core.domain.Navio;
import com.example.aceitetecnico.navio.application.ports.out.BuscarNavioPeloIDOutputPort;
import com.example.aceitetecnico.navio.application.ports.out.BuscarNavioPorFiltroOutputPort;
import com.example.aceitetecnico.navio.database.NavioEntity;
import com.example.aceitetecnico.navio.database.NavioJpaRepositoryAdapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class BuscarNavioPorFiltroOutputAdapter implements BuscarNavioPorFiltroOutputPort {

  private final NavioJpaRepositoryAdapter navioJpaRepositoryAdapter;

  @Override
  public List<Navio> run(String nome, String bandeira, String codNavio) {

    if (codNavio != null ) {

    }
    
    List<NavioEntity> entities = navioJpaRepositoryAdapter.findByNome(nome);

    return entities.stream().map(Navio::from).toList();
  }

}
