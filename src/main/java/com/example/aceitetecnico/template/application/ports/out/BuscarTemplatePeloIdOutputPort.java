package com.example.aceitetecnico.template.application.ports.out;

import com.example.aceitetecnico.template.application.core.domain.Template;
import com.example.aceitetecnico.template.database.TemplateEntity;

public interface BuscarTemplatePeloIdOutputPort {
    TemplateEntity run(Long id);
}
