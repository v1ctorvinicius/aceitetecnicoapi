package com.example.aceitetecnico.navio.application.core.usecases;

import com.example.aceitetecnico.navio.application.core.domain.Navio;
import com.example.aceitetecnico.navio.application.ports.in.ListarNaviosInputPort;
import com.example.aceitetecnico.navio.application.ports.out.ListarNaviosOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarNaviosUC implements ListarNaviosInputPort {

    private final ListarNaviosOutputPort listarNaviosOutputPort;

    @Override
    public List<Navio> run() {
        return listarNaviosOutputPort.run();
    }
}
