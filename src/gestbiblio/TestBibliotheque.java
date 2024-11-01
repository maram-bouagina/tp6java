package gestbiblio;

public class TestBibliotheque {

	public static void main(String[] args) {
		biblitheque bib=new biblitheque(100);
		Document docs1=new Document("rapport pfe",2 ,120);
		Document docs2=new Livre ("call me by your name",3,260,"clmburnme","haruki murakami","rebecca yarros");
		Document docs3=new Article("fifth harmony article",23 ,20,"christina lauren","haley pham");
		Document docs4=new Periodique ("les periodes ",30 ,10,"freqence");
		bib.Ajout_doc(docs1);
		bib.Ajout_doc(docs2);
		bib.Ajout_doc(docs3);
		bib.Ajout_doc(docs4);
		System.out.println("Affichage apres ajout");
		
		bib.Inventaire_doc();
		System.out.println("nbredoc "+bib.getNombre_document());
		bib.Supprim_doc(30);
		System.out.println("Affichage apres suppression");
		bib.Inventaire_doc();
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("Le nombre des document dans le tablau est: "+bib.getNombre_document ());
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("la bioblitheque formée seulement des livres");
		bib.liste_livre().Inventaire_doc();
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("la bioblitheque formée seulement d'articles");
		bib.liste_article().Inventaire_doc();
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("la bioblitheque formée seulement des document simples");
		bib.liste_docsimples().Inventaire_doc();
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("la bioblitheque formée seulement des periodiques");
		bib.liste_periodique().Inventaire_doc();
		
		

	}

}
