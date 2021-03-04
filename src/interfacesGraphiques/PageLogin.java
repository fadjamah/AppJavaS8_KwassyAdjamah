package interfacesGraphiques;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public final class PageLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField_1;

	
	/**
	 * Create the frame.
	 */
	public PageLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(450, 28, 296, 63);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(450, 89, 296, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Utilisateur:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(449, 105, 174, 30);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField.setBounds(449, 139, 296, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel passwordField = new JLabel("Mot de passe :");
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		passwordField.setBounds(449, 203, 174, 37);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordField_1.setBounds(449, 241, 296, 48);
		contentPane.add(passwordField_1);
		
		/*un lien en cas d'oublie de mot de passe ou de nom d'utilisateur*/
		JLabel hyperlink = new JLabel("Mot de passe oublié? Je réinitialise mon mot de passe ici");
		hyperlink.setForeground(Color.BLUE.darker());
		hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hyperlink.addMouseListener(new MouseAdapter() {
			 
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        // the user clicks on the label
		    }
		 
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        // the mouse has entered the label
		    }
		 
		    @Override
		    public void mouseExited(MouseEvent e) {
		        // the mouse has exited the label
		    }
		});
		
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(450, 373, 155, 37);
		contentPane.add(btnNewButton);
		
		JLabel oubliemp = new JLabel("- Mot de pass oublié? Je le réinitialise ici.");
		oubliemp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		oubliemp.setForeground(Color.BLUE.darker());
		oubliemp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		oubliemp.setText("<html><a href=''>- Mot de pass oublié? Je le réinitialise ici.</a></html>");
		oubliemp.setText("- Mot de pass oublié? Je le réinitialise ici.");
		oubliemp.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				  try {
				         
				        Desktop.getDesktop().browse(new URI("https://cas-uds.grenet.fr/login?service=https%3A%2F%2Fintranet.univ-smb.fr%2F")); //URL fictive de renew de mp
				         
				    } catch (IOException | URISyntaxException e1) {
				        e1.printStackTrace();
				    }
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			        // the mouse has entered the label
			}
			 
			@Override
			public void mouseExited(MouseEvent e) {
			        // the mouse has exited the label
			}
			
		});
		
		oubliemp.setBounds(450, 333, 296, 20);
		contentPane.add(oubliemp);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(400, 89, 7, 368);
		contentPane.add(separator_1);
		
		JLabel icone = new JLabel("nouvell icone");
		ImageIcon img = new ImageIcon (this.getClass().getResource("/loginicone.png"));
		icone.setIcon(img);
		icone.setBounds(29, 95, 356, 344);
		contentPane.add(icone);
			
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { 
				
				try {
					String utilisateur = textField.getText();
					String motdepasse = passwordField.getText();
					
					if (motdepasse.contains("passe") && utilisateur.contains("moncompte")) {
						
						textField.setText(null);
						passwordField.setText(null);
						
						InterfaceSI_Conteneur.main(null); //Aller sur l'intergace graphique de la méthode main du SI_conteneur.
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Nom d'utilisateur ou mot de passe invalide. Veuillez réessayer!", "Ooooops Erreur! ", JOptionPane.ERROR_MESSAGE);
						textField.setText(null);
						passwordField.setText(null);
						
					}
					
					
				} catch (Exception e1) {
					
					System.out.print(e1);
					
				}
				
			}
			
		});
		
		
		
	}
}
