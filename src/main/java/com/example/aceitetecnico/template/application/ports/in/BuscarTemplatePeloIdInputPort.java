package com.example.aceitetecnico.template.application.ports.in;

import com.example.aceitetecnico.template.application.core.domain.Template;

public interface BuscarTemplatePeloIdInputPort {
    Template run (Long id);
}
