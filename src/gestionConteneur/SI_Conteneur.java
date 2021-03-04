package gestionConteneur;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.SwingUtilities;

import ensembleConteneur.Conteneur;
import ensembleConteneur.Gourde;
import ensembleConteneur.Pet;
import interfacesGraphiques.PageLogin;


public class SI_Conteneur {

	public static void main(String[] args) {
				
		Conteneur b = new Conteneur ();
		b.setMarque("Cristal.");
		
		System.out.println ("Ce conteneur est de la marque " + b.getMarque());
			
		/*Design pattern Singleton pour n'utiliser qu'un objet Gourde et ne pas instancier d'autres à chaque fois
		 * ainsi on a mis les attribut en static */
		Carton c = Carton.getInstance();
		c.setContient(b);
			
		/**Instanciation des conteneurs et attribution de leurs marques**/
		Conteneur b1 = new Conteneur (); 
		b1.setMarque("Ice.");
		Conteneur b2 = new Conteneur ();	
		b2.setMarque("Yumi.");
			
		/**Ajout des conteneurs dans le carton**/
		c.ajouterConteneur(b1);
		c.ajouterConteneur(b2);
					
		/*Le nombre et la liste de conteneur*/
		c.afficherInfo();
		
		
		/*Instanciation des pets et leur ajout dans le carton
		 * les pets sont considérés comme des conteneurs, il faut les ajouter comme 
		 * conteneur afin de les inclures dans le nombre de conteneur du carton*/
		Pet p1 = new Pet ();
		c.setContient1(p1);
		c.ajouterConteneur(p1);
		c.ajouterPets(p1);
		p1.setMarque("Evians.");
		
		Pet p2 = new Pet ();
		c.setContient1(p2);
		c.ajouterConteneur(p2); 
		c.ajouterPets(p2);
		p2.setMarque("SourceVie.");
		p2.isBiodegradable();
		
		
		/*Instanciation des gourdes et leur ajout dans le carton 
		 * les gourdes sont considérées comme des conteneurs, il faut les ajouter comme 
		 * conteneur afin de les inclures dans le nombre de conteneur du carton
		 * Vu que ma méthode main est en dehors de classe Gourde, je ne peux que utiliser 
		 * getInstance pour avoir accès au constructeur privé de la class Gourde.
		 */
		
		Gourde g = new Gourde ("Heinneez.", " Verte",  -10);
		c.setContient2(g);
		c.ajouterConteneur(g); 
		c.ajouterGourdes(g);
		
		/*Nombre total et liste des conteneurs*/
		c.afficherConteneurTotal();
		
		/*Nombre total de conteneur y compris le nombre de pets et de gourdes*/
		c.afficherQteChaqueConteneur();

		
		//Interface graphique qui va lancer notre application.
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				try {
					PageLogin fenetregraph = new PageLogin();
					fenetregraph.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		
		//Connection à la BDD MySQL
		String url = "jdbc:mysql://localhost:3306/dbconteneur";
		String username = "root";
		String password = "Respect.1";
		
		//Exception pour les exception de connexion à la BDD
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			System.out.println ("Connexion à la base de donnée réussie!");
			
			//insertion des données dans la BDD
			String sql = "INSERT INTO conteneur (Marque, Prix) VALUES (?, ?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "L'eau");
			statement.setInt(2,12);
			
		
			//Le message a afficher si les données sont correctement insérées dans le tableau sinon, renvoyer le message s'erreur.
			int rows = statement.executeUpdate();
			if (rows>0) {
				System.out.println ("-------------------------------------------------------");
				System.out.println("Bravo !!! Votre nouvelle ligne a été insérée avec succès.");
			}
			statement.close();
			connection.close();
			
			
		} catch (SQLException e) {
			System.out.println ("OOPS! Erreur de saisie d'information la base de donnée!");
			e.printStackTrace();
		}
		
}

}

