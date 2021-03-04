package ensembleConteneur;


/**Conteneur est une classe abstraite et donc on ajoute ABSTRACT, ainsi la classe conteneur deveint une superclasse 
 * ou classe abstraite et ses méthodes deviennent des méthodes abstraites**/
public class Conteneur {
	
	private String marque;
	private String forme;
	

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	/**On veut connaître la marque du conteneur ce qui nous servira dans le listing donc on utilisera la méthode toString**/
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
