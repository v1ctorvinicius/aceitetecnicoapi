package com.example.aceitetecnico.navio.application.ports.out;

import com.example.aceitetecnico.navio.application.core.domain.Navio;

import java.util.List;

public interface ListarNaviosOutputPort {
    List<Navio> run();
}
