public class No {
    Integer valor;
    No filhoEsquerdo;
    No filhoDireito;
    No pai;

    public No(Integer valor, No pai){
        this.valor = valor;
        this.pai = pai;
        this.filhoDireito = null;
        this.filhoEsquerdo = null;
    }
}
