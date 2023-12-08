package com.example.aceitetecnico.documentos.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.File;

@Data
@AllArgsConstructor
@Builder
public class Documentos {

//    I. Stowage Plan e/ou Plano de Carga / Descarga;
//    II. Packing List;
//    III. BL’s;
//    IV. FISPQ, quando aplicável;
//    V. Certificados dos equipamentos de bordo, caso sejam utilizados na operação; e,
//    VI. Autorização de Afretamento – AA ou Certificado de Autorização de Afretamento - CAA,
//    para casos aplicáveis conforme regras de Navegação de Cabotagem para navios de
//    bandeira estrangeira no território brasileiro, estabelecidas pela ANTAQ.

    private File certificadoVistoria;
    private File planoDeCarga;
    private File certificadoEquipamentoBordo;
    private String status; //valido, invalido, pendencia
}
