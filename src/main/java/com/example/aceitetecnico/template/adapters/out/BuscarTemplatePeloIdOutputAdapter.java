package com.example.aceitetecnico.template.adapters.out;

import com.example.aceitetecnico.template.application.ports.out.BuscarTemplatePeloIdOutputPort;
import com.example.aceitetecnico.template.database.TemplateEntity;
import com.example.aceitetecnico.template.database.TemplateJpaAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BuscarTemplatePeloIdOutputAdapter implements BuscarTemplatePeloIdOutputPort {

    private final TemplateJpaAdapter templateJpaAdapter;
    @Override
    public TemplateEntity run(Long id) {
        return templateJpaAdapter.findById(id).get();
    }
}
