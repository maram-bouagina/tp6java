package gestbiblio;

public class Periodique extends Document {
			private String freq;

			public Periodique(String titre, int numId, int nbp, String freq) {
				super(titre, numId, nbp); 
				this.freq =freq;
			}
			public String toString() {
					
					return super.toString()+"frequence: "+freq;
			}
		    public void edition() {
				System.out.println(getType());
				System.out.println(this);
				super.edition();
		    }
			public String getFreq() {
				return freq;
			}
			public String getType() {
				return super.getType()+"/"+ "Periodique";
			}
				
}

