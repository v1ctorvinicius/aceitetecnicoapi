package PedidoDeAtracacao;

import com.example.aceitetecnico.pedidodeatracacao.application.core.domain.PedidoDeAtracacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

public class PedidoDeAtracacaoTest {

    @Test
    void deveCriarPedidoDeAtracacaoValido() {
        PedidoDeAtracacao pedidoDeAtracacao = new PedidoDeAtracacao(
                false,
                false,
                false,
                LocalDate.now()
        );

        Assertions.assertNotNull(pedidoDeAtracacao);
    }


}
