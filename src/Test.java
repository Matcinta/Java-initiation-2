
public class Test {

	public static void main(String[] args) {

		// Creation de documents objet Livre

		Livre livre1 = new Livre("Les trois petits cochons", "Flaubert", 25);

		// Creation de documents objet Video

		Video video1 = new Video("La cité de la peur", "Les Nuls", TypeDoc.DVD);
		Video video2 = new Video("Rrrrrr", "A. Chabat", TypeDoc.BlueRay);
		Video video3 = new Video("La ruée vers l'or", "C. Chaplin", TypeDoc.VHS);

		// Creation de documents objet Periodique

		Periodique periodique1 = new Periodique("Science", "A. Einstein", 356, 8);

		System.out.println(livre1);
		System.out.println("Coût du livre: " + livre1.coutDoc() + " €\n");
		System.out.println(livre1.isEmpruntable());

		System.out.println(video1 + "\n");
		System.out.println(video1.isEmpruntable());

		System.out.println(periodique1);
		System.out.println("Coût du périodique: " + periodique1.coutDoc() + " €\n");
		System.out.println(periodique1.isEmpruntable());

		// Creation d'une bibliotheque

		Bibliotheque bibliotheque = new Bibliotheque();

		// Ajout de documents dans la bibliotheque

		bibliotheque.ajouter(livre1);
		bibliotheque.ajouter(video1);
		bibliotheque.ajouter(video2);
		bibliotheque.ajouter(video3);

		// Affiche le contenu de la bibliothèque

		bibliotheque.afficher();

		// Affiche le nombre de Video présentes dans la bibliotheque

		System.out.println("\nLe nombre de DVD est de: " + bibliotheque.compteurDVD());

	}

}
