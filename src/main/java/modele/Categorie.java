package modele;

public class Categorie {
	
	private String nom;
	
	public Categorie() {}

	public Categorie(String nom) {
		super();
		this.nom = nom;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	@Override
	public String toString() {
		return "Categorie [nom=" + nom + "]";
	}
	
	

}
