package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void deveContarItensDisponiveisCardapio() {
        Cardapio cardapio = new Cardapio(
                new Item("X-Burguer", true),
                new Item("Burguer Vegano", true),
                new Item("Milkshake", false),
                new Item("Suco Natural", true)
        );
        assertEquals(3, Relatorio.contarItensDisponiveis(cardapio));
    }

    @Test
    void deveContarTotalItensCardapio() {
        Cardapio cardapio = new Cardapio(
                new Item("X-Burguer", true),
                new Item("Burguer Vegano", true),
                new Item("Milkshake", false),
                new Item("Suco Natural", true)
        );
        assertEquals(4, Relatorio.contarTotalItens(cardapio));
    }

}
