import java.util.ArrayList;
import java.util.List;

public class ListaCustomizada {
    private List<Object> lista;

    public ListaCustomizada() {
        lista = new ArrayList<>();
    }

    public Object pesquisarItem(Object item) throws Exception {
        if (!lista.contains(item)) {
            throw new Exception("Erro: O item não foi encontrado na lista.");
        }
        return item;
    }

    public void retirarItemPeloValor(Object valor) throws Exception {
        if (!lista.contains(valor)) {
            throw new Exception("Erro: O valor não está presente na lista.");
        }
        lista.remove(valor);
    }

    public boolean verificarListaVazia() {
        return lista.isEmpty();
    }

    public void inserirAposItem(Object item, int i) throws Exception {
        if (i < 0 || i >= lista.size()) {
            throw new Exception("Erro: Posição inválida.");
        }
        lista.add(i + 1, item);
    }

    public Object retirarItemPorPosicao(int i) throws Exception {
        if (i < 0 || i >= lista.size()) {
            throw new Exception("Erro: Posição inválida.");
        }
        return lista.remove(i);
    }

    public int tamanhoLista() {
        return lista.size();
    }

    public void modificarElemento(int i, Object novoValor) throws Exception {
        if (i < 0 || i >= lista.size()) {
            throw new Exception("Erro: Posição inválida.");
        }
        lista.set(i, novoValor);
    }

    public void adicionarItem(Object item) {
        lista.add(item);
    }

    public void exibirLista() {
        System.out.println(lista);
    }

    public static void main(String[] args) {
        try {
            ListaCustomizada lista = new ListaCustomizada();
            lista.adicionarItem("Item 1");
            lista.adicionarItem("Item 2");
            lista.adicionarItem("Item 3");
            lista.adicionarItem("Item 4");

            lista.exibirLista();

            lista.pesquisarItem("Item 2");
            lista.retirarItemPeloValor("Item 3");
            lista.inserirAposItem("Item 5", 1);
            lista.modificarElemento(0, "Novo Item 1");
            lista.retirarItemPorPosicao(2);

            lista.exibirLista();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
