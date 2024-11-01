package gestbiblio;

public class Document {
		private String titre;
		private int numId;
		private int nbp;
		
		public Document(String titre, int numId, int nbp) {
			
			this.titre = titre;
			this.numId = numId;
			this.nbp = nbp;
		} 
		public String toString() {
			return "titre: "+titre+" numéroId: "+numId+" nbre des pages: "+nbp;
		}
		public void edition() {
			System.out.println(getType());
			System.out.println(this);
			
		}
		public String getTitre() {
			return titre;
		}
		public int getNumId() {
			return numId;
		}
		public int getNbp() {
			return nbp;
		}
		
		public String getType() {
			return "Document";
		}
}
