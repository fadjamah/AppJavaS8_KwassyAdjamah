package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ensembleConteneur.Conteneur;

class ConteneurTest {

	@Test
	void testToString() {
	
			//pour faire un test il nous faut cr�er un object
			Conteneur c = new Conteneur ();
			c.setMarque("Oasis");
			
			/*utiliser assertEquals pour faire des test unitaires qui va v�rifier que quand on appelle la m�thode 
			 * est ce que ca nous retourne notre pr�diction, sinon il nous retourne une erreur*/ 
			
			assertEquals ("   - Un conteneur de marque " + c.getMarque(), c.toString());
			
			
	}

}
