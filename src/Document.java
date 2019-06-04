
public abstract class Document {

	// variables d'instance: d�finissent les caract�ristiques de note objet Document
	protected String titre;
	protected String auteur;
	protected boolean emprunt;

	// CONSTRUCTEUR: doit porter le m�me nom que notre classe, soit ici Document
	// on lui passe des parametres
	public Document(String titre, String auteur, boolean emprunt) {

		// super fait r�f�rence aux variables d'instance de la classe m�re
		this.titre = titre;
		this.auteur = auteur;
		this.emprunt = emprunt;
	}

}
