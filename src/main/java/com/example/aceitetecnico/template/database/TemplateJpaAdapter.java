package com.example.aceitetecnico.template.database;

import com.example.aceitetecnico.template.application.core.domain.Template;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateJpaAdapter extends JpaRepository<TemplateEntity, Long> {

}
