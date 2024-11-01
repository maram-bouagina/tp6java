package gestbiblio;

public class Article extends Document  {
	private String nom ;
	private String auteur;

	public Article( String titre, int numId, int nbp, String nom, String auteur) {
		super( titre, numId, nbp);
		this.nom = nom;
		this.auteur = auteur;
	}

	public String toString() {
			
			return super.toString()+"nom: "+nom+" auteur: "+auteur;
	}
    /*public void edition() {
		System.out.println(getType());
		System.out.println(this);
    }*/
	public String getNom() {
		return nom;
	} 

	public String getAuteur() {
		return auteur;
	}
	public String getType() {
		return super.getType()+"/"+ "Article";
	}
		
}
