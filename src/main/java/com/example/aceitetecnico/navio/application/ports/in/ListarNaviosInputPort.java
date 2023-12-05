package com.example.aceitetecnico.navio.application.ports.in;

import com.example.aceitetecnico.navio.application.core.domain.Navio;

import java.util.List;

public interface ListarNaviosInputPort {
    List<Navio> run();
}
