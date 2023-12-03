package com.example.aceitetecnico.documentos.application.core.domain.certificadoEquipBordo;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.time.LocalDate;

// certificado de segurança matítima
@Data
@AllArgsConstructor
public class CSM {
    private PDDocument pdf;
    private LocalDate validacao;
    // TODO: parametros de validação
    private LocalDate vencimento;
}
