package com.example.aceitetecnico.template.application.core.usecases;

import com.example.aceitetecnico.template.application.core.domain.Template;
import com.example.aceitetecnico.template.application.ports.in.BuscarTemplatePeloIdInputPort;
import com.example.aceitetecnico.template.application.ports.out.BuscarTemplatePeloIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarTemplatePeloIdUC implements BuscarTemplatePeloIdInputPort {

    private final BuscarTemplatePeloIdOutputPort buscarTemplatePeloIdOutputPort;

    @Override
    public Template run(Long id) {
        return Template.from( buscarTemplatePeloIdOutputPort.run(id));
    }
}
