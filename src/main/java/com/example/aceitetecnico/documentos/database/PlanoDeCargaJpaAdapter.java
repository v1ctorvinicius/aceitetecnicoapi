package com.example.aceitetecnico.documentos.database;

import com.example.aceitetecnico.documentos.application.database.PlanoDeCargaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoDeCargaJpaAdapter extends JpaRepository<PlanoDeCargaEntity, Long> {
}
