public abstract class Livro {
     String nome;
     String descricao;
     double valor;
     String isbn; // identificação do livro
     private Autor autor;
     
     public Livro(String nome, String descricao, Double valor, String isbn, Autor autor) {
    	 this.nome = nome;
    	 this.descricao = descricao;
    	 this.valor = valor;
    	 this.isbn = isbn;
    	 this.autor = autor;
     };
     
     public void mostrarDetalhes() {
    	 System.out.println("Nome: "+nome);
    	 System.out.println("Descrição: "+descricao);
    	 System.out.println("Valor: "+valor);
    	 System.out.println("ISBN: "+isbn);
    	 System.out.println("Autor: "+autor);
     };
    
     public abstract boolean aplicaDescontoDe(double porcentagem);
        
   
}
