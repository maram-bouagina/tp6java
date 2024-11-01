package gestbiblio;

public class Livre extends Article {
		private String nomed;

		public Livre( String titre, int numId, int nbp, String nom, String auteur, String nomed) {
			super(titre, numId, nbp, nom, auteur);
			this.nomed = nomed;
		}

		public String toString() {
			return super.toString() + "nomed: "+nomed;
		}
		public void edition() {
			System.out.println(getType());
			System.out.println(this);
		}
		public String getNomed() {
			return nomed;
		}
	
		public String getType() {
			return super.getType()+"/ Livre";
		}
		
}
 