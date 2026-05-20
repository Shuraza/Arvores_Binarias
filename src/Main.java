public class Main {
    public static void main(String[] args) {
        Arvores<Integer> arvore = new Arvores<>();

        arvore.inserir(10);
        arvore.inserir(20);
        arvore.inserir(30);
        arvore.inserir(40);
        arvore.inserir(50);

        System.out.println("--- TRAVESSIAS ---");

        System.out.print("Pré-Ordem: ");
        arvore.preOrdem();

        System.out.print("Em Ordem: ");
        arvore.emOrdem();

        System.out.print("Pós-Ordem: ");
        arvore.posOrdem();

        System.out.println("\n--- BUSCA BINÁRIA ---");
        int elementoProcurado = 30;
        if (arvore.buscar(elementoProcurado)) {
            System.out.println("O elemento " + elementoProcurado + " foi encontrado na árvore!");
        } else {
            System.out.println("O elemento " + elementoProcurado + " NÃO foi encontrado.");
        }
    }
}