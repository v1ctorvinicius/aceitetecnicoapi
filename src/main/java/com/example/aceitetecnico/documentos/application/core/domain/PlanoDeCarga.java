package com.example.aceitetecnico.documentos.application.core.domain;

import com.example.aceitetecnico.documentos.application.database.PlanoDeCargaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.time.LocalDate;

/*"plano de carga" é um documento essencial no transporte marítimo que detalha a distribuição e o arranjo das cargas a bordo de uma
embarcação para garantir sua estabilidade, segurança e conformidade com as regulamentações marítimas. O plano de carga é desenvolvido pelo
oficial de carregamento ou pelo mestre da embarcação e é fundamental para a operação segura e eficiente de navios e embarcações.*/

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PlanoDeCarga {
    private Long id;
    private Long templateId;
    private Long pdfId;
    private LocalDate validacao;
    // TODO: parametros de validação
    private LocalDate vencimento;


    public static PlanoDeCarga from(PlanoDeCargaEntity planoDeCargaEntity) {
        return PlanoDeCarga.builder()
                .id(planoDeCargaEntity.getId())
                .templateId(planoDeCargaEntity.getTemplateId())
                .pdfId(planoDeCargaEntity.getPdfId())
                .validacao(planoDeCargaEntity.getValidacao())
                .vencimento(planoDeCargaEntity.getVencimento())
                .build();

    }
}
