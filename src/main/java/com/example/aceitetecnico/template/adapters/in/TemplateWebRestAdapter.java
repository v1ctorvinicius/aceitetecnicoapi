package com.example.aceitetecnico.template.adapters.in;

import com.example.aceitetecnico.template.application.core.domain.Template;
import com.example.aceitetecnico.template.application.core.usecases.BuscarTemplatePeloIdUC;
import com.example.aceitetecnico.template.application.core.usecases.ListarTemplatesUC;
import com.example.aceitetecnico.template.application.ports.in.BuscarTemplatePeloIdInputPort;
import com.example.aceitetecnico.template.application.ports.in.ListarTemplatesInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/templates")
public class TemplateWebRestAdapter {

    private final BuscarTemplatePeloIdInputPort buscarTemplatePeloIdInputPort;
    private final ListarTemplatesInputPort listarTemplatesInputPort;

    @GetMapping
    public ResponseEntity<List<Template>> gelAll() {
        return ResponseEntity.ok(listarTemplatesInputPort.run());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Template> getById(@PathVariable Long id) {
        return ResponseEntity.ok(buscarTemplatePeloIdInputPort.run(id));
    }

}
