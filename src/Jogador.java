
public class Jogador {
	private String nome;
	private int camisa;
	private double altura;
	
	public Jogador(String nome, int camisa, double altura) {
		this.nome = nome;
		this.camisa = camisa;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCamisa() {
		return camisa;
	}
	
	public double getAltura() {
		return altura;
	}
}
