package com.example.aceitetecnico.documentos.application.ports.in;

import com.example.aceitetecnico.documentos.application.core.domain.PlanoDeCarga;

public interface BuscarPlanoDeCargaPeloIdInputPort {
    PlanoDeCarga run(Long id);
}
