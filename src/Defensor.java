
public class Defensor extends Jogador {
	private int desarmesFeitos;;

	public Defensor(String nome, int camisa, double altura) {
		super(nome, camisa, altura);
	}

	public void marcar() {
		System.out.println("Estou marcando");
	}

}
