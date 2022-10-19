
public class LivroImpresso extends Livro {

	private Double taxaImpressao;
	private boolean pocket;
	
	
	public LivroImpresso(String nome, String descricao, Double valor, String isbn, Autor autor, Double taxaImpressao
			,boolean pocket) {
	    super(nome, descricao, valor, isbn, autor);
		this.taxaImpressao = taxaImpressao;
		this.pocket = pocket;
	}

	
	public void mostrarDetalhes() {
		super.mostrarDetalhes();
		System.out.println("Taxa de impressão: "+taxaImpressao);
		System.out.println("Pocket: "+pocket);
	}


	public boolean aplicaDescontoDe(double porcentagem) {
		if(pocket) {
			return false;
		}
		else if(porcentagem > 0.3) {
			return false;
		}
		else {
			valor -= valor*porcentagem;
			return true;
		}
		
	}
	
	public double getValorImpressao() {
		return valor*taxaImpressao;
	}
}
