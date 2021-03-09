package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ensembleConteneur.Conteneur;

class ConteneurTest {

	@Test
	void testToString() {
	
			//pour faire un test il nous faut créer un object
			Conteneur c = new Conteneur ();
			c.setMarque("Oasis");
			
			/*utiliser assertEquals pour faire des test unitaires qui va vérifier que quand on appelle la méthode 
			 * est ce que ca nous retourne notre prédiction, sinon il nous retourne une erreur*/ 
			
			assertEquals ("   - Un conteneur de marque " + c.getMarque(), c.toString());
			
			
	}

}
