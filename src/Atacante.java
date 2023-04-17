
public class Atacante extends Jogador {
	private int golsMarcados;

	public Atacante(String nome, int camisa, double altura) {
		super(nome, camisa, altura);
	}

	public void chutar() {
		System.out.println("Estou chutando");
	}

}
