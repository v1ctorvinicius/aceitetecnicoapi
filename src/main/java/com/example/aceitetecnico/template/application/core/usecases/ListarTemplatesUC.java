package com.example.aceitetecnico.template.application.core.usecases;

import com.example.aceitetecnico.template.application.core.domain.Template;
import com.example.aceitetecnico.template.application.ports.in.ListarTemplatesInputPort;
import com.example.aceitetecnico.template.application.ports.out.ListarTemplatesOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ListarTemplatesUC implements ListarTemplatesInputPort {

    private final ListarTemplatesOutputPort outputPort;
    @Override
    public List<Template> run() {
        return null;
    }
}
