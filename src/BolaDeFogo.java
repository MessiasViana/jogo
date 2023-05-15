
public class BolaDeFogo implements Jogavel{
	private int poder;
	
	
	public BolaDeFogo(int poder) {
		this.poder = poder;
	}
	
	public void atacar(Jogador jogador) {
		jogador.receberDano(this.getPoder());
	}
	
	public int getPoder() {
		return poder;
	}
	
	public void setPoder(int poder) {
		this.poder = poder;
	}

	@Override
	public void mover(int x, int y) {
		System.out.println(String.format("Bola de fogo caindo em: (%d, %d)", x, y));
	}
}
