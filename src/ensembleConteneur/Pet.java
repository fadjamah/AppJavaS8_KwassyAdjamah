package ensembleConteneur;

public class Pet extends Conteneur {	
	
	//ajouter un attribut biod�gradable pour savoir si le pet est biod�gradable ou pas, 
	//Ceci aidera � expliquer la loi de demeter
	private boolean biodegradable;
		
	/**Nous allons red�finir la m�thode pour compl�ter le fait que ce conteneur est une gourde**/
	
	public String toString() {
		String str = super.toString();
		str = str + " Ceci est un pet.";
		
		return str;
	}

	public boolean isBiodegradable() {
		return biodegradable;
	}

	public void setBiodegradable(boolean biodegradable) {
		this.biodegradable = biodegradable;
	}
	
	public String  toString1 () {
		String str ;
		str = "Ce pet de marque " + this.getMarque() ;
		if (this.isBiodegradable()) {
			str = str + " est biod�gradable";
		}
		else {
			str = str + "n'est pas diod�gradable";
		}
		return str;
	}


}
