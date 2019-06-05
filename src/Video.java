
public final class Video extends Document {

	// variables d'instance définit les caractéristiques propres à notre objet
	// ici Video

	private TypeDoc typeDoc;

	// CONSTRUCTEUR
	public Video(String ptitre, String pauteur, TypeDoc typeDoc) {

		// variables d'instance de la classe mère
		super(ptitre, pauteur);

		// variables d'instance de notre classe courante soit Video
		this.typeDoc = typeDoc;

	}

	public TypeDoc getTypeDoc() {
		return typeDoc;
	}

	public void setTypeDoc(TypeDoc typeDoc) {
		this.typeDoc = typeDoc;
	}

	// ************* ACCESSEURS *************

	// ************* MUTATEURS *************

	@Override
	public String toString() {
		return "\nType de document: " + this.getClass() + "\nTitre du document: " + titre + "\nNom de l'auteur: "
				+ auteur + "\nCoût de la vidéo: " + this.coutDoc() + " €";
	}

	@Override
	public boolean isEmpruntable() {
		return true;
	}

	@Override
	public float coutDoc() {
		return 70;
	}
}
