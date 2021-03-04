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
		 * est ce que ca nous retourne notre pr�siction, sinon il nous retourner une erreur
		 * Ci dessous, le Equals va appeler la m�thode p2.toString, et si ca correspond au message suivant, le test est correct 
		 * sinon ca va nous renvoyer le message Erreur sur la red...*/ 

		assertEquals ("Ce conteneur est de marque " + p1.getMarque() + " C'est un pet.", p1.toString());

	}

}
