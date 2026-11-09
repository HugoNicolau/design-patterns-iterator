package padroescomportamentais.iterator;

import java.util.Iterator;

public class Relatorio {

    public static Integer contarItensDisponiveis(Cardapio cardapio) {
        int quantidade = 0;
        for (Item item : cardapio) {
            if (item.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalItens(Cardapio cardapio) {
        int quantidade = 0;
        for (Iterator<Item> i = cardapio.iterator(); i.hasNext(); ) {
            quantidade++;
            i.next();
        }
        return quantidade;
    }

}
