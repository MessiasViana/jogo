
public class Time {
	private String nome;
	
	Goleiro goleiro = new Goleiro("Cássio", 1, 1.80);
	
	Atacante lateralDireito = new Atacante("Juninho", 2, 1.70);
	Atacante lateralEsquerdo = new Atacante("Pedro", 3, 1.75);
	Atacante meioAtacante = new Atacante("Carlos", 4, 1.80);
	Atacante atacante1 = new Atacante("Messi", 5, 1.81);
	Atacante atacante2 = new Atacante("Fallen", 6, 1.73);
	
	Defensor direitaAtras = new Defensor("Bruno", 7, 1.70);
	Defensor esquerdaAtras = new Defensor("Alanzoka", 8, 1.75);
	Defensor meioDefesa = new Defensor("Chris", 9, 1.80);
	Defensor zagueiro1 = new Defensor("Brown", 10, 1.81);
	Defensor zagueiro2 = new Defensor("Igor do podpah", 11, 1.73);
	
	
	public Time(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void jogar() {
		goleiro.defender();
		
		lateralDireito.chutar();
		lateralEsquerdo.chutar();
		meioAtacante.chutar();
		atacante1.chutar();
		atacante2.chutar();
		
		direitaAtras.marcar();
		esquerdaAtras.marcar();
		meioDefesa.marcar();
		zagueiro1.marcar();
		zagueiro2.marcar();
		
	}

}
