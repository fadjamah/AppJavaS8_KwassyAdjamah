package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ensembleConteneur.Conteneur;
import ensembleConteneur.Pet;

class ConteneurTest {

	@Test
	void testToString() {
	
			//pour faire un test il faut evidemment créer un object
			Conteneur c = new Conteneur ();
			c.setMarque("Oasis");
			
			/*utiliser assertEquals pour faire des test unitaire qui va vérifier que quand on appelle la méthode 
			 * est ce que ca nous retourne notre prédiction, sinon il nous retourner une erreur
			 * Ci dessous, le Equals va appeler la méthode p2.toString, et si ca correspond au message suivant, le test est correct 
			 * sinon ca va nous renvoyer le message Erreur sur la red...*/ 
			
			assertEquals ("Ce conteneur est de marque " + c.getMarque(), c.toString());
			
			
	}

}
