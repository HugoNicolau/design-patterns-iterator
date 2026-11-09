package padroescomportamentais.iterator;

import java.util.Iterator;

// Agregado: guarda os itens num array, mas só expõe um iterador.
public class Cardapio implements Iterable<Item> {

    private Item[] itens;

    public Cardapio(Item... itens) {
        this.itens = itens;
    }

    @Override
    public Iterator<Item> iterator() {
        return new CardapioIterator(itens);
    }

}
