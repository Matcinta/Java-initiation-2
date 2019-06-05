
public class Bibliotheque {

	private Document[] documents;

	// ****** CONSTRUCTEURS ******

	public Bibliotheque() {
		this.documents = new Document[100];

	}

	// ******** GETTER ******

	public Document[] getDocuments() {
		return documents;
	}

	// ****** SETTER ******

	public void setDocuments(Document[] documents) {
		this.documents = documents;
	}

	// Ajoute un document dans la bibliotheque

	public void ajouter(Document document) {

		for (int i = 0; i < documents.length; i++) {

			// Si la case est null, c'est que la case est disponible
			if (documents[i] == null) {
				documents[i] = document;
				break;
			}
		}
	}

	// Affiche les documents de la bibliotheque

	public void afficher() {
		for (int i = 0; i < documents.length; i++) {
			if (documents[i] == null) {
				break;
			}
			System.out.println(documents[i]);

		}
	}

	// Compte le nombre de documents dans la bibliotheque
	public int getNbDocuments() {
		int sum = 0;
		for (int i = 0; i < documents.length; i++) {
			if (documents[i] != null) {
				sum++;
			}

		}
		return sum;
	}

	// Compte le nombre de Vidéos dans la bibliotheque selon leur type

	public int compteurDVD() {
		int sum = 0;
		for (int i = 0; i < documents.length; i++) {
			if (documents[i] != null && documents[i] instanceof Video) {
				if (((Video) documents[i]).getTypeDoc() == TypeDoc.DVD) {
					sum++;
				}

			}
		}
		return sum;
	}

}
