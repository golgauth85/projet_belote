// Classe Carte
class Carte {
    private int id;
    private String couleur;
    private boolean isAtout;

    public Carte(int id, String couleur, boolean isAtout) {
        this.id = id;
        this.couleur = couleur;
        this.isAtout = isAtout;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public boolean isAtout() {
        return isAtout;
    }

    public void setAtout(boolean atout) {
        isAtout = atout;
    }
}

// Sous-classe Tête
class Tete extends Carte {
    private String nom;

    public Tete(int id, String couleur, boolean isAtout, String nom) {
        super(id, couleur, isAtout);
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

// Sous-classe Numéro
class Numero extends Carte {
    private int valeur;

    public Numero(int id, String couleur, boolean isAtout, int valeur) {
        super(id, couleur, isAtout);
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
