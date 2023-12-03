package com.example.aceitetecnico.documentos.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.time.LocalDate;

/*"plano de carga" é um documento essencial no transporte marítimo que detalha a distribuição e o arranjo das cargas a bordo de uma
embarcação para garantir sua estabilidade, segurança e conformidade com as regulamentações marítimas. O plano de carga é desenvolvido pelo
oficial de carregamento ou pelo mestre da embarcação e é fundamental para a operação segura e eficiente de navios e embarcações.*/

@Data
@AllArgsConstructor
public class PlanoDeCarga {
    private final PDDocument pdf;
    private final LocalDate validacao;
    // TODO: parametros de validação
    private final LocalDate vencimento;
}
