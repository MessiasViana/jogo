
public class Mago extends Jogador implements Jogavel{
	private int mp;
	
	public Mago() {
		super();
	}
	
	public Mago(String nome, int mp) {
		super(nome);
		this.mp = mp;
	}
	
	@Override
	public void mover(int x, int y) {
		System.out.println(String.format("Movendo mago para (%d, %d)", x, y));
		
		setPosX(x);
		setPosY(y);
    }
	
	public int getMp() {
		return mp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
}
