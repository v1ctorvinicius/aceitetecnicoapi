package com.example.aceitetecnico.documentos.application.database;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "plano_de_carga")
public class PlanoDeCargaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long templateId;
    private Long pdfId;
    private LocalDate validacao;
    // TODO: parametros de validação
    private LocalDate vencimento;


}
