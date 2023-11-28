package com.example.aceitetecnico.documentos.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.File;

@Data
@AllArgsConstructor
@Builder
public class Documentos {
    private File planoDeCarga;
    private File certificadoEquipamentoBordo;

}
