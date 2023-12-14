package com.example.aceitetecnico.navio.application.core.usecases;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import com.example.aceitetecnico.navio.application.core.domain.Navio;
import com.example.aceitetecnico.navio.application.ports.in.BuscarNavioPorFiltroInputPort;
import com.example.aceitetecnico.navio.application.ports.out.BuscarNavioPorFiltroOutputPort;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class BuscarNavioPorFiltroUC implements BuscarNavioPorFiltroInputPort {

  private final BuscarNavioPorFiltroOutputPort buscarNavioPorFiltroOutputPort;

  @Override
  public List<Navio> run(String nome, String bandeira, String codNavio) {
    return buscarNavioPorFiltroOutputPort.run(nome, bandeira, codNavio);
  }

}
