package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ensembleConteneur.Pet;

class PetTest {

	@Test
	void testToString() {
		
		//pour faire un test il faut evidemment créer un object
		Pet p1 = new Pet ();
		p1.setMarque("Evian");
		
		/*utiliser assertEquals pour faire des test unitaire qui va vérifier que quand on appelle la méthode 
		 * est ce que ca nous retourne notre présiction, sinon il nous retourner une erreur*/ 

		assertEquals ("   - Un conteneur de marque " + p1.getMarque() + ". Ceci est un pet.", p1.toString());

	}

}
