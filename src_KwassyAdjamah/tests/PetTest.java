package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ensembleConteneur.Pet;

class PetTest {

	@Test
	void testToString() {
		
		//pour faire un test il faut evidemment cr�er un object
		Pet p1 = new Pet ();
		p1.setMarque("Evian");
		
		/*utiliser assertEquals pour faire des test unitaire qui va v�rifier que quand on appelle la m�thode 
		 * est ce que ca nous retourne notre pr�siction, sinon il nous retourner une erreur*/ 

		assertEquals ("   - Un conteneur de marque " + p1.getMarque() + ". Ceci est un pet.", p1.toString());

	}

}
