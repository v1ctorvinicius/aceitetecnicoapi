package com.example.aceitetecnico.template.database;

import com.example.aceitetecnico.template.application.core.domain.Template;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemplateJpaAdapter extends JpaRepository<TemplateEntity, Long> {
    List<TemplateEntity> findAllByNavioId(Long navioId);
}
