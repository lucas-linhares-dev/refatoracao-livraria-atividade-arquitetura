public class CarrinhoCompra {
    double total;

    void adiciona(Livro livro){
        total += livro.valor;
        System.out.println("Adicionado " + livro.nome);
    }

}
