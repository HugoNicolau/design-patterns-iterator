package padroescomportamentais.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Iterador concreto: sabe percorrer o array do Cardapio, item por item.
public class CardapioIterator implements Iterator<Item> {

    private Item[] itens;
    private int posicao = 0;

    public CardapioIterator(Item[] itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        return posicao < itens.length;
    }

    @Override
    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Fim do cardápio");
        }
        return itens[posicao++];
    }
}
