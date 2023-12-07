package com.example.aceitetecnico.documentos.adapters.out;

import com.example.aceitetecnico.documentos.application.core.domain.PlanoDeCarga;
import com.example.aceitetecnico.documentos.application.database.PlanoDeCargaEntity;
import com.example.aceitetecnico.documentos.application.ports.out.BuscarPlanoDeCargaPeloIdOutputPort;
import com.example.aceitetecnico.documentos.database.PlanoDeCargaJpaAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BuscarPlanoDeCargaPeloIdOutputAdapter implements BuscarPlanoDeCargaPeloIdOutputPort {

    private final PlanoDeCargaJpaAdapter planoDeCargaJpaAdapter;
    @Override
    public PlanoDeCargaEntity run(Long id) {
        return planoDeCargaJpaAdapter.findById(id).orElse(null);
    }
}
