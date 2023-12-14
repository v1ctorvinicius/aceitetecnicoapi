package com.example.aceitetecnico.navio.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NavioJpaRepositoryAdapter extends JpaRepository<NavioEntity, Long> {
  List<NavioEntity> findByNome(String name);
}
