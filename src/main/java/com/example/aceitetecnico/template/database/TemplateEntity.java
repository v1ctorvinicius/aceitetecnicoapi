package com.example.aceitetecnico.template.database;

import com.example.aceitetecnico.documentos.application.core.domain.PlanoDeCarga;
import com.example.aceitetecnico.documentos.application.database.PlanoDeCargaEntity;
import com.example.aceitetecnico.template.application.core.domain.Template;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Template")
public class TemplateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pedidoId;
    private Long navioId;
    private Long planoDeCargaId;
    private String status;
    // outros documentos necessarios para o pedido de atracação


    public static TemplateEntity from(Template template) {
        return TemplateEntity.builder()
                .id(template.getId())
                .pedidoId(template.getPedidoId())
                .navioId(template.getNavioId())
                .planoDeCargaId(template.getPlanoDeCargaId())
                .status(template.getStatus())
                .build();

    }


}
