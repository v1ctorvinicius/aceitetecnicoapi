package com.example.aceitetecnico.navio.application.ports.in;

import java.util.List;

import com.example.aceitetecnico.navio.application.core.domain.Navio;

public interface BuscarNavioPorFiltroInputPort {

  List<Navio> run(String nome, String bandeira, String codNavio);

}
