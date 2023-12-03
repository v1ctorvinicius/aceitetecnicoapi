package com.example.aceitetecnico.template.application.ports.in;

import com.example.aceitetecnico.template.application.core.domain.Template;

import java.util.List;

public interface ListarTemplatesInputPort {
    List<Template> run();
}
