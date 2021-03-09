package ensembleConteneur;

public class Pet extends Conteneur {	
	
		
	/**Nous allons redéfinir la méthode pour compléter le fait que ce conteneur est un pet**/
	
	public String toString() {
		String str = super.toString();
		str = str + ". Ceci est un pet.";
		
		return str;
	}
	

}
