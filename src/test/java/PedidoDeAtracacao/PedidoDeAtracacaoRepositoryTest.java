package PedidoDeAtracacao;

import com.example.aceitetecnico.pedidodeatracacao.adapters.output.PedidoDeAtracacaoJpaRepositoryAdapter;
import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;
import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PedidoDeAtracacaoRepositoryTest {

    @Autowired
    private PedidoDeAtracacaoJpaRepositoryAdapter pedidoDeAtracacaoJpaRepositoryAdapter;

    @Test
    void deveSalvarUmPedidoDeAtracacaoValido(){

        PedidoDeAtracacao pedidoDeAtracacao = new PedidoDeAtracacao(
                false,
                false,
                false,
                LocalDate.now()
        );

//        pedidoDeAtracacaoJpaRepositoryAdapter.save(PedidoDeAtracacaoEntity.from(pedidoDeAtracacao));
        System.out.println("pedidoDeAtracacao = " + pedidoDeAtracacaoJpaRepositoryAdapter.save(PedidoDeAtracacaoEntity.from(pedidoDeAtracacao)));

    }
}
