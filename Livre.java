package tableaux.compilo1;

public class Livre {
    private String auteur;
    private String titre;

    public Livre() {
    }

    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }

    @Override
    public String toString() {
        return titre+ " by "+auteur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


}
