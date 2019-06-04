
public class Test {

	public static void main(String[] args) {

		Livre livre = new Livre("Les trois petits cochons", "Flaubert", true, 25);
		Video video = new Video("La cité de la peur", "Les Nuls", true, "DVD", 70);
		Periodique periodique = new Periodique("Science", "A. Einstein", false, 356, 8);

		System.out.println(livre);
		System.out.println("Coût du livre: "+ livre.coutLivre()+ " €\n");

		System.out.println(video+"\n");

		System.out.println(periodique);
		System.out.println("Coût du périodique: "+ periodique.coutLivre()+ " €\n");


	}

}
