package com.example.aceitetecnico.documentos.application.core.usecases;

import com.example.aceitetecnico.documentos.application.core.domain.PlanoDeCarga;
import com.example.aceitetecnico.documentos.application.ports.in.BuscarPlanoDeCargaPeloIdInputPort;
import com.example.aceitetecnico.documentos.application.ports.out.BuscarPlanoDeCargaPeloIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarPlanoDeCargaPeloIdUC implements BuscarPlanoDeCargaPeloIdInputPort {

    private final BuscarPlanoDeCargaPeloIdOutputPort buscarPlanoDeCargaPeloIdOutputPort;


    @Override
    public PlanoDeCarga run(Long id) {
        return PlanoDeCarga.from(buscarPlanoDeCargaPeloIdOutputPort.run(id));
    }
}
