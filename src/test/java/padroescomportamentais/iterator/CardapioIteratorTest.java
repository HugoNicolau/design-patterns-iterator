package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CardapioIteratorTest {

    @Test
    void devePercorrerItensNaOrdem() {
        Cardapio cardapio = new Cardapio(
                new Item("X-Burguer", true),
                new Item("Suco Natural", true)
        );
        Iterator<Item> iterator = cardapio.iterator();
        assertEquals("X-Burguer", iterator.next().getNome());
        assertEquals("Suco Natural", iterator.next().getNome());
        assertFalse(iterator.hasNext());
    }

    @Test
    void deveRetornarExcecaoAposUltimoItem() {
        try {
            Cardapio cardapio = new Cardapio(new Item("X-Burguer", true));
            Iterator<Item> iterator = cardapio.iterator();
            iterator.next();
            iterator.next();
            fail();
        } catch (NoSuchElementException e) {
            assertEquals("Fim do cardápio", e.getMessage());
        }
    }

    @Test
    void naoDeveTerItensEmCardapioVazio() {
        Cardapio cardapio = new Cardapio();
        assertFalse(cardapio.iterator().hasNext());
    }

}
