package com.example.aceitetecnico.navio.application.ports.out;

import java.util.List;

import com.example.aceitetecnico.navio.application.core.domain.Navio;

public interface BuscarNavioPorFiltroOutputPort {
  List<Navio> run(String nome, String bandeira, String codNavio);
}
