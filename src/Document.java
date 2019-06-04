
public abstract class Document {

    // variables d'instance: définissent les caractéristiques de note objet Document
    protected String titre;
    protected String auteur;
    protected boolean emprunt;

    // CONSTRUCTEUR: doit porter le même nom que notre classe, soit ici Document
    // on lui passe des parametres
    public Document(String ptitre, String pauteur, boolean pemprunt) {

        // super fait référence aux variables d'instance de la classe m�re
        this.titre = ptitre;
        this.auteur = pauteur;
        this.emprunt = pemprunt;
    }

    // ************* ACCESSEURS *************


    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean isEmprunt() {
        return emprunt;
    }

    // ************* MUTATEURS *************


    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setEmprunt(boolean emprunt) {
        this.emprunt = emprunt;
    }


    @Override
    public String toString() {
        return  "Titre du document: " + titre +
                "\nNom de l'auteur: " + auteur +
                "\nEmpruntable: " + emprunt;
    }
}
