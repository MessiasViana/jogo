
public class App {

	public static void main(String[] args) {
		var fase = new Fase();
		
		var guerreiro = new Guerreiro("Leonidas");
		fase.carregar(guerreiro);
		
		var bolaDeFogo = new BolaDeFogo(20);
		fase.carregar(bolaDeFogo);
		
		var dragao = new Dragao();
		fase.carregar(dragao);
		
		var mago = new Mago("Gandalf", 100);
		fase.carregar(mago);
		
		
		guerreiro.mover(5, 10);
		bolaDeFogo.mover(10, 5);
		
		
		mago.atacar(guerreiro);
		System.out.println("Vida do guerreiro: " + guerreiro.getHp());
		
		
		guerreiro.atacar(mago);
		System.out.println("Vida do mago: " + mago.getHp());
		
		
		dragao.atacar(guerreiro);
		dragao.atacar(mago);
	}

}
