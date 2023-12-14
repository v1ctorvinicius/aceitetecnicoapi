package com.example.aceitetecnico.template.application.ports.out;

import com.example.aceitetecnico.navio.database.NavioEntity;
import com.example.aceitetecnico.template.database.TemplateEntity;

import java.util.List;

public interface BuscarTemplatesPorNavioOutputPort {
    List<TemplateEntity> run(Long navio);
}
