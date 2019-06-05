
public class Periodique extends Livre {

	private int numPeriodique;

	public Periodique(String ptitre, String pauteur, int pnbPages, int pnumPeriodique) {
		super(ptitre, pauteur, pnbPages);
		this.numPeriodique = pnumPeriodique;
	}

	public int getNumPeriodique() {
		return numPeriodique;
	}

	public void setNumPeriodique(int numPeriodique) {
		this.numPeriodique = numPeriodique;
	}

	@Override
	public boolean isEmpruntable() {
		return false;
	}
}
