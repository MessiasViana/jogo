
public class Goleiro extends Jogador {
	private int defesasRealizadas;
	
	
	public Goleiro(String nome, int camisa, double altura) {
		super(nome, camisa, altura);
	}
	
	
	public void defender() {
		System.out.println("Estou defendendo");
	}

}
