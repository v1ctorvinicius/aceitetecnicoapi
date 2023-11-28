package com.example.aceitetecnico.pedidodeatracacao.database;

import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoDeAtracacaoJpaRepositoryAdapter extends JpaRepository<PedidoDeAtracacaoEntity, Long> {
}
