package ensembleConteneur;


/**Conteneur est une classe abstraite et donc on ajoute ABSTRACT, ainsi la classe conteneur deveint une superclasse 
 * ou classe abstraite et ses m�thodes deviennent des m�thodes abstraites**/
public class Conteneur {
	
	private String marque;
	private String forme;
	

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	/**On veut conna�tre la marque du conteneur ce qui nous servira dans le listing donc on utilisera la m�thode toString**/
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
