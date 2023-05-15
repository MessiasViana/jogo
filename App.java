
public class App {
	
	public static void main(String[] args) {
		Livro livro = new Livro("DDD", 100, 4, "Erick Evans");
		Eletronico eletronico = new Eletronico("iPhone", 100, 2, "apple", "14pro");
		Vestuario vestuario =  new Vestuario("Blusinha", 10, 4, "P" , "branca");
		Livro livro2 = new Livro("Refatoração", 120, 12, "Martin Flowler");
				
		ClienteVIP clienteVIP = new ClienteVIP("Joao", "jao@gmail.com", "123.123.123-99");
		ClientePremium clientePremium = new ClientePremium("Pedro", "pedro@gmail.com", "123.123.123-99");
		
		System.out.println(clienteVIP.comprar("Livro", clienteVIP.descontoVIP()));;
		livro.vendido();
		
		System.out.println(clienteVIP.comprar("eletronico", clienteVIP.descontoVIP()));;
		eletronico.vendido();
		
		
		System.out.println(clientePremium.verificarCategoria(
				clientePremium.getNumPontos()
				));
		
		System.out.println(clientePremium.comprar("eletronico", clientePremium.getDesconto()));;
		System.out.println(clientePremium.comprar("eletronico", clientePremium.getDesconto()));;
		
		System.out.println(clientePremium.verificarCategoria(
				clientePremium.getNumPontos()
				));
		
//		System.out.println(livro);
//		System.out.println(eletronico);
//		System.out.println(vestuario);
//		System.out.println(livro2);
//		
//		System.out.println(livro.getPrecoMinimo());
//		System.out.println(eletronico.getPrecoMinimo());
//		System.out.println(vestuario.getPrecoMinimo());
//		
//		System.out.println(Produto.getEstoqueMinimo());
		
	}

}
