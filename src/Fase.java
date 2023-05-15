
public class Fase {
	public static void carregar() {
		var guerreiro = new Guerreiro("Leonidas");
		var bolaDeFogo = new BolaDeFogo(20);
		var dragao = new Dragao();
		var mago = new Mago("Gandalf", 100);
		
		
		guerreiro.mover(5, 10);
		bolaDeFogo.mover(10, 5);
		
		
		mago.atacar(guerreiro);
		System.out.println("Vida do guerreiro: " + guerreiro.getHp());
		
		
		guerreiro.atacar(mago);
		System.out.println("Vida do mago: " + mago.getHp());
		
		
		dragao.atacar(guerreiro);
		dragao.atacar(mago);
	}
	
	public static void main(String[] args) {
		carregar();
	}
}
