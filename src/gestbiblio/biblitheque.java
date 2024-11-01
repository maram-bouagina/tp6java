package gestbiblio;

public class biblitheque {
			 private int capacite;
			 private Document[] Listdoc;
			 private int nb=0; //nbre de documetn ajoutés dans la bibliotheque.
			public biblitheque(int capacite) {
				this.capacite = capacite;
				Listdoc =new Document [capacite];
			}
			public int getCapacite() {
				return capacite;
			}
 
			public void Ajout_doc(Document d) {
				if(nb<capacite) {
					if(nb==0){ 
						Listdoc[nb]=d;
					} 
					else {
						int i=0;
						while(i<nb && d.getNumId()>=Listdoc[i].getNumId()) {
							i++;
						}
						for(int j=nb;j>i;j--) {
							Listdoc[j]=Listdoc[j-1];
						}
						Listdoc[i]=d;
					}
					System.out.println(Listdoc[nb].getClass());

					nb++;
				}
				else {
					System.out.println("Ajout impossible");
				}
				}
		
			public void Supprim_doc (int num) {
				int i=0;
				while(i<nb && num!=Listdoc[i].getNumId()) {
					i++;
				}
				if(i==nb) {
					System.out.println("rien à effacer");
				}
				else {
					for(int j=i;j<nb;j++) {
						Listdoc[j]=Listdoc[j+1];
					}
					nb--;
				}
			}
			public void  Inventaire_doc ( ) {
				for(int i=0;i<nb;i++) {
						Listdoc[i].edition();
					
				}
			}
			public int  getNombre_document (){
				return nb;
				
				
			}

			 public biblitheque liste_livre () {
				 biblitheque biblio1 =new biblitheque(capacite) ;
					for(int i=0;i<nb;i++) {
						if((Listdoc[i] instanceof Livre)) {
								biblio1.Ajout_doc(Listdoc[i]);
						}
					}
					return biblio1;
				}
			 public biblitheque liste_article () {
				 biblitheque biblio2 =new biblitheque(capacite) ;
					for(int i=0;i<nb;i++) {
						if((Listdoc[i] instanceof Article )&&!(Listdoc[i] instanceof Livre )) {
								biblio2.Ajout_doc(Listdoc[i]);
						}
					}
					return biblio2;
				}
			 public biblitheque liste_docsimples () {
				 biblitheque biblio2 =new biblitheque(capacite) ;
					for(int i=0;i<nb;i++) {
						if(!(Listdoc[i] instanceof Article)&&!(Listdoc[i] instanceof Periodique) ) {
								biblio2.Ajout_doc(Listdoc[i]);
						}
					}
					return biblio2;
				}
			 public biblitheque liste_periodique () { 
				 biblitheque biblio2 =new biblitheque(capacite) ;
					for(int i=0;i<nb;i++) {
						if((Listdoc[i] instanceof Periodique) ) {
								biblio2.Ajout_doc(Listdoc[i]);
						}
					}
					return biblio2;
				}
			
			
			 
}
