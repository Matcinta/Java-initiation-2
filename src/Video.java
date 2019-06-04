
public final class Video extends Document {

	// variables d'instance définit les caractéristiques propres à notre objet
	// ici Video
	private String typeDeSupport;
	private double coutVideo;

	// CONSTRUCTEUR
	public Video(String ptitre, String pauteur, boolean pemprunt, String ptypeDeSupport, double pcoutVideo) {

		//variables d'instance de la classe mère
		super(ptitre, pauteur, pemprunt);

		//variables d'instance de notre classe courante soit Video
		this.typeDeSupport = ptypeDeSupport;
		this.coutVideo = pcoutVideo;
	}

	// ************* ACCESSEURS *************
	public String getTypeDeSupport() {
		return typeDeSupport;
	}

	// ************* MUTATEURS *************
	public void setTypeDeSupport(String typeDeSupport) {
		this.typeDeSupport = typeDeSupport;

	}

	@Override
	public String toString() {
		return  "Titre du document: " + titre +
				"\nNom de l'auteur: " + auteur +
				"\nEmpruntable: " + emprunt +
				"\nCoût de la vidéo: " + coutVideo + " €";
	}
}
