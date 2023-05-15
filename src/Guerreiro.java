
public class Guerreiro extends Jogador {
	public Guerreiro() {
		super();
	}
	
	public Guerreiro(String nome) {
		super(nome);
	}
	
	@Override
	public void mover(int x, int y) {
		System.out.println(String.format("Movendo guerreiro para (%d, %d)", x, y));
		
		setPosX(x);
		setPosY(y);
    }
}
