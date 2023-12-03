package com.example.aceitetecnico.template.application.ports.out;

import com.example.aceitetecnico.template.database.TemplateEntity;

import java.util.List;

public interface ListarTemplatesOutputPort {
    List<TemplateEntity> run();
}
