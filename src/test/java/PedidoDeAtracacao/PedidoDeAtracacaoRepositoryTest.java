package PedidoDeAtracacao;

import com.example.aceitetecnico.pedidodeatracacao.database.PedidoDeAtracacaoJpaRepositoryAdapter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PedidoDeAtracacaoRepositoryTest {

    @Autowired
    private PedidoDeAtracacaoJpaRepositoryAdapter pedidoDeAtracacaoJpaRepositoryAdapter;

    @Test
    void deveSalvarUmPedidoDeAtracacaoValido(){

//        PedidoDeAtracacao pedidoDeAtracacao = new PedidoDeAtracacao(
//                false,
//                false,
//                false,
//                LocalDate.now()
//        );

//        pedidoDeAtracacaoJpaRepositoryAdapter.save(PedidoDeAtracacaoEntity.from(pedidoDeAtracacao));
//        System.out.println("pedidoDeAtracacao = " + pedidoDeAtracacaoJpaRepositoryAdapter.save(PedidoDeAtracacaoEntity.from(pedidoDeAtracacao)));

    }
}
