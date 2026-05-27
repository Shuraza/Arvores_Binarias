import java.util.LinkedList;
import java.util.Queue;

public class Arvores {
    No raiz;

    public Arvores(Integer valor) {
        this.raiz = new No(valor, null);
    }

    public void posOrdem(No atual) {
        if (atual == null) return;
        posOrdem(atual.filhoEsquerdo);
        posOrdem(atual.filhoDireito);
        System.out.println(atual.valor);
    }

    public void emOrdem() {
        emOrdem(raiz);
    }

    public void emOrdem(No atual) {
        if (atual == null) return;

        emOrdem(atual.filhoEsquerdo);
        System.out.println(atual.valor);
        emOrdem(atual.filhoDireito);
    }

    public void inserir(Integer valor) {
        No pai = buscarPai();
    }

    public No buscarPai() {
            Queue<No> fila = new LinkedList<>();
            fila.add(raiz);

            while (!fila.isEmpty()) {
                No pai = fila.remove();
                if (pai.filhoEsquerdo == null || pai.filhoDireito == null) {
                    return pai;
                }
                fila.add(pai.filhoEsquerdo);
                fila.add(pai.filhoDireito);
            }
            return null;
        }

    public void posOrdem() {
    }
}

