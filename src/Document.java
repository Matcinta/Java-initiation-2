
public abstract class Document {

	// variables d'instance: définissent les caractéristiques de note objet Document
	protected String titre;
	protected String auteur;
	protected boolean emprunt;

	// CONSTRUCTEUR: doit porter le même nom que notre classe, soit ici Document
	// on lui passe des parametres
	public Document(String titre, String auteur, boolean emprunt) {

		// super fait référence aux variables d'instance de la classe mère
		this.titre = titre;
		this.auteur = auteur;
		this.emprunt = emprunt;
	}

}
