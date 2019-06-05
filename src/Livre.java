public class Livre extends Document {

	protected boolean emprunt;
	protected int nbPages;

	// CONSTRUCTEUR
	public Livre(String ptitre, String pauteur, int pnbPages) {
		super(ptitre, pauteur);
		this.nbPages = pnbPages;
	}

	// GETTER
	public int getNbPages() {
		return nbPages;
	}

	// SETTER
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	@Override
	public boolean isEmpruntable() {
		return true;
	}

	@Override
	public float coutDoc() {
		return this.getNbPages() * 0.5f;
	}
}
