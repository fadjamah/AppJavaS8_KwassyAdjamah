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
			
		/*Design pattern Singleton pour n'utiliser qu'un objet carton et ne pas instancier d'autres � chaque fois
		 */
		Carton.getInstance();
		Carton.getInstance().setContient(b);
			
		/**Instanciation des conteneurs avec leurs marques**/
		
		Conteneur b1 = new Conteneur (); 
		b1.setMarque("Ice.");
		Conteneur b2 = new Conteneur ();	
		b2.setMarque("Yumi.");
			
		/**Ajout des conteneurs dans le carton**/
		Carton.getInstance().ajouterConteneur(b1);
		Carton.getInstance().ajouterConteneur(b2);
					
		/*Le nombre et la liste de conteneur*/
		Carton.getInstance().afficherInfo();
		
		
		/*Instanciation des pets, cartons et leur ajout dans le carton
		 * les pets sont consid�r�s comme des conteneurs, il faut les ajouter comme 
		 * conteneur afin de les inclures dans le nombre de conteneur du carton*/
		Pet p1 = new Pet ();
		Carton.getInstance().setContient1(p1);
		Carton.getInstance().ajouterConteneur(p1);
		Carton.getInstance().ajouterPets(p1);
		p1.setMarque("Evians.");
		
		Pet p2 = new Pet ();
		Carton.getInstance().setContient1(p2);
		Carton.getInstance().ajouterConteneur(p2); 
		Carton.getInstance().ajouterPets(p2);
		p2.setMarque("SourceVie.");
		
		Gourde g = new Gourde ("Heinneez.", " Verte",  10);
		Carton.getInstance().setContient2(g);
		Carton.getInstance().ajouterConteneur(g); 
		Carton.getInstance().ajouterGourdes(g);
		
		/*Nombre total et liste des conteneurs*/
		Carton.getInstance().afficherConteneurTotal();
		
		/*Nombre total de conteneur y compris le nombre de pets et de gourdes*/
		Carton.getInstance().afficherQteChaqueConteneur();

		
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

		
		//Connection � la BDD MySQL
		String url = "jdbc:mysql://localhost:3306/dbconteneur";
		String username = "root";
		String password = "Respect.1";
		
		//Exception pour les erreurs de connexion � la BDD
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			System.out.println ("Connexion � la base de donn�e r�ussie!");
			
			//insertion des donn�es dans la BDD
			String sql = "INSERT INTO conteneur (Marque, Prix) VALUES (?, ?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "L'eau");
			statement.setInt(2,12);
			
		
			//Le message a afficher si les donn�es sont correctement ins�r�es dans le tableau sinon, renvoyer le message s'erreur.
			int rows = statement.executeUpdate();
			if (rows>0) {
				System.out.println ("-------------------------------------------------------");
				System.out.println("Bravo !!! Votre nouvelle ligne a �t� ins�r�e avec succ�s.");
			}
			statement.close();
			connection.close();
			
			
		} catch (SQLException e) {
			System.out.println ("OOPS! Erreur de saisie d'information la base de donn�e!");
			e.printStackTrace();
		}
		
		
		
}

}

