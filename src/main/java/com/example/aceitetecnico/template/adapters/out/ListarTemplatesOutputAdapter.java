package com.example.aceitetecnico.template.adapters.out;

import com.example.aceitetecnico.template.application.ports.out.ListarTemplatesOutputPort;
import com.example.aceitetecnico.template.database.TemplateEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListarTemplatesOutputAdapter implements ListarTemplatesOutputPort {
    @Override
    public List<TemplateEntity> run() {
        return null;
    }
}
