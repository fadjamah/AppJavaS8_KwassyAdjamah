package gestionConteneur;

import java.util.ArrayList;

import ensembleConteneur.Conteneur;
import ensembleConteneur.Gourde;
import ensembleConteneur.Pet;

public final class Carton {
	
	private static Carton instance; //l'attribut qui stocke l'instance doit être en static.
	
	private ArrayList<Conteneur> conteneurs = new ArrayList<Conteneur> ();
	private ArrayList<Pet> pets = new ArrayList<Pet>();
	private ArrayList<Gourde> gourdes = new ArrayList<Gourde>();
	
	public void ajouterConteneur (Conteneur conteneur) {
		this.conteneurs.add(conteneur);
	}
	
	public ArrayList<Conteneur> getConteneur(){
		return this.conteneurs;
	}
	
	public void ajouterPets (Pet pet) {
		this.pets.add(pet);
	}
	
	public ArrayList<Pet> getPet() {
		return pets;
	}
	
	public void ajouterGourdes (Gourde gourde) {
		this.gourdes.add(gourde);
	}
	
	public ArrayList<Gourde> getGourde() {
		return gourdes;
	}
	
	/**La méthode toString pour connaître le nombre de conteneur dans le carton**/
	public String toString () {
		String str = "Ce carton contient ";
		str = str + this.getConteneur().size() + " conteneurs:"; 
		
		return str;
	}
	
	/**Afficher la liste de conteneur**/
	public void afficherInfo () {
		System.out.println ("--------------------------------------------------");
		System.out.println (this.toString());
		for (int i = 0; i < this.getConteneur().size();  i++) {
			System.out.println(this.getConteneur().get(i));
		}
	}

	public void setContient(Conteneur contient) {
	}

	public void setContient1(Pet contient1) {
	}

	public void setContient2(Gourde contient2) {
	}

	/*La nombre total de conteneur dans le carton*/
	public String toString1 () {
		String str = ("Actuellement Le nombre total de conteneur dans le carton est de " + this.getConteneur().size() + ":");
		
		return str;
	}
	
	public void afficherConteneurTotal () {
		System.out.println ("--------------------------------------------------");
		System.out.println (this.toString1());
		
		/*Les conteneurs avec leur marque*/
		for (int i=0; i<this.getConteneur().size(); i++) {
			System.out.println(this.getConteneur().get(i).toString());			
		}
		
	}
	
	 //Nombre total de conteneur, chaque conteneur avec sa quantité disponible dans le carton.
	public String toString2 () {
		String str = ("Nous disposons d'un total de " + this.getConteneur().size() + " conteneurs dont ");
		
		return str;
	}
	
	
	public void afficherQteChaqueConteneur () {
		System.out.println ("---------------------------------------------------------");
		System.out.println (this.toString2() + this.getPet().size() + " pets et " + this.getGourde().size() + " gourdes.");
		System.out.println ("---------------------------------------------------------");
		
	}
	
	private Carton() {
		//Traitement du constructeur du pattern Singleton
		
	}
	
	public static Carton getInstance() {
		if (instance == null) {
			instance = new Carton(); 
		}
		
		return instance; 
	}

	public void setMarque(String string) {
		
		
	}

	
	
}
