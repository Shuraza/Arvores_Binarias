import java.util.LinkedList;
import java.util.Queue;

public class Arvores<T extends Comparable<T>> {
    private No<T> raiz;

    public Arvores() {
        this.raiz = null;
    }

    public void inserir(T dado) {
        No<T> novoNo = new No<>(dado);
        if (raiz == null) {
            raiz = novoNo;
            return;
        }

        Queue<No<T>> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No<T> atual = fila.poll();

            if (atual.getEsquerdo() == null) {
                atual.setEsquerdo(novoNo);
                return;
            } else {
                fila.add(atual.getEsquerdo());
            }

            if (atual.getDireito() == null) {
                atual.setDireito(novoNo);
                return;
            } else {
                fila.add(atual.getDireito());
            }
        }
    }

    public boolean buscar(T dado) {
        return buscarRecursivo(raiz, dado);
    }

    private boolean buscarRecursivo(No<T> atual, T dado) {
        if (atual == null) return false;
        if (atual.getDado().compareTo(dado) == 0) return true;

        return buscarRecursivo(atual.getEsquerdo(), dado) || buscarRecursivo(atual.getDireito(), dado);
    }

    public void preOrdem() {
        preOrdemRecursivo(raiz);
        System.out.println();
    }

    private void preOrdemRecursivo(No<T> no) {
        if (no != null) {
            System.out.print(no.getDado() + " ");
            preOrdemRecursivo(no.getEsquerdo());
            preOrdemRecursivo(no.getDireito());
        }
    }

    public void emOrdem() {
        emOrdemRecursivo(raiz);
        System.out.println();
    }

    private void emOrdemRecursivo(No<T> no) {
        if (no != null) {
            emOrdemRecursivo(no.getEsquerdo());
            System.out.print(no.getDado() + " ");
            emOrdemRecursivo(no.getDireito());
        }
    }

    public void posOrdem() {
        posOrdemRecursivo(raiz);
        System.out.println();
    }

    private void posOrdemRecursivo(No<T> no) {
        if (no != null) {
            posOrdemRecursivo(no.getEsquerdo());
            posOrdemRecursivo(no.getDireito());
            System.out.print(no.getDado() + " ");
        }
    }
}