package com.example.aceitetecnico.documentos.application.ports.out;

import com.example.aceitetecnico.documentos.application.database.PlanoDeCargaEntity;

public interface BuscarPlanoDeCargaPeloIdOutputPort {
    PlanoDeCargaEntity run(Long id);
}
