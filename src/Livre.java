public class Livre extends Document {

    protected int nbPages;

    //CONSTRUCTEUR
    public Livre(String ptitre, String pauteur, boolean pemprunt, int pnbPages) {
        super(ptitre, pauteur, pemprunt);
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

    public double coutLivre(){
        return this.getNbPages() * 0.5;
    }
}
