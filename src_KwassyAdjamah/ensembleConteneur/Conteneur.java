package ensembleConteneur;


public class Conteneur extends Exception {
	
	private String marque;
	private String forme;


	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	/**la méthode toString pour connaitre la marque du conteneur dans le listing**/
	public String toString () {
		String str = "   - Un conteneur de marque " + this.getMarque();
		
		return str;
	}
	
	public Conteneur () {
	}
	
	public Conteneur (String m) { 
		this.setMarque(m);
		
	}
	
}
