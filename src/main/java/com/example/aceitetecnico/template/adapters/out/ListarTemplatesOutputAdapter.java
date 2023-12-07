package com.example.aceitetecnico.template.adapters.out;

import com.example.aceitetecnico.template.application.ports.out.ListarTemplatesOutputPort;
import com.example.aceitetecnico.template.database.TemplateEntity;
import com.example.aceitetecnico.template.database.TemplateJpaAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListarTemplatesOutputAdapter implements ListarTemplatesOutputPort {

    private final TemplateJpaAdapter templateJpaAdapter;
    @Override
    public List<TemplateEntity> run() {
        return templateJpaAdapter.findAll();
    }
}
