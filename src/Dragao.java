
public class Dragao implements Jogavel{
	private int xp = 75;
	private int hp = 150;
	private int poder;
	private int posX = 0;
	private int posY = 0;
	
	public void ganharExperiencia(int pontos) {
		xp += pontos;		
	}
	
	public void atacar(Jogador jogador) {
		jogador.receberDano(this.getXp());
	}
	
	private boolean foiDerrotado() {
		return hp <= 0;
	}
	
	public void receberDano(int pontos) {
		hp -= pontos;
		if(foiDerrotado()) {
			System.out.println("Dragão derrotado");
		}
	}

	@Override
	public void mover(int x, int y) {
		System.out.println(String.format("Dragão indo para (%d, %d)", x, y));
		this.posX = x;
		this.posY = y;
	}
	

	public int getPosX() {
		return posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public int getPoder() {
		return poder;
	}
	
	public int getXp() {
		return xp;
	}
	
	public void setPoder(int poder) {
		this.poder = poder;
	}
	
}
