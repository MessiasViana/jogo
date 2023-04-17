
public class main {

	public static void main(String[] args) {
		Time time1 = new Time("Palmeiras");
		Time time2 = new Time("PSG");
		
		System.out.println("\nTime: " + time1.getNome() + " vai jogar:");
		time1.jogar();
		
		System.out.println("\nTime: " + time2.getNome() + " vai jogar:");
		time2.jogar();
	}

}
