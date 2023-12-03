package com.example.aceitetecnico.documentos.application.core.domain.certificadoEquipBordo;
/*
Certificado de Navegabilidade: Este certificado atesta que a embarcação é considerada adequada para a navegação,
levando em conta seus equipamentos de navegação, sistemas de governo, entre outros.

*/

import lombok.Data;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.time.LocalDate;

@Data
public class CertificadoNavegabilidade {
    private final PDDocument pdf;
    private final LocalDate validacao;
    // TODO: parametros de validação
    private final LocalDate vencimento;
}
