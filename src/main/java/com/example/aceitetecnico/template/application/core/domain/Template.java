package com.example.aceitetecnico.template.application.core.domain;

import com.example.aceitetecnico.documentos.application.core.domain.PlanoDeCarga;
import com.example.aceitetecnico.documentos.application.core.usecases.BuscarPlanoDeCargaPeloIdUC;
import com.example.aceitetecnico.template.application.core.usecases.BuscarTemplatePeloIdUC;
import com.example.aceitetecnico.template.database.TemplateEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Template {
    private Long id;
    private Long pedidoId;
    private Long navioId;
    private Long planoDeCargaId;
    private String status;

//    TODO tirar daqui
//    private final BuscarPlanoDeCargaPeloIdUC buscarPlanoDeCargaPeloIdUC;
//
//    public boolean isValid() {
//        PlanoDeCarga planoDeCarga = buscarPlanoDeCargaPeloIdUC.run(this.planoDeCargaId);
//        System.out.println(planoDeCarga);
//        return planoDeCarga != null && (!planoDeCarga.getVencimento().isBefore(LocalDate.now()));
//    }


    public static Template from(TemplateEntity entity) {
        return Template.builder()
                .id(entity.getId())
                .pedidoId(entity.getPedidoId())
                .navioId(entity.getNavioId())
                .planoDeCargaId(entity.getPlanoDeCargaId())
                .status(entity.getStatus())
                .build();

    }
}
