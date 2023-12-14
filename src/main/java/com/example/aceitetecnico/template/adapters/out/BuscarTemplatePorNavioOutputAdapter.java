package com.example.aceitetecnico.template.adapters.out;

import com.example.aceitetecnico.template.application.ports.out.BuscarTemplatesPorNavioOutputPort;
import com.example.aceitetecnico.template.database.TemplateEntity;
import com.example.aceitetecnico.template.database.TemplateJpaAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class BuscarTemplatePorNavioOutputAdapter implements BuscarTemplatesPorNavioOutputPort {

    private final TemplateJpaAdapter templateJpaAdapter;

    @Override
    public List<TemplateEntity> run(Long navio) {
        List<TemplateEntity> templateEntities = templateJpaAdapter.findAllByNavioId(navio);
        return templateEntities;
    }
}
