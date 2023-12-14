package com.example.aceitetecnico.template.application.core.usecases;

import com.example.aceitetecnico.template.application.ports.in.BuscarTemplatesPorNavioInputPort;
import com.example.aceitetecnico.template.application.ports.out.BuscarTemplatesPorNavioOutputPort;
import com.example.aceitetecnico.template.database.TemplateEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import com.example.aceitetecnico.template.application.core.domain.Template;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BuscarTemplatesPorNavioUC implements BuscarTemplatesPorNavioInputPort {

    private final BuscarTemplatesPorNavioOutputPort buscarTemplatesPorNavioOutputPort;

    @Override
    public List<Template> run(Long navioId) {
        List<TemplateEntity> templateEntities = buscarTemplatesPorNavioOutputPort.run(navioId);
        return buscarTemplatesPorNavioOutputPort.run(navioId).stream().map(Template::from).toList();
    }
}
