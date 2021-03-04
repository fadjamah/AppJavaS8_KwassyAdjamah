package ensembleConteneur;

public class Pet extends Conteneur {	
	
	//ajouter un attribut biodégradable pour savoir si le pet est biodégradable ou pas, 
	//Ceci aidera à expliquer la loi de demeter
	private boolean biodegradable;
		
	/**Nous allons redéfinir la méthode pour compléter le fait que ce conteneur est une gourde**/
	
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
			str = str + " est biodégradable";
		}
		else {
			str = str + "n'est pas diodégradable";
		}
		return str;
	}


}
