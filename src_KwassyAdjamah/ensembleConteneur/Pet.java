package ensembleConteneur;

public class Pet extends Conteneur {	
	
		
	/**Nous allons red�finir la m�thode pour compl�ter le fait que ce conteneur est un pet**/
	
	public String toString() {
		String str = super.toString();
		str = str + ". Ceci est un pet.";
		
		return str;
	}
	

}
