package ensembleConteneur;

public final class Gourde extends Conteneur {
	
	private static String couleur;
	private  int prix;


	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		Gourde.couleur = couleur;
	}
	
	/*Ces deux constructeurs ci-dessous pour faire appel à la marque (constructeur dans la classe conteneur 
	 * puis ensuite créée de nouvel objet gourde en ajoutant la couleur et le prix?**/
	
	
	public Gourde (String m){
		super (m);
	}
	
	public Gourde (String m, String couleur, int prix) {
		this(m);
		this.setCouleur(couleur);
		this.setPrix(prix);	
	}
	
	/**Nous allons redéfinir la méthode pour compléter que ce conteneur est une gourde**/
	public String toString() {
		String str = super.toString();
		str = str + " Celle-ci est une gourde.";
		
		return str;
	}
		
	
}
