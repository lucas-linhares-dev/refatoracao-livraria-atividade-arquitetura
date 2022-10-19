
public class LivroDigital extends Livro {
	
	private String marcaDagua;
	
	public LivroDigital(String nome, String descricao, Double valor, String isbn, Autor autor, String marcaDagua) {
		super(nome, descricao, valor, isbn, autor);
		this.marcaDagua = marcaDagua;
	}


	
	public void mostrarDetalhes() {
		super.mostrarDetalhes();
		System.out.println("Marca D'água: "+marcaDagua);
	}

	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		else {
			valor -= valor*porcentagem;
			return true;
		}
	}
	
}
