public class Main{
    public static void main(String[] args) {
        Arvores arvores = new Arvores(4);
        arvores.inserir(3);
        arvores.inserir(2);
        arvores.inserir(1);
        arvores.inserir(5);
        arvores.posOrdem();
        arvores.emOrdem();
    }
}
