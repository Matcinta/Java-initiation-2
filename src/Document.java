
public abstract class Document {

	// variables d'instance: définissent les caractéristiques de note objet
	// Document
	protected String titre;
	protected String auteur;

	// CONSTRUCTEUR: doit porter le même nom que notre classe, soit ici Document
	// on lui passe des parametres
	public Document(String ptitre, String pauteur) {

		// super fait référence aux variables d'instance de la classe mère
		this.titre = ptitre;
		this.auteur = pauteur;
	}

	// ************* ACCESSEURS *************

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	// ************* MUTATEURS *************

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "\nType de document: " + this.getClass() + "\nTitre du document: " + titre + "\nNom de l'auteur: "
				+ auteur;
	}

	public abstract boolean isEmpruntable();

	public abstract float coutDoc();

}