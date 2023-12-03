package com.example.aceitetecnico.template.adapters.in;

import com.example.aceitetecnico.template.application.core.domain.Template;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/templates")
public class TemplateWebRestAdapter {
    @GetMapping
    public ResponseEntity<Template> gelAll() {
        return ResponseEntity.ok(Template.builder().build());
    }
}
