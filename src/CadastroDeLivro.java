public class CadastroDeLivro {

    public static void main(String[] args) {
    	
    	Autor Leandro = new Autor("Leandro", "leandro@gmai.com", "99999999");
    	
    	
    	// Livro impresso - Sem ser Pocket - Valor 129,90
    	
        LivroImpresso livro1 = new LivroImpresso("Programação orientada a objetos", "Livro para aprender POO",
        		129.90, "1223344345", Leandro, 0.5, false);
        

        
        // Livro impresso Pocket - Valor 59,90
        
        LivroImpresso livro2 = new LivroImpresso("Logica de programação", "Livro para iniciantes na programação",
        		59.90, "232434534", Leandro, 0.5, true);
        

        
        // Livro digital - valor 39,90
        
        LivroDigital livro3 = new LivroDigital("Desenvolvimento Web", "Livro para desenvolvimento Web",
        		39.90, "45454534", Leandro, "111111");
        

        CarrinhoCompra carrinho = new CarrinhoCompra();
        carrinho.adiciona(livro1);
        carrinho.adiciona(livro2);
        carrinho.adiciona(livro3);

        System.out.println(carrinho.total);


    }
}
